class _4_Maximum_circular_subarray_sum_of_size_K {
	static void maxCircularSum(int[] arr, int n, int k) {
		// k must be greater
		if (n < k) {System.out.println("Invalid"); return;}

		int sum = 0, start = 0, end = k - 1;

		// calculate the sum of first k elements.
		for (int i = 0; i < k; i++)
			sum += arr[i];

		int ans = sum;

		for (int i = k; i < n + k; i++) {

			// add current element to sum
			// and subtract the first element
			// of the previous window.
			sum += arr[i % n] - arr[(i - k) % n];

			if (sum > ans) {
				ans = sum;
				start = (i - k + 1) % n;
				end = i % n;
			}
		}

		System.out.println("max circular sum = " + ans);
		System.out.println("start index = " + start + "\nend index = " + end);
	}

	public static void main(String[] args) {
		int[] arr = { 18, 4, 3, 4, 5, 6, 7, 8, 2, 10 };
		int n = arr.length;
		int k = 3;

		maxCircularSum(arr, n, k);
	}
}