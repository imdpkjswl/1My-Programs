import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Student obj1 = new Student("Hello","World!");
		Student.Print();
		
		Student obj2 = new Student("Deepak","Jaiswal");
		Student.Print();

		
		System.out.println("Total Object Created : "+Student.count);
		
		Main.msg(); // Calling static method of Main class without creating instance of Main class.
	}

	
	static void msg()
	{
		System.out.println("\nI'm a Main class Static Method!!!");
	}
}
