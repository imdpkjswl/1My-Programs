
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



    void levelOrder(Node root, int[] arr)
    {

        Node cur;
        Node[] q = new Node[20];
        int front =0, rear = -1, k=0;

        q[++rear] = root;

        while(front<=rear)
        {
            cur = q[front++];
            arr[k++] = cur.data; // store items in cmp

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

        Node root1 = null;
        Node root2 = null;
        binarySearchTree bst = new binarySearchTree();

        int[] arr1 = {8, 3, 6, 1, 4, 7, 10, 14, 13};
        int[] arr2 = {8, 10, 14, 3, 6, 4, 1, 7, 13};

        if(arr1.length != arr2.length){
            System.out.println("Not identical");
            System.exit(1);
        }

        // Create BST using array1 elements
        for(int i=0;i<arr1.length;i++) {
            root1 = bst.insert(root1, arr1[i]);
        }

        // Store level order traversal element in array 'arr1'
        bst.levelOrder(root1,arr1);

        // Create BST using array2 elements
        for(int i=0;i<arr1.length;i++) {
            root2 = bst.insert(root2, arr2[i]);
        }

        // Store level order traversal element in array 'arr2'
        bst.levelOrder(root2,arr2);

        // Compare both arrays to verify for identical.
        for (int i=0;i<arr1.length;i++){
            if (arr1[i] != arr2[i]){
                System.out.println("Not identical");
                return;
            }
        }
        System.out.println("Identical");

    }
}
