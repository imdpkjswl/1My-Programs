package com.iamdj;

import java.util.Scanner;

/**
 * Time complexity: O(n)
 * Auxiliary Space: O(1)
 */
public class Main {

    static int gcd(int a, int b){
        if(a == 0)
            return  b;
        return gcd(b%a,a);
    }
    static int fib(int n) {
        double base = (1 + Math.sqrt(5)) / 2;

        return (int) Math.round(Math.pow(base, n) / Math.sqrt(5));
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of M:");
        int M = in.nextInt();
        System.out.println("Enter the value of N:");
        int N = in.nextInt();

        int g1 ,g2;
        g1 = g2 = 0;

        for(int i=1;i<=M;i++) {
            g1 = fib(i);
        }
        for(int i=1;i<=N;i++) {
            g2 = fib(i);
        }

        System.out.println("GCD OF Mth Fib= "+g1+" and Nth Fib= "+g2+" is:  "+gcd(g1,g2));
    }
}