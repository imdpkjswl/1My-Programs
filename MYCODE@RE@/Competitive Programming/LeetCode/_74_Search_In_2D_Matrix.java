class _74_Search_In_2D_Matrix {
	public static boolean searchMatrix(int[][] matrix, int target) {
		int r = 0;

		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] <= target) {
				r = i;
			}
		}

		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[r][i] == target) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int[][] matrix = new int[][] {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
		int target = 3;

		System.out.println(searchMatrix(matrix, target));
	}
}