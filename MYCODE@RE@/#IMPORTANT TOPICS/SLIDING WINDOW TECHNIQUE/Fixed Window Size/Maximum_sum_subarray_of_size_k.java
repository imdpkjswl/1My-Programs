import java.util.*;


class Maximum_sum_subarray_of_size_k {
	private static int findMaxArray(int[] arr, int k) {
		int sum = 0;
		int max = 0;
		int i = 0;
		int j = 0;

		while (j < arr.length) {

			sum += arr[j];

			// First find k size window
			if (j - i + 1 < k) {
				j++;
			} else {
				max = (int)Math.max(max, sum);
				sum -= arr[i++]; // move left side by one by excluding sum also
				j++; // including right side by one
			}

		}

		return max;
	}

	public static void main(String[] args) {
		int arr[] = new int[] {2, 5, 1, 8, 2, 9, 1};
		int k = 3;

		int max = findMaxArray(arr, k);
		System.out.println(max);

	}
}
