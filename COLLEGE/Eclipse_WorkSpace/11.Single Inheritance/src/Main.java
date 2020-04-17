import java.util.Scanner;

class Base{
	
	String name;
	String addr;
}

class subClass extends Base{
	Scanner in = new Scanner(System.in);
	
	int salary;
	
	void read(){
		System.out.println("Enter name");
		name = in.next();
		System.out.println("Enter address");
		addr = in.next();
		System.out.println("Enter Salray");
		salary = in.nextInt();
	}
	
	void print(){
		System.out.println("Name : "+name);
		System.out.println("Address :  "+addr);
		System.out.println("Salray :  "+salary+"\n\n");
	}
}

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n;
		System.out.println("Enter number of employees :");
		n = s.nextInt();
		
		subClass[] objArray = new subClass[n]; // Creating subClass type array.
		
		for(int i=0;i<n;i++)
			objArray[i] = new subClass(); // Allocating memory for objects(Invoking).
		
		
		for(int i=0;i<objArray.length;i++) // Reading n inputs
			objArray[i].read();
		
		for(int i=0;i<objArray.length;i++) // Printing n data
			objArray[i].print();
		
	}

}
