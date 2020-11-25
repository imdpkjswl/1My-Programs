import java.util.*;

class Check_if_subarray_with_0_sum_is_exists_or_not {
	public static Boolean zeroSumSubarray(int[] A) {
		// create an empty set to store sum of elements of each
		// sub-array A[0..i] where 0 <= i < arr.length
		Set<Integer> set = new HashSet<>();

		// insert 0 into set to handle the case when sub-array with
		// 0 sum starts from index 0
		set.add(0);

		int sum = 0;

		// traverse the given array
		for (int val : A) {
			// sum of elements so far
			sum += val;

			// if sum is seen before, we have found a sub-array with 0 sum
			if (set.contains(sum)) {
				return true;
			}

			// insert sum so far into set
			set.add(sum);
		}

		// we reach here when no sub-array with 0 sum exists
		return false;
	}

	public static void main (String[] args) {
		int[] A = { 4, -6, 3, -1, 4, 2, 7 };

		if (zeroSumSubarray(A)) {
			System.out.println("Subarray exists");
		} else {
			System.out.println("Subarray do not exist");
		}
	}
}

