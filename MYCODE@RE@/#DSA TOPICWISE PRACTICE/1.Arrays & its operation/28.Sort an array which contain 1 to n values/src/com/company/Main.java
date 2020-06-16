package com.company;

import java.util.Arrays;
import java.util.Scanner;

/** Note: This question does not say about dis-contiguous element.So array element must be contiguous.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
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

        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }

        System.out.println("The sorted array is:");
        System.out.println(Arrays.toString(arr));

    }
}
