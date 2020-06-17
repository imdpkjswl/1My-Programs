package com.company;

import java.util.Scanner;

/**
 * Naive method:
 * Time complexity: O(n^2)
 * Space complexity: O(1)
 */
/*
class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) arr[i] = in.nextInt();

        boolean flag = true;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] <= arr[j]){
                    flag = false;// used to check discontinuity from j to n-1.that means false.
                }
            }
            if(flag){
                System.out.print(arr[i]+"  ");
            }
            flag = true;
        }


    }
}
*/


/**
 * Efficient Method: Scanning from right to left and keep track of maximum till now.
 * When maximum changes its value, print it.
 * Time complexity: O(n)
 * Space complexity: O(1)
 */

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) arr[i] = in.nextInt();

        System.out.println("The Leader elements are:");
        int max = arr[n-1];
        System.out.print(arr[n-1]+" ");

        for(int i=n-2;i>=0;i--){
            if(max < arr[i]){
                max = arr[i];
                System.out.print(arr[i]+" ");
            }
        }


    }
}