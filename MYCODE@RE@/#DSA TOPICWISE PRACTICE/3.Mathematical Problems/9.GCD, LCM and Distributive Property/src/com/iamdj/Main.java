package com.iamdj;

import java.util.Scanner;

/**
 * Distributive Property:
 * GCD(LCM (x, y), LCM (x, z)) = LCM(x, GCD(y, z))
 */
public class Main {

    //method to return GCD of two numbers
    static int gcd(int a, int b) {
        if(a==0)
            return b;
        return gcd(b%a,a);
    }

    // method to return LCM of two numbers
    static int lcm(int a, int b)
    {
        int large = Math.max(a, b);
        int small = Math.min(a, b);

        for(int i = large;  ; i += large) {
            if(i % small == 0)
                return i;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = in.nextInt();
        System.out.println("Enter second number");
        int y = in.nextInt();
        System.out.println("Enter third number");
        int z = in.nextInt();

        // Applying distributive property
        int temp = gcd(y, z);
        int result = lcm(x, temp);

        System.out.println(result);
    }
}
