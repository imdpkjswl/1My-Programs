import java.util.Map;
import java.util.HashMap;

class Counting_frequencies_of_array_elements {

	static void countFreq(int arr[], int n) {
		Map<Integer, Integer> mp = new HashMap<>(); // Map as Key-Value Pairs

		// Traverse through array elements and count frequencies
		for (int i = 0; i < n; i++) {
			if (mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i]) + 1);
			} else {
				mp.put(arr[i], 1);
			}
		}

		// Traverse through map and print frequencies
		for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		/**------------------------------------------------------------------------------*
		*Print elements in same order as they appear in input?
			To print elements according to first occurrence, traverse array one more time
		    print frequencies of elements and mark frequencies as -1 so that same element
		    is not printed multiple times. */
		System.out.println("Output as Input Occurred:");
		for (int i = 0; i < n; i++) {
			if (mp.get(arr[i]) != -1) {
				System.out.println(arr[i] + " " + mp.get(arr[i]));
				mp.put(arr[i], -1);
			}
		}

	}


	public static void main(String args[]) {
		int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
		int n = arr.length;

		countFreq(arr, n);
	}
}