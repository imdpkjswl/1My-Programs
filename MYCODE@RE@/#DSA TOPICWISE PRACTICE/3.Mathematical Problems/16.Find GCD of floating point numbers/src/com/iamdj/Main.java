package com.iamdj;

import java.util.*;

public class Main {

    static double gcd(double a, double b) {

        if (a < b)
            return gcd(b, a);

        // base case
        if (Math.abs(b) < 0.001)
            return a;
        else
            return (gcd(b, (a - Math.floor(a / b) * b)));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number:");
        double a = in.nextDouble();

        System.out.println("Enter second number:");
        double b = in.nextDouble();


        double GCD = gcd(a ,b);

        System.out.println(GCD);

    }
}
