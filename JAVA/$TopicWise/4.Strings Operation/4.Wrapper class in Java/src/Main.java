import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
		int i = 5;
		// Note: Here, i is primitive data and jj, iobj are objects of Integer class.

		Integer iobj = new Integer(i);// Boxing: Concept of putting primitive value inside objects is called Boxing.
		Integer jj = i; // Auto Boxing

		int j = jj.intValue(); // UnBoxing  //or use :  iobj.intValue();
		int k = jj;    // Auto UnBoxing(Taking out)
		//System.out.println(k);

		// EXAMPLE: Where we can use this Wrapper class

		ArrayList <Integer> value = new ArrayList<Integer>();

		value.add(5); // Auto Boxing
		value.add(7);
		value.add(9);
		value.add(12);
		value.add(16);

		value.remove(2); // Auto Unboxing

		//Note: Integer is used with Framework and int is used with loop because int(primitive) is faster than Integer(class).
		// We can also use Integer for printing array list values.
		for(Integer a=0;a<value.size();a++){
			System.out.println(value.get(a));
		}

		// We cam also use int for printing array list and int is primitive, so it faster than Integer.
		for(int a=0;a<value.size();a++){
			System.out.print(value.get(a)+"  ");
		}


    }
}
