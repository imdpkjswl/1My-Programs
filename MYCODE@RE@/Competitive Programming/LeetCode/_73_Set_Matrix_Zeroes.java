import java.util.*;

// Fill with ZERO of current row and column of zero element using in-place technique.
class _73_Set_Matrix_Zeroes {

	public static void setZeroes(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					// filling columns with Infinity
					for (int c = 0; c < matrix.length; c++) {
						if (matrix[c][j] != 0)
							matrix[c][j] = Integer.MAX_VALUE;
					}
					// filling rows with Infinity
					for (int r = 0; r < matrix[0].length; r++) {
						if (matrix[i][r] != 0)
							matrix[i][r] = Integer.MAX_VALUE;
					}
				}
			}
		}

		// Make all infinity element to zero
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == Integer.MAX_VALUE) {
					matrix[i][j] = 0;
				}
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matrix = new int[][] {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
		setZeroes(matrix);
		System.out.println();
	}
}