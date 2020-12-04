import java.util.*;

class Largest_subarray_of_sum_k {

	private static int largestSubarray(int[] arr, int k) {
		int i = 0;
		int j = 0;
		long sum = 0;
		int max = Integer.MIN_VALUE;

		while (j < arr.length) {
			sum = sum + arr[j];
			if (sum < k) {
				j++;
			} else if (sum == k) {
				if (j - i + 1 > max) {
					max = j - i + 1;
				}
				j++; // increase window size
			} else if (sum > k) {
				while (sum > k) {
					sum = sum - arr[i];
					i++;
				}
				j++; // increase window size after decreasing sum
			}
		}

		return max;
	}

	public static void main(String[] args) {
		int[] arr = new int[] {4, 1, 1, 1, 2, 3, 5};
		int k = 5; // given sum of subarray

		int result = largestSubarray(arr, k);
		System.out.println(result);

	}

}