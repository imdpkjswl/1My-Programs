class Node {
    int data;
    int height;  // for calculating height of every node
    Node left;
    Node right;

    Node(int item) {
        data =item;
        height = 1; //every node starting having height 1.
    }
}



class AVLTree {
    // Node wise traversal
    void display(Node root) {
        if(root == null) return ;

        // Self work
        String str = "";

        if(root.left == null){
            str += ".";
        }
        else{
            str += root.left.data;
        }

        str += " => " + root.data + " <= ";

        if(root.right == null){
            str += ".";
        }
        else{
            str += root.right.data;
        }

        System.out.println(str);

        display(root.left);
        display(root.right);
    }



    // Insert items into BST tree
     Node insert(Node node, int item)  {

        if (node == null) {
            node = new Node(item);
        }
        else if (node.data > item)
            node.left = insert(node.left, item);
        else if (node.data < item)
            node.right = insert(node.right, item);

        // update node height after each insertion
        node.height = Math.max(height(node.left), height(node.right)) +1;
        int bf = balanceFactor(node);  // find balancing factor of node.

        // LL Case
         if(bf > 1 && item < node.left.data) {
             return rightRotate(node);
         }

         // RR Case
         if(bf < -1 && item > node.right.data) {
             return leftRotate(node);
         }

         // LR Case
         if(bf > 1 && item > node.left.data) {
             node.left = leftRotate(node.left); // left rotate in-balanced sub tree
             return rightRotate(node); // then, right rotate main tree
         }

         // RL Case
         if(bf < -1 && item < node.right.data) {
             node.right = rightRotate(node.right); // right rotate in-balanced sub tree
             return leftRotate(node); // then, left rotate main tree
         }

        return node;
    }


    //2. Function to find balancing factor of a node
    int balanceFactor(Node node){
        if(node == null)
            return 0;

        return height(node.left) - height(node.right);
    }





    //1. Function to calculate height of node
    int height(Node node) {
        if(node == null)
            return 0;
        return node.height;
    }

    //3. Right(RR) Rotations
    Node rightRotate(Node c) {
        // Capture the node of in-balanced tree which would to be rotate
        Node b = c.left;
        Node T3 = b.right;

        // Rotate : followed video lecture of coding blocks
        b.right = c;
        c.left = T3;

        // Height update :must follow order of updating
        c.height = Math.max(height(c.left), height(c.right)) +1;
        b.height = Math.max(height(b.left), height(b.right)) +1;

        return b; // new root node
    }

    //4. Left(LL) Rotations
    Node leftRotate(Node c) {
        // Capture the node of in-balanced tree which would to be rotate
        Node b = c.right;
        Node T2 = b.left;

        // Rotate : followed video lecture of coding blocks
        b.left = c;
        c.right = T2;

        // Height update :must follow order of updating
        c.height = Math.max(height(c.left), height(c.right)) +1;
        b.height = Math.max(height(b.left), height(b.right)) +1;

        return b; // new root node
    }



}







public class Main {

    public static void main(String[] args) {

        Node root = null;
        AVLTree tree = new AVLTree();

        // Insert items which can make in-balanced tree
        root = tree.insert(root, 20);
        root = tree.insert(root, 25);
        root = tree.insert(root, 30);
        root = tree.insert(root, 10);
        root = tree.insert(root, 5);
        root = tree.insert(root, 15);
        root = tree.insert(root, 27);
        root = tree.insert(root, 19);
        root = tree.insert(root, 16);

        // display tree node with left - root - right
        System.out.println("Traversal: Left - Root - Right");
        tree.display(root);


    }
}
