import java.util.Scanner;
import java.lang.String;

public class Calculator {

    public static void main(String [] args) {

        System.out.println("Enter two number like a+b , a-b , a*b and a/b");

        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        char  op = in.next().charAt(0);  // This takes only one character from user.
        double b = in.nextDouble();
        double res = 0;

        if (op == '+')
        {
                res = a+b;
                System.out.println("Result : " + res);
        }else if(op == '-')
        {
            res = a-b;
            System.out.println("Result : " + res);
        }else if(op == '*')
        {
            res = a*b;
            System.out.println("Result : " + res);
        }else if(op == '/')
        {
            if(b == 0) {
                System.out.println("Denominator is divided by zero");
                return;
            }
            else
                res = a/b;
                System.out.printf("Result :  %.4f",res);
        } else
            System.out.println("Please, Enter the correct data");

    }
}
