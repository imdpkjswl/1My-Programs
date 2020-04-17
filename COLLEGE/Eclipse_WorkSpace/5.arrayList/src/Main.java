import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Hello");
		al.add("World");
		
		al.add(1,"Java"); // Insert at any index.
		
		System.out.println(al.size()); // find arraylist size
		
		al.remove(2); // Remove index 2 element.
		
		for(String temp : al){
			System.out.print(temp+" ");
		}
		
		al.clear();  // Clear list
		al.removeAll(al); // for remove all list.

	}

}
