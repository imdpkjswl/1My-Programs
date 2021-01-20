/* Class containing left and right child of current node and key value*/
class Node {
    int data;
    Node left, right;
    public Node(){}
    public Node(int data){ this.data = data; left = right = null;}
    public Node(int data, Node left, Node right){ this.data = data; this.left = this.right = null;}

}


public class BST {
    // Refer Pepcoding for more details: https://youtu.be/5E3MeajU9XQ
    public int lcaInBST(Node root, int d1, int d2) {
        if (d1 < root.data && d2 < root.data) {
            return lcaInBST(root.left, d1, d2);
        } else if (d1 > root.data && d2 > root.data) {
            return lcaInBST(root.right, d1, d2);
        } else {
            return root.data;
        }
    }

    /* Driver program to test above functions */
    public static void main(String args[]) {
        //Root of the Binary Search Tree
        Node root;

        // Create tree
        BST tree = new BST();

        // Create BST,  not Binary Tree
        root = new Node(3);
        root.left = new Node(1);
        root.right = new Node(5);
        root.left.right = new Node(2);
        root.right.left = new Node(4);
        root.right.right = new Node(6);
        root.left.left = new Node(0);

        System.out.println("LCA(4, 5) = " + tree.lcaInBST(root, 4, 5));
        System.out.println("LCA(2, 6) = " + tree.lcaInBST(root, 2, 6));
        System.out.println("LCA(3, 4) = " + tree.lcaInBST(root, 3, 4));
    }
}






