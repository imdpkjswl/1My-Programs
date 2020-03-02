import java.util.Scanner;

class Addition {
    Scanner s = new Scanner(System.in);
    int a,b,sum;

    void add()
    {
        System.out.println("Enter two number for addition");
        a = s.nextInt();
        b = s.nextInt();

        sum = a+b;
    }

}


public class MAIN {

    public static void main(String [] args)
    {
        Addition obj = new Addition();

        obj.add(); // Invoking the Addition class method for addition of two number.

        System.out.println("Sum  is : "+obj.sum);

    }

}
