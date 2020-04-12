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

    void display_preorder(Node root)
    {
        if(root == null) return ;

        System.out.print(root.item+"  ");
        display_preorder(root.left);
        display_preorder(root.right);
    }

    void display_postorder(Node root)
    {
        if(root == null) return ;


        display_postorder(root.left);
        display_postorder(root.right);
        System.out.print(root.item+"  ");
    }
}


public class binaryTree{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int ch;
        Node root = null;
        binarySearchTree tree = new binarySearchTree();

        while(true){
            System.out.println("1.Insert\n2.Inorder\n3.PreOrder\n4.PostOrder\n5.Exit\nEnter your choice:");
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
                    if(root==null){ System.out.println("Tree is Empty"); break; }
                    tree.display_preorder(root);
                    System.out.println();
                    break;

                case 4:
                    if(root==null){ System.out.println("Tree is Empty"); break; }
                    tree.display_postorder(root);
                    System.out.println();
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}