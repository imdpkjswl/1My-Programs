package com.company;

import java.lang.reflect.Array;
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

        int[] ans = new int[101]; // store unique elements

        int[] table = new int[101];
        Arrays.fill(table,-99); // fill table  with -99.
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(table[mat[i][j]] == mat[i][j] || table[mat[i][j]] == -999){ // check already occupied or not.
                    table[mat[i][j]] = -999;
                }else
                    table[mat[i][j]] = mat[i][j];

            }
        }

        int k=0;
        for(int i=0;i<101;i++){
            if(table[i] != -99 && table[i] != -999 ){
                ans[k++] = table[i]; // store element except -99 and -999.
            }
        }

        System.out.println("The distinct elements are:");
        for(int i=0;i<k;i++){
            System.out.print(ans[i]+"  ");
        }

    }
}
