package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m,n;
        System.out.println("Enter the size of image:");
        n = in.nextByte();
        char[][] image = new char[n][n];
        char[][] imageT = new char[n][n];

        System.out.println("Enter the image:");
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                image[i][j] = in.next().charAt(0);

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                imageT[j][n-1-i] = image[i][j];
            }
        }

        System.out.println("The 90 degree turned image is:");
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(imageT[i][j] + " ");
            }
            System.out.println();
        }

    }
}
