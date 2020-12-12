class Tree {
    int val;
    Tree left, right;

    Tree(int item) {
        val = item;
        left = right = null;
    }
}

class BinaryTree {
    static int maxDepth(Tree root) {
        if (root == null)
            return 0;
        else {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);

            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }

    static void printLeafNodes(Tree root) {
        // if node is null, return
        if (root == null)
            return;

        // if node is leaf node, print its data
        if (root.left == null && root.right == null)
        {
            System.out.print(root.val+" ");
            return;
        }

        // if left child exists, check for leaf recursively
        if (root.left != null)
            printLeafNodes(root.left);

        // if right child exists, check for leaf recursively
        if (root.right != null)
            printLeafNodes(root.right);
    }


    // TO COUNT TOTAL NO. OF NODES IN BT
    public static int countNodes(Tree root) {
        if(root == null)
            return 0;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }


    public static void main(String[] args) {
        Tree root = null;
        BinaryTree tree = new BinaryTree();

        root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.right.right = new Tree(5);

        System.out.println("Total nodes in tree is :  "+countNodes(root));
        System.out.println("Height of tree is : " + tree.maxDepth(root));
        System.out.println("All leaf nodes in tree:");
        printLeafNodes(root);
    }
}