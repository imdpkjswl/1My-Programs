package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Time complexity: O(n^2)
 * Space complexity: O(1)
 */
public class Main {


    // method to return gcd of two numbers
    static int gcd(int a, int b)
    {
        if(a == 0) {
            return b;
        }
        return gcd(b %a, a);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = in.nextByte();
        if(n > 1) {

            int[] arr = new int[n];
            System.out.println("Enter the array elements:");
            for (int i = 0; i < n; i++)
                arr[i] = in.nextInt();

            int GCD;
            GCD = gcd(arr[0], arr[1]);
            for (int i = 2; i < n; i++) {
                GCD = gcd(GCD, arr[i]);
            }
            System.out.println("The GCD of " + Arrays.toString(arr) + " is:  " + GCD);
        }else
        {
            System.out.println("Array elements must be more than one.");
        }
    }
}
