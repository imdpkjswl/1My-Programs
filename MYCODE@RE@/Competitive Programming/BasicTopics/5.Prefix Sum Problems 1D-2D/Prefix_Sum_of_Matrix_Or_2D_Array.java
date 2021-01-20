/*
Prerequisite: Prefix Sum – 1D

A simple solution is to find psa[i][j] by traversing and adding values from a[0][0]
to a[i][j]. Time complexity of this solution is O(R * C * R * C).

An efficient solution is to use previously computed values to compute psa[i][j].
Unlike 1D array prefix sum, this is tricky, here if we simply add psa[i][j-1]
and psa[i-1][j], we get sum of elements from a[0][0] to a[i-1][j-1] twice, so
we subtract psa[i-1][j-1].

Example:
psa[3][3] = psa[2][3] + psa[3][2] - psa[2][2] + a[2][2]
          = 6 + 6 - 4 + 1
          = 9


The general formula:
psa[i][j] = psa[i-1][j] + psa[i][j-1] - psa[i-1][j-1] + a[i][j]

Corner Cases (First row and first column)
If i = 0 and j = 0
   psa[i][j] = a[i][j]
If i = 0 and j > 0
   psa[i][j] = psa[i][j-1] + a[i][j]
If i > 0 and j = 0
   psa[i][j] = psa[i-1][j] + a[i][j]

Time Complexity : O(R*C)
Auxiliary Space : O(R*C)
*/


// Java program to find prefix sum of 2D array
import java.util.*;

class Prefix_Sum_of_Matrix_Or_2D_Array {

	// calculating new array
	public static void prefixSum2D(int[][] a) {
		int R = a.length; // size of row
		int C = a[0].length; // size of column

		// prefix sum array is to use previously computed values to compute psa[i][j]
		int[][] psa = new int[R][C];

		psa[0][0] = a[0][0];

		// Filling first row and first column
		for (int i = 1; i < C; i++)
			psa[0][i] = psa[0][i - 1] + a[0][i];
		for (int i = 1; i < R; i++)
			psa[i][0] = psa[i - 1][0] + a[i][0];

		// updating the values in the cells as per the general formula.
		for (int i = 1; i < R; i++)
			for (int j = 1; j < C; j++)
				// values in the cells of new array are updated
				psa[i][j] = psa[i - 1][j] + psa[i][j - 1] - psa[i - 1][j - 1] + a[i][j];

		// print the 2D prefix sum matrix
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++)
				System.out.print(psa[i][j] + " ");
			System.out.println();
		}
	}

	// driver code
	public static void main(String[] args) {
		int arr1[][] = {
			{ 1, 1, 1, 1 },
			{ 1, 1, 1, 1 },
			{ 1, 1, 1, 1 },
			{ 1, 1, 1, 1 }
		};

		int arr2[][] = {
			{10, 20, 30 },
			{ 5, 10, 20 },
			{ 2,  4,  6 }
		};

		prefixSum2D(arr2);
	}
}
