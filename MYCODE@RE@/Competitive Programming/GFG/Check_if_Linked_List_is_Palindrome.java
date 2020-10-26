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

class Check_if_Linked_List_is_Palindrome{
	
	// Function to check if linked list is palindrome
    static boolean isPalindrome(Node head) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> rev = new ArrayList<>();
        Node cur = head;
        while(cur!=null){
            a.add(cur.data);
            rev.add(cur.data);
            cur = cur.next;
        }
        
        int n = a.size();
        for(int i=0;i<n;i++){
            if(a.get(i) != rev.get(n-1-i)){
                return false;
            }
        }
        
        return true;
    }



	public static void main(String[] args){
		// Create head
		Node head = null;

		// Create a list
		head = new Node(1);
        head.next = new Node(2); 
        head.next.next = new Node(3); 
        head.next.next.next = new Node(1);
       
        boolean result = isPalindrome(head);
        System.out.println(result);
	}
}