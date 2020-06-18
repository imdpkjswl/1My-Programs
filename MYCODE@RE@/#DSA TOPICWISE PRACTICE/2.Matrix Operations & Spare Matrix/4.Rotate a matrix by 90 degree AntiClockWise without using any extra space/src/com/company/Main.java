package com.company;

import java.util.Scanner;

/**  The idea is to find the transpose of the matrix and then reverse the columns of the transposed matrix.
 * Time Complexity: O(n^2) , due to nested loop
 * Space Complexity: O(1)
 */

public class Main {

    // Function for do transpose of matrix
    static void transpose(int[][] mat, int n)
    {
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++) {
                int temp = mat[j][i];  // preserve the element
                mat[j][i] = mat[i][j]; // swap
                mat[i][j] = temp;  // revert back
            }
    }


    // After transpose we swap elements of column one by one
    // for finding left rotation of matrix by 90 degree
    static void reverseColumns(int[][] mat, int n)
    {
        for (int i = 0; i < n; i++)
            for (int j = 0, k = n - 1;j < k; j++, k--) {
                int temp = mat[j][i];
                mat[j][i] = mat[k][i];
                mat[k][i] = temp;
            }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        System.out.println("Enter size n:");
        n = in.nextInt();
        int[][] mat = new int[n][n];  // input data
        // input as a matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = in.nextInt();
            }
        }

        transpose(mat,n);
        reverseColumns(mat,n);


        // print rotated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
