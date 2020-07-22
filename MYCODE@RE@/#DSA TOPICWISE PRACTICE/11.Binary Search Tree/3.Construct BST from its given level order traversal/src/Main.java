import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int item){
        data = item;
    }
}

class binarySearchTree {

    void inOrder(Node root) {
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.data+"  ");
        inOrder(root.right);
    }


    // Construct BST from level order traversal
    Node LevelOrder(Node root , int item) {
        // Create node
        Node temp = new Node(item);

        // Insert first time in BST
        if(root == null) {
            return temp;
        }

        // Insert after first time in BST
        if(item <= root.data)
            root.left = LevelOrder(root.left, item);
        else
            root.right = LevelOrder(root.right, item);
        return root;
    }

    Node constructBst(Node root, int[] arr, int n) {
        if(n == 0)  return null;
        
        for(int i = 0; i < n; i++)
            root = LevelOrder(root , arr[i]);

        return root;
    }


}


public class Main {
    public static void main(String[] args) {

        Node root = null;
        binarySearchTree bst = new binarySearchTree();

        int[] arr = {7, 4, 12, 3, 6, 8, 1, 5, 10};
        int n = arr.length;

        root = bst.constructBst(root, arr, n);

        System.out.println("InOrder Traversal is:");
        bst.inOrder(root);

    }
}
