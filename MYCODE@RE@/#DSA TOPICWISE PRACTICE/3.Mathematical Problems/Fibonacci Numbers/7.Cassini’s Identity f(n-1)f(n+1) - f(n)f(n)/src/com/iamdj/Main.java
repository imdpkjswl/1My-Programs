package com.iamdj;

/**
 * find n-1th, nth and (n+1)-th Fibonacci numbers. Evaluate the expression and display the result.
 * But this can be done in O(1) time using Cassini’s Identity which states that:
 *  f(n-1)*f(n+1) - f(n*n) = (-1)^n
 *
 *  Time complexity: O(1)
 */
public class Main {
    // Java implementation to demonstrate working of Cassini’s Identity

    // Returns (-1)^n
    static int cassini(int n) {
        return (n & 1) != 0 ? -1 : 1;
    }



    // Driver method
    public static void main(String args[]) {
        int n = 5;
        System.out.println(cassini(n));
    }

}
