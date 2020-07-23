class Node {
    int data;
    Node left;
    Node right;

    Node(int item) {
        data =item;
    }
}

class binarySearchTree {

    Node insert(Node root, int item)  {

        if (root == null)
            root = new Node(item);
        else if (root.data > item)
            root.left = insert(root.left, item);
        else if (root.data < item)
            root.right = insert(root.right, item);
        return root;
    }

    void inOrder(Node root) {
        if(root == null) return ;

        inOrder(root.left);
        System.out.print(root.data+"  ");
        inOrder(root.right);
    }


    // Delete leaf nodes from binary search tree.
    Node leafDelete(Node root)
    {
        if (root == null)
            return null;

        // Make null, when leaf node found
        if (root.left == null && root.right == null) {
            return null;
        }

        // Else recursively delete in left and right subtrees.
        root.left = leafDelete(root.left);
        root.right = leafDelete(root.right);

        return root;
    }



}


public class Main {

    public static void main(String[] args) {

        Node root = null;
        binarySearchTree bst = new binarySearchTree();

        root = bst.insert(root, 20);
        root = bst.insert(root, 10);
        root = bst.insert(root, 5);
        root = bst.insert(root, 15);
        root = bst.insert(root, 30);
        root = bst.insert(root, 25);
        root = bst.insert(root, 35);

        System.out.println("InOrder Traversal before Deleting the leaf Nodes:");
        bst.inOrder(root);

        // Call leafDelete function
        bst.leafDelete(root);

        System.out.println("\n\nInOrder Traversal after Deleting the leaf Nodes:");
        bst.inOrder(root);



    }
}
