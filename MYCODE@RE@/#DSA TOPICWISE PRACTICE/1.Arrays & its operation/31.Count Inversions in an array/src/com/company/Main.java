package com.company;

import java.util.Scanner;

// Inversion means(As i observed), minimum no. of linear swap required to sort the array.
/** Method 1
 * Inversion Count for an array indicates – how far (or close) the array is from being sorted.
   If array is already sorted then inversion count is 0. If array is sorted in reverse order
   that inversion count is the maximum.
 * Formally speaking, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j

 * Time complexity: O(n)
 * Auxiliary space: O(1)
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the no. of elements:");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int min =0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    min++;
                }
            }
        }

        System.out.println("Number of inversions are: "+min);

    }
}
