package com.iamdj;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // method to return gcd of two numbers
    static int gcd(int a, int b)
    {
        if(a == 0) {
            return b;
        }
        return gcd(b %a, a);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of matrix(mxn):");
        int m = in.nextInt();
        int n = in.nextInt();

        int[][] mat = new int[m][n];
        System.out.println("Enter matrix elements:");
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                mat[i][j] = in.nextInt();


        int g = 1;

        int[] temp = new int[n]; int t = 0;

        // gcd value of each column
        boolean flag = true;
        for(int i=0;i<n;i++) {   // column
            for (int j = 2; j < m; j++) {  // row
                if(flag){
                    g = gcd(mat[0][i], mat[1][i]);
                    flag = false;
                }
                g = gcd(g, mat[j][i]);
            }
            temp[t++] = g;
            flag = true;
        }

        System.out.println(Arrays.toString(temp)); // print max gcd value of each column


        // Assigning temp column values to each column of matrix.
        t =0;
        for(int i=0;i<n;i++) {  // column
            for (int j = 0; j < m; j++) { // row
                 mat[j][i] = temp[t];
            }
            t++;
        }


        // print matrix
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }


    }
}
