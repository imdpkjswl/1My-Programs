import java.util.*;

// Structure of class Node is:
class Node{
	int data;
	Node left,right;
	Node(int d){
		data = d;
		left = null;
		right = null;
	}
}

class Left_View_of_Binary_Tree{
	static ArrayList<Integer> result = new ArrayList<>();
	static Queue<Node> q; 
  
	// Utility function to print the left view of the binary tree 
	static void leftViewUtil( Node root ) { 
    	if (root == null) 
        	return; 
  
	    // add root 
	    q.add(root); 
	  
	    // Delimiter 
	    q.add(null); 
  
    while (q.size() > 0) {

        Node temp = q.peek(); 
  
        if (temp != null) { 
  
            // Prints first node of each level 
            result.add(temp.data);// System.out.print(temp.data + " "); 
  
            // add children of all nodes at 
            // current level 
            while (q.peek() != null) { 
  
                // If left child is present, add into queue 
                if (temp.left != null) 
                    q.add(temp.left); 
  
                // If right child is present, add into queue 
                if (temp.right != null) 
                    q.add(temp.right); 
  
                // remove the current node 
                q.remove(); 
  
                temp = q.peek(); 
            } 
  
            // add delimiter for the next level 
            q.add(null); 
        } 
  
        // remove the delimiter of the previous level 
        q.remove(); 
    } 
} 
  
	// Function to print the leftView of Binary Tree 
	static ArrayList<Integer> leftView( Node root) { 
	    // Queue to store all 
	    // the nodes of the tree 
	    q = new LinkedList<Node>(); 
	  
	    leftViewUtil(root);
	    return result; 
	} 



	public static void main(String[] args){
		// Create root node
		Node root = null;

		 /* creating a binary tree and entering the nodes */ 
        root = new Node(12); 
        root.left = new Node(10); 
        root.right = new Node(30); 
        root.right.left = new Node(25); 
        root.right.right = new Node(40); 
  
        ArrayList<Integer> res = leftView(root); 
        System.out.println(res);
	}
}