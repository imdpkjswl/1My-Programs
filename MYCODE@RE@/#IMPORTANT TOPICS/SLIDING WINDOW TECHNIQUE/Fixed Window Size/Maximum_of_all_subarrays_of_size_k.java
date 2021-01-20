import java.util.*;

class Maximum_of_all_subarrays_of_size_k {

	private static List<Integer> slidingWindowApproach(int[] arr, int k) {
		int i = 0;
		int j = 0;
		List<Integer> ans = new Vector<>();
		Deque<Integer> list = new LinkedList<>();

		// Code with Generic
		while (j < arr.length) {
			// Calculation
			while (list.size() > 0 && list.getLast() < arr[j]) {
				list.pollLast();
			}
			list.add(arr[j]);


			if (j - i + 1 < k) {
				j++;
			} else {
				// ans  <-- Calculation
				ans.add(list.getFirst());
				// Slide the window
				if (list.getFirst() == arr[i]) {
					list.pollFirst();
				}
				i++;
				j++;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] arr = new int[] {1, 4, 2, 7, 3, 1, 4, 8}; // 4 7 7 7 4 8
		int k = 3;

		List<Integer> result = slidingWindowApproach(arr, k);
		for (Integer m : result)
			System.out.print(m + " ");
		System.out.println();

		List<Integer> res = BruteForce(arr, k);
		for (Integer m : res)
			System.out.print(m + " ");

	}



	private static List<Integer> BruteForce(int[] arr, int k) {
		List<Integer> res = new Vector<>();

		for (int i = 0; i < (arr.length - k) + 1; i++) { // no. of max = n-k+1
			int temp = arr[i];
			for (int j = i; j < i + k; j++) {
				if (temp < arr[j]) {
					temp = arr[j];
				}
			}
			res.add(temp);
		}
		return res;
	}

}
