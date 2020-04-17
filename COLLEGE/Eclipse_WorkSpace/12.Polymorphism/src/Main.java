
class base {
	
	void message()
	{
		System.out.println("Base Class Meassge");
		
	}
}

class subClass extends base {
	
	 void message() {
		
		System.out.println("Sub Class Message");
	}
	
}

public class Main {
	
	public static void main(String [] args){
		
		base obj;
		obj = new subClass();
		//base obj = new subClass();  // Upcasting
		obj.message();
		
		base b = new base();
		b.message();
		
		
	}

}
