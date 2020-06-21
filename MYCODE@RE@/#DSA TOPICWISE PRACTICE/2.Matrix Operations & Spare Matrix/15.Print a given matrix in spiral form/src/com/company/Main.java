package com.company;

import java.util.Scanner;

/**
 * Time complexity: O(m*n);
 * Auxiliary space: O(1)
 */
public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of matrix(mxn)");
        int m = in.nextByte();
        int n = in.nextByte();

        int[][] mat = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = in.nextInt();
            }
        }

        System.out.println("The spiral form of the given matrix is:");
        // Logic to print spiral form
        int i, k = 0, l = 0;
        /**
        k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator through each elements
        */
        while(k < m && l < n) {
            // Print the first row from the remaining rows
            for( i=l;i<n;i++ ) {
                System.out.print(mat[k][i]+" -> ");
            }
            k++;

            // Print the last column from the remaining columns
            for(i=k;i<m;i++) {
                System.out.print(mat[i][n-1]+" -> ");
            }
            n--;

            // Print the last row from the remaining rows
            if(k<m) {
                for(i=n-1;i>=l;i--) {
                    System.out.print(mat[m-1][i]+" -> ");
                }
                m--;
            }

            // Print the first column from the remaining columns
            if(l<n) {
                for(i=m-1;i>=k;i--) {
                    System.out.print(mat[i][l]+" -> ");
                }
                l++;
            }
        }



    }
}
