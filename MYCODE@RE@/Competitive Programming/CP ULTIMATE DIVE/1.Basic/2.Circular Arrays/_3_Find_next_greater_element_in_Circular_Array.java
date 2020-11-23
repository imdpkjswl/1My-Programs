class _3_Find_next_greater_element_in_Circular_Array {
	/**
		Time Complexity: O(n2)
		Auxiliary Space: O(1)
		* Function to find the NGE without Circular Array
	*/
	private static void printNGE(int []arr, int n) {

		for (int i = 0; i < n; i++) {
			int next = -1;
			for (int j = i + 1; j < n; j++) {

				// Checking for next greater element
				if (arr[i] < arr[j]) {
					next = arr[j];
					break;
				}
			}

			// Print the updated NGE
			System.out.print(next + ", ");
		}
	}


	/**
		Time Complexity: O(n2)
		Auxiliary Space: O(1)
		* Function to find the NGE with Circular Array
	*/
	static void printNGE(int []A) {
		int n = A.length;
		System.out.println("\n");


		for (int i = 0; i < n; i++) {

			// Initialise k as -1 which is printed when no NGE found
			int k = -1;
			for (int j = i + 1; j < n + i; j++) {
				if (A[i] < A[j % n]) {
					System.out.print(A[j % n] + " ");
					k = 1;
					break;
				}
			}

			// Gets executed when no NGE found
			if (k == -1)
				System.out.print("-1 ");
		}
	}


	public static void main(String args[]) {

		// Given array arr[]
		int []arr = {4, -2, 5, 8};

		int N = arr.length;

		// Function call
		printNGE(arr, N);

		// Circular array method
		printNGE(arr);
	}
}