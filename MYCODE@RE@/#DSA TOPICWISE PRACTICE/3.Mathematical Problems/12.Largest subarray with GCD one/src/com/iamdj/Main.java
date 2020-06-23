package com.iamdj;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/*
There is an array with n elements. Find length of the largest subarray having GCD equal to 1. If no subarray with GCD 1, then print -1.

Examples :

Input  : 1 3 5
Output : 3

Input : 2 4 6
Output :-1
 */
public class Main {
        static int gcd(int a, int b){
            if(a == 0)
                return b;
            return gcd(b%a,a);
        }

    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of array:");
        int n = Integer.parseInt(bf.readLine());

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
            arr[i] = Integer.parseInt(bf.readLine());

        int g = gcd(arr[0] , arr[1]);

        for(int i=2;i<n;i++)
            g = gcd(g, arr[i]);


        if(g == 1)
            System.out.println(n);
        else
            System.out.println("-1"); // gcd not equals to One.


    }
}
