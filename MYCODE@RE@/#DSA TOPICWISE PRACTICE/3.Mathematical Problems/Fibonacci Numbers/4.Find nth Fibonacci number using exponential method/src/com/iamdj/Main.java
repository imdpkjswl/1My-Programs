package com.iamdj;

import java.util.Scanner;

/**
 * Time complexity: O(3^n)
 * Space complexity: O(1)
 */
public class Main {
    static int nthFib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;

        return nthFib(n-1) + nthFib(n-2 ) + nthFib(n-3);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = in.nextInt();

        int result = nthFib(n);
        System.out.println("The "+n+"th Fib number:  "+result);
    }
}
