package com.iamdj;

import java.util.Scanner;

class Main {
    public static void main(String[] args ) {

        int m, n, p, q, i, j, k;

        Scanner in = new Scanner(System.in);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Enter the number of rows and columns of first matrix");
        m = in.nextInt(); // Row of first matrix
        n = in.nextInt(); // Row of second matrix

        int[][] first = new int[m][n]; //  array type variable for first matrix

        System.out.println("Enter elements of first matrix");

        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++)
                first[i][j] = in.nextInt();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Enter the number of rows and columns of second matrix");
        p = in.nextInt();
        q = in.nextInt();

        if (n != p)
            System.out.println("The matrices can't be multiplied with each other.");
        else
        {
            int[][] second = new int[p][q]; //  array type variable for second matrix
            int[][] multiply = new int[m][q]; //  array type variable for Product matrix

            System.out.println("Enter elements of second matrix");

            for (i = 0; i < p; i++)
                for (j = 0; j < q; j++)
                    second[i][j] = in.nextInt();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            for (i = 0; i < m; i++)
            {
                for (j = 0; j < q; j++)
                {
                    int sum=0;
                    for (k = 0; k < p; k++)
                    {
                        sum = sum + first[i][k]*second[k][j];
                    }

                    multiply[i][j] = sum;
                }
            }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            System.out.println("Product of the matrices:");
            // m*n X p*q  = m*q
            for (i = 0; i < m; i++)
            {
                for (j = 0; j < q; j++)
                    System.out.print(multiply[i][j]+"\t");

                System.out.print("\n");
            }
        }
    }
}

