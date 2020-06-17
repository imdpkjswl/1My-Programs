package com.company;

import java.util.Arrays;
import java.util.Scanner;
/**
 * Brute force may apply But it will not be efficient:
         boolean isPairSum(A[], N, X)
         {
            for (i = 0; i < N; i++) {
                for (j = 0; j < N; j++) {
                        if (A[i] + A[j] == X)
                            return true; // pair exists

                        if (A[i] + A[j] > X)
                            break; // as the array is sorted
                }
            }

            // No pair found with given sum.
            return false;
         }
 *Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */



/** Two pointer Method:
 * Time complexity: O(n)
 * Space complexity: O(1)
 */

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the no. of elements:");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println("Enter the value of x:");
        int x =sc.nextInt();

        int i=0;
        int j=n-1;

        while(i < j){
            if((arr[i]+ arr[j]) == x) {
                System.out.println("Pair found: "+arr[i]+" + " +arr[j]+" = "+x);
                System.exit(0);
            }else if(arr[i]+arr[j] > x){
                j--;
            }else if(arr[i] + arr[j] < x){
                i++;
            }
        }

        System.out.println("No such pair found in the given array:"+Arrays.toString(arr)+"that gives pair's sum = "+x);


    }
}
