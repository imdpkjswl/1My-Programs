import java.util.Scanner;

// This program is divided into two parts...
public class MyClass {
    public static void main(String [] args) {

        System.out.println("Enter two number");
        Scanner in = new Scanner(System.in);

        Example obj  = new Example(); // Creating object of second class.

        obj.a = in.nextInt();
        obj.b = in.nextInt();
        obj.add();

        System.out.println("Sum is :  " +obj.total);
    }
}
