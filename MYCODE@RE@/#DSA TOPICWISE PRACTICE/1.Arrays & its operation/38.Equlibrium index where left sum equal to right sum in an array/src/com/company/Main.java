package com.company;

import java.util.*;

/**
 * Time complexity: O(n^2)
 * Space Complexity: O(1)
 */

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) arr[i] = in.nextInt();

        int sum1=0;
        int sum2=0;

        // Search from left side
        for(int i=0;i<=n-2;i++){
            sum1 += arr[i];
            for(int j=i+1;j<=n-1;j++){
                sum2 += arr[j];
            }
            if(sum1 == sum2){
                System.out.println("The equilibrium index(LeftToRight) is:  "+i);
            }
            sum2 = 0;
        }
        // Note: i is:  { 0__i } == { i+1__(n-1) } wil  be equilibrium.
        //              LEFT SIDE     RIGHT SIDE
    }
}