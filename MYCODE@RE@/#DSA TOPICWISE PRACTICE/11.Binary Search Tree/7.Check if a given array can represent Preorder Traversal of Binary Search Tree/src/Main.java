import java.util.ArrayList;
import java.util.Arrays;

class Node {
    int data;
    Node left;
    Node right;

    Node(int item) {
        data = item;
    }
}

class binarySearchTree {

    Node insert(Node root, int item) {
        Node temp = new Node(item);
        if(root == null) {
            System.out.println(temp.data+" is inserted.");
            root = temp;
            return root;
        }

        Node cur,prev;
        cur = root;
        prev = null;
        while(cur != null) {
            prev = cur;
            if(temp.data <= cur.data)
                cur = cur.left;
            else
                cur = cur.right;
        }

        if(temp.data <= prev.data)
            prev.left = temp;
        else
            prev.right = temp;

        System.out.println(temp.data+" is inserted.");
        return root;
    }


    void preOrder(Node root, ArrayList<Integer> cmp){
        if(root == null) return;

        cmp.add(root.data);
        preOrder(root.left, cmp);
        preOrder(root.right, cmp);
    }

}


public class Main {

    public static void main(String[] args) {

        Node root = null;
        binarySearchTree bst = new binarySearchTree();

        int[] arr = {40, 30, 35, 20, 80, 100};  // {40, 30, 35, 80, 100};
        ArrayList<Integer> cmp = new ArrayList<>();

        // Create BST using array elements
        for(int i=0;i<arr.length;i++) {
            root = bst.insert(root, arr[i]);
        }

        // Store level order traversal element in array 'cmp'
        bst.preOrder(root,cmp);


        // Compare both arrays to verify that they array elements can represent level order bst.
        for (int i=0;i<arr.length;i++){
            if (arr[i] != cmp.get(i)){
                System.out.println("Given array cannot represent pre-order traversal");
                return;
            }
        }
        System.out.println("Given array can be represented pre-order traversal");

    }
}
