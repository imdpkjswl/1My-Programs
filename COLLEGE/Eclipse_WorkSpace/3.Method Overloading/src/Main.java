import java.util.Scanner;

public class Main {

	
	
	void add(int x,int y,int z) {
		int res;
		res = x+y+z;
		System.out.println("Sum is : "+res);
	}
	
	
	void add(int x,int y) {
		int res  = x+y;
		System.out.println("Sum is : "+res);
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);	
		int ch,x,y,z;
		
		System.out.println("1.For adding three number\n2.For adding two number\n3.Exit\n");
		System.out.println("Enter your choice");
		ch = in.nextInt();
		
		Main obj = new Main();
		
		switch(ch)
		{
		
		case 1: 
				System.out.println("Enter three numbers");
				x = in.nextInt();
				y = in.nextInt();
				z = in.nextInt();
				obj.add(x,y,z);
				break;
				
		case 2:
				System.out.println("Enter two numbers");
				x = in.nextInt();
				y = in.nextInt();
				obj.add(x,y);
				break;
				
		case 3:
				System.out.println("Exiting...");
				System.exit(0);
				
		default:
			System.out.println("Enter the correct input");
		}
	}

}
