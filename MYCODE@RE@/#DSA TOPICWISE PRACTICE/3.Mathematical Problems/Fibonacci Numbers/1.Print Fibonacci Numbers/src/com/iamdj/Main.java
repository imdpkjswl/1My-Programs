package com.iamdj;

import java.util.Scanner;

/**
 * FIBONACCI SERIES USING WITHOUT RECURSION:
 * TIME COMPLEXITY -> O(n)
 * SPACE COMPLEXITY -> O(1)
 */
 /*
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = in.nextInt();

        int n1 = 0;
        int n2 = 1;

        for(int i=2;i<=n;i++) {
            int n3 = n1 + n2;
            System.out.print(n3+" ");

            n1 = n2;
            n2 = n3;
        }
    }
}
*/

/**FIBONACCI SERIES USING WITHOUT RECURSION:
 * TIME COMPLEXITY -> O(n) Using Dynamic Programming
 * SPACE COMPLEXITY -> O(n)
 */
/*
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = in.nextInt();
        n = n+1;

        int[] f = new int[n];
        f[0] = 0;
        f[1] = 1;
        for(int i=2;i<n;i++) {
            f[i] = f[i-1] + f[i-2];
            System.out.print(f[i]+" ");
        }
    }
}
*/

/** FIBONACCI SERIES USING RECURSION:
 * TIME COMPLEXITY -> O(2^n)
 * SPACE COMPLEXITY -> o(1)
 */
 /*
public class Main {

    static int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = in.nextInt();

        for(int i=1;i<=n;i++) {
            System.out.print(fib(i)+" ");
        }
    }
}
*/


/** FIBONACCI SERIES Another approach:(Using formula)
 In this method we directly implement the formula for nth term in the fibonacci series.
 Fn = {[(√5 + 1)/2] ^ n} / √5
 * TIME COMPLEXITY -> O(1) to calculate nth term fibonacci number.
 * SPACE COMPLEXITY -> o(1)
 */
public class Main {

    static int fib(int n) {
        double base = (1 + Math.sqrt(5)) / 2;

        return (int) Math.round(Math.pow(base, n) / Math.sqrt(5));
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = in.nextInt();

        for(int i=1;i<=n;i++) {
            System.out.print(fib(i)+" ");
        }
    }
}


/** ANOTHER FORMULA CAN BE USED:
 It used (O(Log n) Time)

 Below is one more interesting recurrence formula that can be used to find n’th Fibonacci Number in O(Log n) time.

 If n is even then k = n/2:
 F(n) = [2*F(k-1) + F(k)]*F(k)

 If n is odd then k = (n + 1)/2
 F(n) = F(k)*F(k) + F(k-1)*F(k-1)

 How does this formula work?

 Taking determinant on both sides, we get
 (-1)n = Fn+1Fn-1 – Fn2
 Moreover, since AnAm = An+m for any square matrix A, the following identities can be derived (they are obtained form two different coefficients of the matrix product)

 FmFn + Fm-1Fn-1 = Fm+n-1

 By putting n = n+1,

 FmFn+1 + Fm-1Fn = Fm+n

 Putting m = n

 F2n-1 = Fn2 + Fn-12

 F2n = (Fn-1 + Fn+1)Fn = (2Fn-1 + Fn)Fn

 To get the formula to be proved, we simply need to do the following
 If n is even, we can put k = n/2
 If n is odd, we can put k = (n+1)/2

 */