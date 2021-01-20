import java.util.*;

class First_negative_number_in_every_window_of_size_k {
	private static List<Integer> firstNegative(int[] arr, int k) {
		int i = 0;
		int j = 0;

		LinkedList<Integer> list = new LinkedList<>();
		List<Integer> v = new Vector<>();

		while (j < arr.length) {
			// store all negative numbers into list
			if (arr[j] < 0)
				list.add(arr[j]);

			// First find k size window
			if (j - i + 1 < k) {
				j++;
			} else {
				//base condtion
				if (list.size() == 0) {
					v.add(0); // insert 0 when no negative number found in window of k
				} else {
					v.add(list.getFirst());
					if (arr[i] == list.getFirst()) {
						list.pollFirst(); // remove front element
					}
				}
				i++;
				j++;
			}
		}

		return v;

	}

	public static void main(String[] args) {
		int arr[] = new int[] {12, -1, -7, 8, -15, 30, 16, 28};
		int k = 3;

		List<Integer> result = firstNegative(arr, k);
		for (Integer i : result) {
			System.out.println(i);
		}
	}
}

