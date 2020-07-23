
class Node {
    int data;
    Node left;
    Node right;

    Node(int item) {
        data = item;
    }
}

class binarySearchTree {

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
        System.out.print(root.data+"  ");
        inOrder(root.right);
    }


    void levelOrder(Node root)
    {

        Node cur;
        Node[] q = new Node[20];
        int front =0, rear = -1;

        q[++rear] = root;

        while(front<=rear)
        {
            cur = q[front++];
            System.out.print(cur.data+" ");

            if(cur.left != null)
                q[++rear] = cur.left;

            if(cur.right != null)
                q[++rear] = cur.right;

        }

        System.out.println();
    }

}


public class Main {

    public static void main(String[] args) {

        Node root = null;
        binarySearchTree bst = new binarySearchTree();

        int[] arr = {7, 4, 12, 3, 6, 8, 1, 5, 10};
        for(int i=0;i<arr.length;i++) {
            root = bst.insert(root, arr[i]);
        }


        System.out.println("InOrder Traversal:");
        bst.inOrder(root);

        System.out.println("\nLevel order\n");
        bst.levelOrder(root);


    }
}
