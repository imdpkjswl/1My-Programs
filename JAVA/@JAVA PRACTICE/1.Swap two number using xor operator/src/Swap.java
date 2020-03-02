
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        int num1,num2;

        num1 = obj.nextInt();
        num2 = obj.nextInt();

        System.out.println("Before Swapped :");
        System.out.println("First number is "+num1 +" Second number is "+num2);

        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;

        System.out.println("After Swapped :");
        System.out.println("First number is "+num1 +" Second number is "+num2);
    }
}
