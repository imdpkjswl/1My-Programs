package com.company;

import java.util.Scanner;

/**
 * An efficient solution is based on below formula for LCM of two numbers ‘a’ and ‘b’:
 *  LCM(a, b) = if (m*large % small == 0)
 *                 return lcm;   where, m = 1,2,3, ...
 */
public class Main {


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
        System.out.println("Enter two number to find LCM:");
        int a = in.nextInt();
        int b = in.nextInt();

        int lcm = lcm(a, b);
        System.out.println("The LCM of "+a+" & "+b+" is:  "+lcm);
    }
}
