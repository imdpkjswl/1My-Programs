package com.company;
import java.util.Scanner;
/**
 * Time complexity: O(m*n);
 * Auxiliary space: O(1)
 */
/*
// My Logic: THis program is working for nxn matrix BUT NOT FOR mxn.Follow below for mxn.
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of matrix(mxn)");
        int m = in.nextByte();
        int n = in.nextByte();

        int[][] mat = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = in.nextInt();
            }
        }

        System.out.println("The spiral form of the given matrix is:");
        // Logic to print spiral form
        int i, k = 0, l = 0;

//         k - starting row index
//         m - ending row index
//         l - starting column index
//         n - ending column index
//         i - iterator through each elements

        while(k < m && l < n) {

            for(i=k;i<n;i++) {
                System.out.print(mat[i][k]+" ");
            }
            k++;

            for(i=k;i<m;i++) {
                System.out.print(mat[m-1][i]+" ");
            }
            m--;

            if(k<m) {
                for(i= m-1;i>=l;i--) {
                    System.out.print(mat[i][n-1]+" ");
                }
                n--;
            }

            if(l<n) {
                for(i=n-1;i>=k;i--) {
                    System.out.print(mat[l][i]+" ");
                }
                l++;
            }



        }


    }
}
*/


class Main {

    static int R = 4;
    static int C = 4;

    // function to print the required traversal
    static void counterClockspiralPrint(int m,int n, int arr[][]) {

        int i, k = 0, l = 0;

    /* k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator */

        // initialize the count
        int cnt = 0;

        // total number of
        // elements in matrix
        int total = m * n;

        while (k < m && l < n)
        {
            if (cnt == total)
                break;

            // Print the first column
            // from the remaining columns
            for (i = k; i < m; ++i)
            {
                System.out.print(arr[i][l] + " ");
                cnt++;
            }
            l++;

            if (cnt == total)
                break;

            // Print the last row from
            // the remaining rows
            for (i = l; i < n; ++i)
            {
                System.out.print(arr[m - 1][i] + " ");
                cnt++;
            }
            m--;

            if (cnt == total)
                break;

            // Print the last column
            // from the remaining columns
            if (k < m)
            {
                for (i = m - 1; i >= k; --i)
                {
                    System.out.print(arr[i][n - 1] + " ");
                    cnt++;
                }
                n--;
            }

            if (cnt == total)
                break;

            // Print the first row
            // from the remaining rows
            if (l < n)
            {
                for (i = n - 1; i >= l; --i)
                {
                    System.out.print(arr[k][i] + " ");
                    cnt++;
                }
                k++;
            }
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        // Function calling
        counterClockspiralPrint(R, C, arr);
    }
}