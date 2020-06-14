package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Brute Force Approach:
 * Time Complexity: O(n*m)  , n is size of first array & m is size of second array.
 * Auxiliary Space: O(n*m)
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = in.nextInt();
        System.out.println("Enter the element:");
        int[] a1 = new int[n];
        for(int i=0;i<n;i++) a1[i] = in.nextInt();

        System.out.println("Enter the value of m:");
        int m = in.nextInt();
        System.out.println("Enter the element:");
        int[] a2 = new int[m];
        for(int i=0;i<m;i++) a2[i] = in.nextInt();
        System.out.println("Enter the value of K:");
        int k = in.nextInt();

        int p = n*m;
        int[] sum = new int[p];

        int t=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                sum[t++] = a1[i] + a2[j];
            }
        }

        Arrays.sort(sum);
        System.out.println(Arrays.toString(sum));

        System.out.println("The "+k+" Maximum sum combinations:");
        for(int i=t-1;i>=t-k;i--){
            System.out.print(sum[i]+" ");
        }
    }
}

/*
Output:
Enter the value of n:
4
Enter the element:
5 2 4 1
Enter the value of m:
4
Enter the element:
3 6 8 1
Enter the value of K:
3
[2, 3, 4, 5, 5, 6, 7, 7, 8, 8, 9, 10, 10, 11, 12, 13]
The 3 Maximum sum combinations:
13 12 11
 */