import java.util.*;

class Node{
    int item;
    Node left=null, right=null;

    Scanner in = new Scanner(System.in);
    public Node() {
        System.out.println("Enter an item:");
        item = in.nextInt();
    }
}



class binarySearchTree {

    Node insert(Node root){
        Node temp = new Node();
        if(root == null){
            System.out.println(temp.item+" is inserted.");
            return temp;
        }

        Node prev, cur;
        prev = null;
        cur = root;
        while(cur != null){
            prev = cur;
            if(temp.item <= cur.item)
                cur = cur.left;
            else
                cur = cur.right;
        }

        if(temp.item <= prev.item)
            prev.left = temp;
        else
            prev.right = temp;

        return root;
    }

    void display_inorder(Node root)
    { if(root == null) return ;
        display_inorder(root.left);
        System.out.print(root.item+"  ");
        display_inorder(root.right);
    }

/*
    METHOD:1
            1) Do In-Order Traversal of the given tree and store the result in a temp array.
            3) Check if the temp array is sorted in ascending order, if it is, then the tree is BST.
            we can keep track of previously visited node. If the value of the currently visited node
            is less than the previous value, then tree is not BST.
  */
    int i=0;
    static int arr[] = new int[10];
    void inorder(Node root)
    {   if(root == null) return;

        inorder(root.left);
        arr[i++] = root.item;
        inorder(root.right);
    }


/**  // METHOD 2:
    // returns true if given search tree is binary search tree (efficient version)

 boolean isBST(Node root)  {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    // Returns true if the given tree is a BST and its values are >= min and <= max.
    boolean isBSTUtil(Node node, int min, int max)
    {
        // an empty tree is BST
        if (node == null)
            return true;

        // false if this node violates the min/max constraints
        if (node.item < min || node.item > max)
            return false;

        // otherwise check the subtrees recursively
        tightening the min/max constraints
        // Allow only distinct values
        return (isBSTUtil(node.left, min, node.item-1) &&
                isBSTUtil(node.right, node.item+1, max));
    }
    */
}


public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int ch,count=0;
        Node root = null;
        binarySearchTree tree = new binarySearchTree();

        while(true){
            System.out.println("1.Insert\n2.Inorder\n3.Check For BST\n4.Exit\nEnter your choice:");
            ch = in.nextInt();
            switch(ch){
                case 1:
                    root = tree.insert(root);
                    count++;
                    break;

                case 2:
                    if(root==null){ System.out.println("Tree is Empty"); break; }
                    tree.display_inorder(root);
                    System.out.println();
                    break;

                case 3:
                    if(root==null){ System.out.println("Tree is Empty"); break; }
                    //System.out.println("Is a binary search tree:  "+tree.isBST(root));
                    tree.inorder(root);
                    for(int i=0;i<count;i++)
                        System.out.print(tree.arr[i]+"  ");
                    System.out.println();
                    for(int i=0;i<count;i++) {
                        if(i>0 && tree.arr[i-1] > tree.arr[i]){
                            System.out.println("NOT BST");
                            break; }}
                        System.out.println("BST");

                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}