package com.company;

import java.util.Scanner;

/**
 * Time Complexity: O(n^2) , due to nested loop
 * Space Complexity: O(n^2) ,due to temporary array
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        System.out.println("Enter size n:");
        n = in.nextInt();


        int[][] mat = new int[n][n];  // input data
        int[][] matR = new int[n][n]; // store result

        // input as a matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = in.nextInt();
            }
        }


        // Matrix rotation logic
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matR[i][j] = mat[n - 1 - j][i];
            }
        }

        // print rotated matrix
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(matR[j][i] + "  ");
            }
            System.out.println();
        }

    }
}
