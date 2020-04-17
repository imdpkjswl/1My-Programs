import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		// Adding elements to rear side(Default)
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		
		list.add(4,60); // adding 60 at 4th index.
		list.set(5,70); // replacing 50 by 70 at 5th index.
		
		list.addFirst(5); // Adding 5 at 0th index number
		list.removeFirst(); // Removing 0th index number element
		
		list.addLast(80); // Adding 80 with last node
		list.removeLast(); // Removing last node
		
		System.out.println("Size of list : "+list.size()); // Size of list.
		
		
		for(Integer temp : list)
			System.out.print(temp+" ");
		
	}

}
