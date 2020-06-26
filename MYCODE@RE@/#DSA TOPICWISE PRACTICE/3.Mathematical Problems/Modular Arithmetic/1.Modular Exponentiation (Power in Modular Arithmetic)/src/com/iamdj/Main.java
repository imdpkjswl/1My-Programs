package com.iamdj;

import java.util.Scanner;
/*
// Given three numbers x, y and p, computed (x^y) % p in O(y)
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x = in.nextInt();
        System.out.println("Enter the value of y:");
        int y = in.nextInt();
        System.out.println("Enter the value of p:");
        int p = in.nextInt();

        int result = 1;
        for(int i=1;i<=y;i++){
            result = result*x;
        }
        result = result%p;

        System.out.println(result);

    }
}
*/


/**
 *  Iterative Function to calculate (x^y)%p in  O(log y)
 */
class Main {

    static int power(int x, int y, int p) {

        // Initialize result
        int res = 1;

        // Update x if it is more than or equal to p
        x = x % p;

        if (x == 0) return 0; // In case x is divisible by p;

        while (y > 0) {

            // If y is odd, multiply x with result
            if((y & 1)==1)
                res = (res * x) % p;

            // y must be even now
            // y = y / 2
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }

    // Driver Program to test above functions
    public static void main(String args[]) {

        int x = 2;
        int y = 5;
        int p = 13;
        System.out.println("Power is " + power(x, y, p));
    }
}