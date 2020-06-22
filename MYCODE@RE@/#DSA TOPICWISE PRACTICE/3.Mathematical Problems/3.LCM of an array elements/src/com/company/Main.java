package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Time complexity: O(n^2)
 * Space complexity: O(1)
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
        System.out.println("Enter the size of an array:");
        int n = in.nextByte();
        if(n > 1) {

            int[] arr = new int[n];
            System.out.println("Enter the array elements:");
            for (int i = 0; i < n; i++)
                arr[i] = in.nextInt();

            int LCM;
            LCM = lcm(arr[0], arr[1]);
            for (int i = 2; i < n; i++) {
                LCM = lcm(LCM, arr[i]);
            }
            System.out.println("The LCM of " + Arrays.toString(arr) + " is:  " + LCM);
        }else
        {
            System.out.println("Array elements must be more than one.");
        }
    }
}
