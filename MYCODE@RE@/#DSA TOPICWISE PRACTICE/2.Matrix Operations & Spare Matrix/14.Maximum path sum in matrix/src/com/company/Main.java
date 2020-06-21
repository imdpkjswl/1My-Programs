package com.company;

import java.util.*;
/**
 * Time complexity: O(n^2)
 * Space complexity: O(1)
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
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = in.nextInt();
            }
        }

        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++)
            visited[i] = false; // marks as unvisited.

        int index  = 0;
        int[] path = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(max < mat[i][j] && !visited[j]) {
                    max = mat[i][j];
                    index = j;
                }
            }

            visited[index] = true;
            path[i] = max;
            max = Integer.MIN_VALUE;
        }

        int maxSum =0;
        for(int x: path)
            maxSum+= x;

        System.out.println("The maximum path sum is:  "+maxSum+" and path is:  ");
        System.out.print(Arrays.toString(path));


    }
}

/*
Not Working in this case:
Enter size of matrix(mxn):
4 6
Enter the matrix elements:
10 10 2 0 20 4
1 0 0 30 2 5
0 10 4 0 2 0
1 0 2 20 0 4
The maximum path sum is:  64 and path is:
[20, 30, 10, 4, 0, 0]

Note: max sum is 74.

 */