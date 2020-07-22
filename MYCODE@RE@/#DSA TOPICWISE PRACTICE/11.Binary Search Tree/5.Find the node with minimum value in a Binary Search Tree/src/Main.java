import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter item:");
        data =s.nextInt();
    }
}

class binarySearchTree {

    Node insert(Node root) {
        Node temp = new Node();
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

    // Find min
    static int min = Integer.MAX_VALUE;
    void minUsingInorder(Node root) {
        if(root == null) return ;

        minUsingInorder(root.left);
        if (min > root.data)
            min = root.data;
        minUsingInorder(root.right);
    }



}


public class Main {

    public static void main(String[] args) {

        Node root = null;
        binarySearchTree bst = new binarySearchTree();

        root = bst.insert(root);
        root = bst.insert(root);
        root = bst.insert(root);
        root = bst.insert(root);
        root = bst.insert(root);

        bst.minUsingInorder(root);
        System.out.println("\nMin item is:  "+bst.min);

    }
}
