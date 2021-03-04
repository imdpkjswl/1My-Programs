//Time Complexity: O(N)
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

class _404_Sum_of_Left_Leaves {
   boolean isLeaf(TreeNode node) {
        if (node == null)
            return false;
        if (node.left == null && node.right == null)
            return true;
        return false;
    }
  
     // This function returns sum of all left leaves in a given binary tree
    int sumOfLeftLeaves(TreeNode node) {
        // Initialize result
        int res = 0;
  
        // Update result if root is not NULL
        if (node != null) {
            // If left of root is NULL, then add key of left child
            if (isLeaf(node.left))
                res += node.left.val;
            else // Else recur for left child of root
                res += sumOfLeftLeaves(node.left);
  
            // Recur for right child of root and update res
            res += sumOfLeftLeaves(node.right);
        }
  
        // return result
        return res;
    }

    public static void main(String[] args) {
    	TreeNode root = null;
    	_404_Sum_of_Left_Leaves tree = new _404_Sum_of_Left_Leaves();

        root 					= new TreeNode(3);
        root.left 				= new TreeNode(9);
        root.right 				= new TreeNode(20);
        root.right.left 		= new TreeNode(15);
        root.right.right 		= new TreeNode(7);
       
  
        System.out.println("The sum of leaves is " + 
                                       tree.sumOfLeftLeaves(root));
    }
}