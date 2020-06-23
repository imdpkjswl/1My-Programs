package com.iamdj;

import java.util.Scanner;

/**
 * Given three positive integer n, x, y. The task is to print Greatest Common Divisor of numbers formed by n repeating x times and
 * number formed by n repeating y times.
 * 0 <= n, x, y <= 1000000000.
 *
 * Examples :
 *
 * Input : n = 123, x = 2, y = 3.
 * Output : 123
 * Number formed are 123123 and 123123123.
 * Greatest Common Divisor of 123123 and
 * 123123123 is 123.
 *
 * Input : n = 4, x = 4, y = 6.
 * Output : 44
 *
 * Here, The idea is to first find gcd of x and y and we need to print n by gcd times(that we got).
 */
public class Main {

    static int gcd(int x , int y) {
        if(x == 0)
            return y;

        return gcd(y % x , x);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = in.nextInt();
        System.out.println("Enter the value of x:");
        int x = in.nextInt();
        System.out.println("Enter the value of y:");
        int y = in.nextInt();


        System.out.print("GCD of ");
        for(int i=0;i<x;i++)
            System.out.print(n);
        System.out.print(" and ");
        for(int i=0;i<y;i++)
            System.out.print(n);
        System.out.println(" is formed:  ");


        // Main logic
        /**
         * We can conclude following property,
         * GCD(f(n, x), f(n, y)) = f(n, GCD(x, y)).
         */
        int times = gcd(x, y);
        for(int i=1;i<=times;i++){
            System.out.print(n);
        }

    }
}
