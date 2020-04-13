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

    int biggest(Node root){
        if(root == null)
            return 0;

        int res = root.item;
        int Lres = biggest(root.left);
        int Rres = biggest(root.right);

        if(res < Lres)
            res = Lres;

        if(res < Rres)
            res = Rres;

        return res;
    }


}


public class biggestItem{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int ch;
        Node root = null;
        binarySearchTree tree = new binarySearchTree();

        while(true){
            System.out.println("1.Insert\n2.Inorder\n3.Find Biggest\n4.Exit\nEnter your choice:");
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
                    System.out.println("Biggest element in tree:  "+tree.biggest(root));
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}