import java.util.ArrayList;

class Node
{
    int data;
    Node left, right;

    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class BinaryTree {

    Node root;
    void inOrder(Node root, ArrayList<Integer> arr){
        if(root == null) return;

        inOrder(root.left, arr);
        arr.add(root.data);
        inOrder(root.right, arr);
    }

    boolean isBST(ArrayList<Integer> arr)  {

        for (int i=1;i<arr.size();i++){
            if (arr.get(i-1) > arr.get(i))
                return false;
        }

        return true;
    }



    /* Driver program to test above functions */
    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);

        /** We can avoid the use of Auxiliary Array. While doing In-Order traversal, we can keep track of previously
        visited node. If the value of the currently visited node is less than the previous value, then tree is not BST */
        ArrayList<Integer> arr = new ArrayList<>();
        tree.inOrder(tree.root, arr);

        // Now check, is arr is sorted or not
        if (tree.isBST(arr) && arr.size() != 0)
            System.out.println("Given Binary Tree is BST.");
        else
            System.out.println("Given Binary Tree is not BST.");
    }
}