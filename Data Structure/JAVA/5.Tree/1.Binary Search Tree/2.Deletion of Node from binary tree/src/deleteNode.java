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
    {
        if(root == null) return ;
        display_inorder(root.left);
        System.out.print(root.item+"  ");
        display_inorder(root.right);
    }


    Node find_minimum(Node root)
    {
        if(root == null)
            return null;
        else if(root.left != null) // node with minimum value will have no left child
            return find_minimum(root.left); // left most element will be minimum
        return root;
    }

    Node delete(Node root, int key){

            if(root==null)
                return null;
                //Searching for the item to be deleted
                if (key > root.item) // Key might be present in Right Side.
                        root.right = delete(root.right, key);
                else if(key < root.item) // Key might be present in Left Side.
                        root.left = delete(root.left, key);
                else
                {
                    //No Children
                    if(root.left==null && root.right==null)
                    {
                        return null;
                    }

                    //One Child
                    else if(root.left==null || root.right==null)
                    {
                        Node temp;
                        if(root.left==null)
                            temp = root.right;
                        else
                            temp = root.left;

                        return temp;
                    }

                    //Two Children
                    else
                    {
                        Node temp = find_minimum(root.right); // Searching minimum element in right side of tree.
                        root.item = temp.item;
                        root.right = delete(root.right, temp.item);
                    }
                }
                return root;
            }

    }


public class deleteNode{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int ch;
        Node root = null;
        binarySearchTree tree = new binarySearchTree();

        while(true){
            System.out.println("1.Insert Node\n2.Inorder Traversal\n3.Delete Node\n4.Exit\nEnter your choice:");
            ch = in.nextInt();
            switch(ch){
                case 1:
                    root = tree.insert(root);
                    break;

                case 2:
                    if(root==null){ System.out.println("Tree is Empty"); break; }
                    tree.display_inorder(root);
                    System.out.println();
                    break;

                case 3:
                    int key;
                    System.out.println("Enter the key element:");
                    key = in.nextInt();
                    if(root==null){ System.out.println("Tree is Empty"); break; }
                    root = tree.delete(root,key);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}