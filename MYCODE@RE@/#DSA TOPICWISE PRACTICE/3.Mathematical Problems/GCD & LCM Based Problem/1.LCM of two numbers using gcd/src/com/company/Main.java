package com.company;

import java.util.Scanner;

/**
 * An efficient solution is based on below formula for LCM of two numbers ‘a’ and ‘b’:
 *  a x b = LCM(a, b) * GCD (a, b)
 *  LCM(a, b) = (a x b) / GCD(a, b)
 */
public class Main {

    // Recursive method to return gcd of a and b
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    // method to return LCM of two numbers
    static int lcm(int a, int b)
    {
        return (a*b)/gcd(a, b);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number to find LCM:");
        int a = in.nextInt();
        int b = in.nextInt();

        int lcm = lcm(a, b);
        System.out.println("The LCM of "+a+" & "+b+" is:  "+lcm);
    }
}
