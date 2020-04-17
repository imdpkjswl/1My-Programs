
public class Student {
	
	private static String fname ;
	private static String lname;
	static int count = 0;
	
	
	
	Student(String fname,String lname)
	{
		this.fname = fname;
		this.lname = lname;
		count++;
		Print(); // Informal way of calling within constructor.
	}
	
	
	static void Print() 
	{
		System.out.println(fname +" "+lname);
		System.out.println("Total number of student are : "+count);	
	}

}
