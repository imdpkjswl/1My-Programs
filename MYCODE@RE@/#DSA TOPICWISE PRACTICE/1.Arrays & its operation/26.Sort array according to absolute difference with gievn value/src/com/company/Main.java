package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        int[] diff = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println("Enter the value of K");
        int k = sc.nextInt();

        for(int i=0;i<n;i++)
            diff[i] = Math.abs(k - arr[i]);


        // Here, the idea is if we sort abs diff array,then the arr will their own bcuz both are mutually related.
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(diff[j] > diff[j+1]){
                    int temp1, temp2;
                    temp1 = diff[j];
                    diff[j] = diff[j+1];
                    diff[j+1] = temp1;

                    temp2 = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp2;
                }
            }
        }


        System.out.println("The sorted array according to absolute difference as given "+k);
        System.out.println(Arrays.toString(arr));

    }
}
