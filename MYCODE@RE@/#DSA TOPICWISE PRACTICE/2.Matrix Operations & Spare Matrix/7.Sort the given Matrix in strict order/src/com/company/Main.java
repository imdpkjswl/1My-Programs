package com.company;

import java.util.*;
/**
 * Time complexity: O(n^4)
 * Space complexity: O(1)
 */
/*
public class Main {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter size of matrix(n):");
        int n = in.nextInt();

        int [][] arr = new int[n][n];
        // Matrix as input
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = in.nextInt();
            }
        }



        // Visiting each elements of matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                // After visiting each node, Comparing with rest all elements.
                for(int a=0;a<n;a++){
                    for(int b=0;b<n;b++){
                        if(arr[i][j] < arr[a][b]){
                            int temp;
                            temp = arr[i][j];
                            arr[i][j] = arr[a][b];
                            arr[a][b] = temp;
                        }
                    }
                }
            }
        }

        // Print matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }



    }
}
 */


/**
 * Time complexity: O(n^2log2n)
 * Space complexity: O(n*n)
 */
public class Main {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter size of matrix(n):");
        int n = in.nextInt();

        int [][] arr = new int[n][n];
        int[] temp = new int[n*n];

        // Matrix as input
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = in.nextInt();
            }
        }



        int k=0;
        // Visiting each elements of matrix & copying to temporary array.
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               temp[k++] = arr[i][j];
            }
        }

        Arrays.sort(temp);  // sort the temp array

        k=0;
        // Copying back to given matrix.
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = temp[k++] ;
            }
        }


        // Print matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }



    }
}

/*
Output:

Enter size of matrix(n):
4

 5   7   8   12
 2   4  13    9
11  10   6    3
16  14  15    1

 1   2   3   4
 5   6   7   8
 9  10  11  12
13  14  15  16
 */