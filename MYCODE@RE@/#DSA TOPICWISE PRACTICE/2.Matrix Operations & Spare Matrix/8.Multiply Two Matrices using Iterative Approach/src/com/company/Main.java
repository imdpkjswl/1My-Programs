package com.company;

import java.util.*;
/**
 * Time complexity: O(n^3)
 * Space complexity: O(n^2)
 */
public class Main {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter size of first matrix(mxn):");
        int m = in.nextByte();
        int n = in.nextByte();
        int [][] mat1 = new int[m][n];
        System.out.println("Enter the matrix elements:");
        // Matrix as input
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat1[i][j] = in.nextInt();
            }
        }


        System.out.println("Enter size of second matrix(pxq):");
        int p = in.nextByte();
        int q = in.nextByte();
        int [][] mat2 = new int[p][q];
        System.out.println("Enter the matrix elements:");
        // Matrix as input
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                mat2[i][j] = in.nextInt();
            }
        }
        // 2D array that store multiplication result
        int [][] result = new int[n][n];

        // Check for validation of matrix multiplications
        if(n != p){
            System.out.println("Matrix multiplication not possible!!!");
            System.exit(0);
        }

        for(int i=0;i<m;i++) {
            for(int j=0;j<q;j++){
                result[i][j] = 0;
                for(int k=0;k<n;k++){
                    result[i][j] += mat1[i][k]*mat2[k][j];
                }
            }
        }



        // Print matrix
        System.out.println("The result of multiplication is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(result[i][j]+"  ");
            }
            System.out.println();
        }



    }
}
