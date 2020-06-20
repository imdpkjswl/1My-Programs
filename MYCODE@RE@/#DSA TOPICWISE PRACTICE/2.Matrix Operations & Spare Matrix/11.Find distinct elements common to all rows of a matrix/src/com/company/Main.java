package com.company;

import java.util.*;
/** My Method after thinking 2 hrs.
 * Steps to be followed as:
 * 1. Take an array name "firstRow" and store the all values of first row of matrix.
 * 2. Secondly, Take another array name "cmp" that will monitor the existence of common value in each row.
 * 3. Now in Nested loop,compare all the values of "firstRow" array to the next rows and next columns and increment "cmp" by 1.
 * 4. BUT,also need to resist to override of values that is present in next row( ignore repeated value) using cmp[k] == i-1.
 *    Here, cmp[k] value ,must be equal to i-1. Then increment cmp by 1 for every 'i'th value.
 * 5. At last, compare using cmp[i] == n-1, that shows 'i'th value must be equal to n-1.(In a row must having atleast one element
 *    that will be common in each row.HENCE One element must be appear 'n'(no. of row) in all row.
 * Time complexity: O(n^3)
 * Space complexity: O(n)
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter size of matrix:");
        int n = in.nextByte();
        int[][] mat = new int[n][n];
        System.out.println("Enter the matrix elements:");
        // Matrix as input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = in.nextInt();
            }
        }
        int[] firstRow = new int[n];

        for (int i = 0; i < n; i++)
            firstRow[i] = mat[0][i];  // store first row values.

        int[] cmp = new int[n];
        Arrays.fill(cmp, 0); // Initially contain zero in each index of cmp.


        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n;k++) {  // this loop used to iterate zero index to n-1 in firstRow array.
                    if (firstRow[k] == mat[i][j]  && cmp[k] == i-1) { // compare firstRow values to matrix mat[i][j] AND check cmp not exceeded i-1 value of ith iteration.
                        cmp[k] += 1;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(cmp)); // for verification purpose
        System.out.println("The common elements in all rows of matrix are:");
        for(int i=0;i<n;i++){
            if(cmp[i] == n-1){ // ith index value must be containing all rows -1 value.
                System.out.print(firstRow[i]+"  ");
            }
        }

    }
}
/*
Output:

Enter size of matrix:
5

Enter the matrix elements:
12 1 14 3 16
14 2 1 3 35
14 1 14 3 11
14 25 3 2 1
1 18 3 21 14

[0, 4, 4, 4, 0]
The common elements in all rows of matrix are:
1  14  3
 */