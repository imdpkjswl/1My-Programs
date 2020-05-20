// Program to find fibonacci number of nth term using memoization:

import java.util.*;

public class Main {
    static int[] F = new int[100];

    public static int fib(int n) {
        if(n <= 1) {
            return n;
        }

        if(F[n] != -1)   // Checking is fib(n) is already calculated or not.
            return F[n]; // this will be skipped the below statement bcuz it's already calculated.

        return fib(n-1) + fib(n-2);
    }


    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        for(int i=0;i<100;i++)
            F[i] = -1; // it means, F[i] is Not calculated yet.

        System.out.println("Enter the term:");
        int n = in.nextInt();

        int result = fib(n);
        System.out.println("Fibonacci number of "+n+" term is:  "+ result);

    }
}
