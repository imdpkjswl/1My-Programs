package com.iamdj;

import java.util.Scanner;

/**
 * ALGORITHM:
 * 1. Let n be the input number
 * 2. While n >= 0
 *     a) Find the greatest Fibonacci number smaller than n.
 *     Let this number be 'P'. Print 'P'.
 *     b) n = n - P
 */
public class Main {

    static int nearestBiggerFibNumber(int n) {
        // Corner cases
        if(n ==0 || n==1)
            return n;

        // Find the greatest fibonacci number which is less or equal to n.
        int g1 = 0, g2 = 1, g3 = 1;
        while (g3 <= n){
            g1 = g2;
            g2 = g3;
            g3 = g1 + g2;
        }
        return g2;  // selecting the smaller than n. -> DO dry and run
    }

    static void fibRepresentation(int n) {
        while ( n > 0) {
            int g = nearestBiggerFibNumber(n);

            System.out.print(g+"  ");

            // reduce n
            n = n - g;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = in.nextInt();
        System.out.println("Non-neighbouring Fibonacci Representation of "+n+" is:  ");
        fibRepresentation(n);

    }
}
