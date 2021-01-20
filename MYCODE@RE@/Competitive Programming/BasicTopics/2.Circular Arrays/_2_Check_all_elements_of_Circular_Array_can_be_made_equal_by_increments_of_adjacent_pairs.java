class _2_Check_all_elements_of_Circular_Array_can_be_made_equal_by_increments_of_adjacent_pairs {

	private static boolean checkEqual(int arr[], int N) {
		// Stores the sum of even and odd array elements
		int sumEven = 0, sumOdd = 0;

		for (int i = 0; i < N; i++) {
			// If index is odd
			if (i % 2 == 1)
				sumOdd += arr[i];
			else
				sumEven += arr[i];
		}

		if (sumEven == sumOdd)
			return true;
		else
			return false;
	}


	public static void main(String[] args) {
		int arr[] = { 2, 7, 3, 5, 7 };
		int N = arr.length;

		if (checkEqual(arr, N))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
