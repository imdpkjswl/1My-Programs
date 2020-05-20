// Program to find fibonacci number of nth term:

import java.util.*;

public class Main {

    public static int fib(int n) {
        if(n <= 1) {
            return n;
        }

        return fib(n-1) + fib(n-2);
    }


    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        System.out.println("Enter the term:");
        int n = in.nextInt();

        int result = fib(n);
        System.out.println("Fibonacci number of "+n+" term is:  "+ result);

    }
}
