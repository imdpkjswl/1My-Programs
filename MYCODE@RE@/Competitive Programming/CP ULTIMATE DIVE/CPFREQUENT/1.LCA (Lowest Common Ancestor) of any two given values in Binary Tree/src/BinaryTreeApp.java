/* Class containing left and right child of current node and key value*/
class Node {
    int data;
    Node left, right;
    public Node(){}
    public Node(int data){ this.data = data; left = right = null;}
    public Node(int data, Node left, Node right){ this.data = data; this.left = this.right = null;}

}

public class BinaryTreeApp {
    //Root of the Binary Tree
    Node root;

    Node findLCA(int n1, int n2) {
        return findLCA(root, n1, n2);
    }


    Node findLCA(Node root, int p, int q) {
        // Base case
        if (root == null)
            return null;

        // Searching the presence of keys
        if (root.data == p || root.data == q)
            return root;

        // Look for keys in left and right subtrees using Inorder traversal
        Node left  = findLCA(root.left,  p, q);
        Node right = findLCA(root.right, p, q);

        // If both of the above calls return Non-NULL, then one key
        // is present in once subtree and other is present in other,
        // So this node is the LCA
        if (left!=null && right!=null)
            return root;

        // Otherwise check if left subtree or right subtree is LCA
        return (left != null) ? left : right;
    }


    /* Driver program to test above functions */
    public static void main(String args[]) {
        // Create tree
        BinaryTreeApp tree = new BinaryTreeApp();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("LCA(4, 5) = " + tree.findLCA(4, 5).data);
        System.out.println("LCA(4, 6) = " + tree.findLCA(4, 6).data);
        System.out.println("LCA(3, 4) = " + tree.findLCA(3, 4).data);
        System.out.println("LCA(2, 4) = " + tree.findLCA(2, 4).data);
    }
}


/*
ALGORITHM: INORDER TRAVERSAL METHOD
TIME COMPLEXITY: O(N)
AUXILIARY SPACE: O(1)

1. Search the two nodes in the Binary tree

2. If (nodes found)
    return node
   Else
    return NULL

3. When some node receives both left
   and right pointer as not NULL, then
   it is the LCA

  Else return what it receives
 */