import java.util.ArrayList;

/**
 * Time Complexity: O(n^2)
 */
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

    void inOrder(Node root) {
        if(root == null) return ;

        inOrder(root.left);
        System.out.print(root.data+"  ");
        inOrder(root.right);
    }


    // Merge both tree
    static ArrayList<Integer> a = new ArrayList<>();
    void retrieveInorder(Node root){
        if(root == null) return;

        retrieveInorder(root.left);
        a.add(root.data);
        retrieveInorder(root.right);
    }
    Node mergeBST(Node root1, Node root2) {
        Node root = null;

        // insert both tree items into array
        retrieveInorder(root1);
        retrieveInorder(root2);

        // Insert array items into BST
        for(int i=0;i<a.size();i++)
            root = insert(root, a.get(i));

        return root;
    }



}


public class Main {

    public static void main(String[] args) {

        Node root1 = null;
        Node root2 = null;
        binarySearchTree bst = new binarySearchTree();

        // Create first tree
        int item = 1;
        for(int i=0;i<3;i++) {
            root1 = bst.insert(root1, item);
            item++;
        }
        // Create second tree
        for(int i=0;i<3;i++) {
            root2 = bst.insert(root2, item);
            item++;
        }

        // Merge both tree
        Node root = null;
        root = bst.mergeBST(root1, root2);

        // Print merged tree
        bst.inOrder(root);

    }
}
