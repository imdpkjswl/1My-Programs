import java.util.*;

// Structure of class Node is:
class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}

class Nth_node_from_end_of_linked_list{
	
	// Function to find the nth node from end in the linked list
    // head: head of the linked list
    // n: nth node from end to find
    static int getNthFromLast(Node head, int n){
    	// TRY TO SOLVE IN O(1) SPACE
    	ArrayList<Integer> a = new ArrayList<>();

    	Node cur = head;
    	while(cur!= null){
    		a.add(cur.data);
    		cur = cur.next;
    	}

		if(n < 0 || n > a.size())
	    return -1;

    	return a.get(a.size()-n);	
    }



	public static void main(String[] args){
		

		// Create head
		Node head = null;

		// Create a list
		head = new Node(1);
        head.next = new Node(2); 
        head.next.next = new Node(3); 
        head.next.next.next = new Node(1);
       
         int n = 5;
        int result = getNthFromLast(head, n);
        System.out.println(result);
	}
}