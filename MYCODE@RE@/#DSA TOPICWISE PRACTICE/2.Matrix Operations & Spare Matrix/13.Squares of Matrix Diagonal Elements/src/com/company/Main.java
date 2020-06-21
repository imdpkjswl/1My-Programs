package com.company;

import java.util.*;
/**
 * Time complexity: O(n^2)
 * Space complexity: O(1)
 */
public class Main {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter size of matrix(n):");
        int n = in.nextByte();
        int [][] mat = new int[n][n];
        System.out.println("Enter the matrix elements:");
        // Matrix as input
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = in.nextInt();
            }
        }

        System.out.println("Forward diagonal square is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j) // condition for forward diagonal
                    System.out.print(mat[i][j]*mat[i][j]+"  ");
            }
        }

        System.out.println();

        System.out.println("Backward diagonal square is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == n-1-j) // condition for backward diagonal
                    System.out.print(mat[i][j]*mat[i][j]+"  ");
            }
        }




    }
}
