package com.company;

import java.util.*;
/**
 * Time complexity: O(n^2)
 * Space complexity: O(n^2)
 */
public class Main {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter size of matrix(mxn):");
        int m = in.nextByte();
        int n = in.nextByte();
        int [][] mat = new int[m][n];
        System.out.println("Enter the matrix elements:");
        // Matrix as input
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter the value of K:");
        int k = in.nextInt();



        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++){
                mat[i][j] = mat[i][j]*k;
            }
        }



        // Print matrix
        System.out.println("The result is:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }



    }
}
