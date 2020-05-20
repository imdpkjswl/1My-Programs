import java.util.*;

/**
public class Main {

    // Time complexity is O(n)
    public static int expo(int x,int n) {
        if (n == 0)
            return 1;

        return x*expo(x, n-1);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the base value and power of base value:");
        int x = in.nextInt();
        int n = in.nextInt();

        int result = expo(x,n);
        System.out.println(x+"^"+n+ "==>  " +result);

    }
}
*/


import java.util.*;


public class Main {

    // Time complexity is O(Logn)
    public static int power(int x,int n) {
        if (n == 0)
            return 1;
        else if(n%2 == 0){  // When n is even.
            int y = power(x, n/2);
            return y*y;
        }
        else
            return x*power(x,n-1); // When n is odd.

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the base value and power of base value:");
        int x = in.nextInt();
        int n = in.nextInt();

        int result = power(x,n);
        System.out.println(x+"^"+n+ "==>  " +result);

    }
}
