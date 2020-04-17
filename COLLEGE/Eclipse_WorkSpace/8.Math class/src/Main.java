
public class Main {

	public static void main(String[] args)	{
		double num;
		
		num = Math.abs(-34.7); // How much away from 0
		System.out.println("absolute value of -34.7 :  "+num);
		
		num = Math.ceil(34.7); // round the number
		System.out.println("Round off value of 34.7 :  "+num);
		
		num = Math.floor(34.7); // round down the number
		System.out.println("Floor down value of 34.7 :  "+num);
		
		num = Math.max(34.7,45.7); // Max of two number
		System.out.println("Max of 34.7 and 45.7 :  "+num);
		
		num = Math.min(34.7,45.7); // Min of two number
		System.out.println("Min of 34.7 and 45.7 :  "+num);
		
		num = Math.sqrt(35);    // square of number
		System.out.println("Square root of 35 is :  "+num);
		
		num = Math.pow(2, 4); // Power of number
		System.out.println("Power of 2^4 :  "+num);
	}

}
