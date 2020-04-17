import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Random ranNum = new Random();
		
		System.out.println("Random number between 0 10 100");
		for(int i=0;i<5;i++)
			System.out.println(ranNum.nextInt(100));
		
		System.out.println("Random number between 10 to 50");
		for(int i=0;i<5;i++)
			System.out.println(ranNum.nextInt(50-10)+10); // Formula used.
	}

}
