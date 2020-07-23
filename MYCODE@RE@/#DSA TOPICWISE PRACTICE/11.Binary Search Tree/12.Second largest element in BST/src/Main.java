
class Node {
    int data;
    Node left;
    Node right;

    Node(int item) {
        data =item;
    }
}

class binarySearchTree {

    int mostLargest = 0;
    int secondLargest =0;

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
        secondLargest = mostLargest;
        mostLargest = root.data;
        inOrder(root.right);
    }



}


public class Main {

    public static void main(String[] args) {

        Node root = null;
        binarySearchTree bst = new binarySearchTree();

        root = bst.insert(root,50 );
        root = bst.insert(root, 30);
        root = bst.insert(root, 20);
        root = bst.insert(root, 40);
        root = bst.insert(root, 70);
        root = bst.insert(root, 60);
        root = bst.insert(root, 80);


        bst.inOrder(root);
        System.out.println("Second most largest element:  "+bst.secondLargest);


    }
}
