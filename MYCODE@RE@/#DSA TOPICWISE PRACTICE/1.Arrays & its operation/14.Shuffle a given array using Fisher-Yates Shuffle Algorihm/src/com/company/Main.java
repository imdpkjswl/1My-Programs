package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * Fisher–Yates shuffle Algorithm works in O(n) time complexity. The assumption here is, we are given
 * a function rand() that generates random number in O(1) time.
 * The idea is to start from the last element, swap it with a randomly selected element from the whole
 * array (including last). Now consider the array from 0 to n-2 (size reduced by 1), and repeat the
 * process till we hit the first element.

 *Following is the detailed algorithm

  To shuffle an array a of n elements (indices 0..n-1):
    for i from n - 1 down to 1 do
         j = random integer with 0 <= j <= i
         exchange a[j] and a[i]
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();


        // Creating a object for Random class
        Random rd = new Random();

        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0.
        for (int i = n-1; i > 0; i--) {

            // Pick a random index from 0 to i(excluding (i+1)).
            int j = rd.nextInt(i+1);

            // Swap arr[i] with the element at random index
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }




        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");

    }
}