class Binary_Search_Implement {

	private static int Recursive(int[] arr, int low, int high, int key) {
		// Base condition
		if (low > high)
			return -1;

		//find mid in search space and compares it with target value

		int mid = (low + high) / 2;  // integer overflow can happen use: int mid = low + (high - low)/2;

		// Base condition (target value is found)
		if (key == arr[mid])
			return mid;

		// discard all elements in the right search space including the mid element
		else if (key < arr[mid])
			return Recursive(arr, low,  mid - 1, key);

		// discard all elements in the left search space including the mid element
		else
			return Recursive(arr, mid + 1,  high, key);

	}


	private static boolean nonRecursive(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2; // Integer overflow can happen
			// int mid = low + (high - low)/2;
			// int mid = high - (high - low)/2;

			if (key < arr[mid]) {
				high = mid - 1;
			} else if (key > arr[mid]) {
				low = mid + 1;
			} else if (key == arr[mid]) {
				return true;
			}
		}

		return false;
	}



	public static void main(String[] args) {
		int[] arr = new int[] {1, 13, 18, 23, 27, 31, 34, 45, 58, 65};
		int key = 13;


		boolean result = nonRecursive(arr, key);
		if (result)
			System.out.println("Key Found");
		else
			System.out.println("Key Not Found");

//---------------------------------------------------------------//
		int index = Recursive(arr, 0, arr.length - 1, key);
		if (index != -1)
			System.out.println("Key Found at " + index);
		else
			System.out.println("Key Not Found");
	}
}