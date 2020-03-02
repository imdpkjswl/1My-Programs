import java.util.Scanner;
public class EvenOdd{

    public static void main(String[] args) {
        System.out.println("Enter a number to check Even or Odd");
        Scanner in = new Scanner(System.in);
        int number=in.nextInt();
        //Using ternary operator SYNTAX:-  Exp1 ? Exp2 : Exp3;
        String output;
        output =(number%2==0)?"even number":"odd number";
        System.out.println("The number "+number+" is an " +output+".");
    }
}