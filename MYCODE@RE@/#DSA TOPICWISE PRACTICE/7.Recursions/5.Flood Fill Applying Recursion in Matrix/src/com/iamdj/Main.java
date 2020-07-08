package com.iamdj;

import java.util.Scanner;

public class Main {

    static void floodFill(int[][] mat , int r, int c, int toFill, int prevFill) {
        int rows = mat.length;
        int cols = mat[0].length;

        if(r < 0 || r >= rows || c < 0 || c >= cols)
            return;

        if(mat[r][c] != prevFill) // current color not equal to previous color
            return;

        mat[r][c] = toFill; // fill color

        floodFill(mat, r-1 ,c , toFill, prevFill);
        floodFill(mat, r ,c-1 , toFill, prevFill);
        floodFill(mat, r+1 ,c , toFill, prevFill);
        floodFill(mat, r ,c+1 , toFill, prevFill);
    }




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take matrix as input
        int rows, cols;
        System.out.println("Enter rows and columns:");
        rows = sc.nextByte();
        cols = sc.nextByte();
        int[][] mat = new int[rows][cols];
        System.out.println("Enter matrix:");
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                mat[i][j] = sc.nextInt();

        // Take necessary input
        System.out.println("Enter row and col to fill color:");
        int r, c;
        r = sc.nextInt();
        c = sc.nextInt();

        System.out.println("Enter the current color:");
        int prevFill = sc.nextInt();
        System.out.println("Enter the color to fill:");
        int toFill = sc.nextInt();

        // call function
        floodFill(mat, r, c, toFill, prevFill);

        // print result
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                System.out.print(mat[i][j] +" ");
            }
            System.out.println();
        }

    }
}
