package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  Time Complexity: O(m*n), The worst case occurs when all elements of a1[] are greater than all elements of a2[].i.e. O(n^2).
 *  Otherwise, Average Time Complexity: O(nLog(n)) due to sorted of a2[].
 *  Space complexity: O(1)
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of first array:");
        int m = in.nextInt();
        int[] a1 = new int[m];
        System.out.println("Enter element:");
        for(int i=0;i<m;i++) a1[i] = in.nextInt();

        System.out.println("Enter the size of second array:");
        int n = in.nextInt();
        int[] a2 = new int[n];
        System.out.println("Enter element:");
        for(int i=0;i<n;i++) a2[i] = in.nextInt();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a1[i] > a2[j]){  // swap with minimum element present in a2
                    int t;
                    t = a1[i];
                    a1[i] = a2[j];
                    a2[j] = t;
                }
            }
        }// now, a1 got sorted.

        //need to sort a2.
        Arrays.sort(a2);


        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

    }
}
