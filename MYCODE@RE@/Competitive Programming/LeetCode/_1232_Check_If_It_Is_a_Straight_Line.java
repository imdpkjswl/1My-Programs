class _1232_Check_If_It_Is_a_Straight_Line {
	public static double get_gradient(int x1, int y1, int x2, int y2) {
		// as long as the 2 given points are vertically aligned, we return a sentinel value to acknowledge the vertical alignment
		// regardless of whether the true gradient is "+ve infinity" or "-ve infinity".
		if (x1 == x2) return Double.POSITIVE_INFINITY;
		return ((double) (y2 - y1)) / (x2 - x1);
	}

	public boolean checkStraightLine(int[][] coordinates) {
		// calculate gradient of the first two points
		double gradient = get_gradient(coordinates[0][0], coordinates[0][1], coordinates[1][0], coordinates[1][1]);
		// for every point from the third point onwards, check if the gradient formed with the previous point
		// equals the gradient of the first two points
		for (int i = 2; i < coordinates.length; ++i) {
			if (get_gradient(coordinates[i - 1][0], coordinates[i - 1][1], coordinates[i][0], coordinates[i][1])
			        != gradient) return false;
		}

		return true;
	}


	public static void main(String[] args) {

		int[][] mat = {{0, 0}, {0, 1}, {0, -1}}; //{{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
		boolean result = new _1232_Check_If_It_Is_a_Straight_Line().checkStraightLine(mat);
		System.out.println(result);
	}
}