import java.util.Scanner;
public class second {
	
	int a,b,sum;
	
	second()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two number");
		
		a = s.nextInt();
		b = s.nextInt();
		
		sum = a+b;
		
		System.out.println("Sum is :  "+sum);
	}

}
