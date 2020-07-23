
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



    void levelOrder(Node root, int[] cmp)
    {

        Node cur;
        Node[] q = new Node[20];
        int front =0, rear = -1, k=0;

        q[++rear] = root;

        while(front<=rear)
        {
            cur = q[front++];
            cmp[k++] = cur.data; // store items in cmp

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

        int[] arr = {11, 6, 13, 5, 12, 10}; // {7, 4, 12, 3, 6, 8, 1, 5, 10};
        int[] cmp = new int[arr.length];

        // Create BST using array elements
        for(int i=0;i<arr.length;i++) {
            root = bst.insert(root, arr[i]);
        }

        // Store level order traversal element in array 'cmp'
        bst.levelOrder(root,cmp);

        // Compare both arrays to verify that they array elements can represent level order bst.
        for (int i=0;i<arr.length;i++){
            if (arr[i] != cmp[i]){
                System.out.println("Given array cannot represent level order traversal");
                return;
            }
        }
        System.out.println("Given array can be represented level order traversal");

    }
}
