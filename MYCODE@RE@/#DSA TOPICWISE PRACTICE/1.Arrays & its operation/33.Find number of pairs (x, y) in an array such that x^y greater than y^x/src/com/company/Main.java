package com.company;

import java.util.*;


/** Brute Force Approach:
 * Time complexity: O(n^2)
 * Space complexity: O(1)
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of first array:");
        int n1 = in.nextInt();
        int[] a1 = new int[n1];
        System.out.println("Enter the elements of first array:");
        for(int i=0;i<n1;i++) a1[i] = in.nextInt();

        System.out.println("Enter the size of second array:");
        int n2 = in.nextInt();
        int[] a2 = new int[n2];
        System.out.println("Enter the elements of second array:");
        for(int i=0;i<n2;i++) a2[i] = in.nextInt();


        int count =0;
        for(int i=0;i<n1;i++) {
             for(int j=0;j<n2;j++) {
                 if(Math.pow(a1[i],a2[j]) > Math.pow(a2[j],a1[i])) {
                     count++;
                 }
             }
        }

        System.out.println("The no. of pairs are:  "+count);



    }
}
