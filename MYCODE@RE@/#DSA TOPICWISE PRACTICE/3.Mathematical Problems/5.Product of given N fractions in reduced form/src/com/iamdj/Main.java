package com.iamdj;

import java.util.Scanner;

/**
 * Time complexity: O(n^2)
 * Space complexity: O(1)
 */
public class Main {
    

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = in.nextByte();

        double[] nums = new double[n];
        double[] dens = new double[n];
        System.out.println("Enter the numerator elements:");
        for (int i = 0; i < n; i++)
            nums[i] = in.nextDouble();


        System.out.println("Enter the denominator elements:");
        for (int i = 0; i < n; i++)
            dens[i] = in.nextDouble();

        double ansNum = 1;
        double ansDen = 1;


        for(int i=0;i<n;i++) {
            ansNum *= nums[i];
            ansDen *= dens[i];
        }

        System.out.println("Answer: "+ansNum +"/"+ansDen);

        // Doubt
        for(int i = 2; i<100;i++) {
            if((ansNum%i) ==0 && (ansDen%i) ==0) {
               ansNum  = ansNum/i;
               ansDen = ansDen/i;
               i = i-1;
            }
        }

        // Trying to print values without decimal points.
        System.out.println("Answer in reduced form:  "+String.format("%.0f",ansNum)+"/"+String.format("%.0f",ansDen));


    }
}

/*

Input : N = 3
        num[] = { 1, 2, 5 }
        den[] = { 2, 1, 6 }
Output : 5/6
Product of 1/2 * 2/1 * 5/6 is 10/12.
Reduced form of 10/12 is 5/6.
 */