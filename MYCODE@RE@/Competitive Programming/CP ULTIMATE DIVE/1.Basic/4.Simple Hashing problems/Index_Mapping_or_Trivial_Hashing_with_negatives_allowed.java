/*
Given a limited range array contains both positive and non-positive numbers, i.e.,
elements are in the range from -MAX to +MAX. Our task is to search if some number
is present in the array or not in O(1) time.

Since range is limited, we can use index mapping (or trivial hashing). We use values
as the index in a big array. Therefore we can search and insert elements in O(1) time.

How to handle negative numbers?
The idea is to use a 2D array of size hash[MAX+1][2]
*/

class Index_Mapping_or_Trivial_Hashing_with_negatives_allowed {
	final static int MAX = 1000;

	// Since array is global, it is initialized as 0.
	static boolean[][] hs = new boolean[MAX + 1][2];

	// searching if X is Present in the given array or not.
	static boolean search(int X) {
		if (X >= 0) {
			if (hs[X][0] == true) {
				return true;
			} else {
				return false;
			}
		}

		// if X is negative take the absolute value of X.
		X = Math.abs(X);
		if (hs[X][1] == true) {
			return true;
		}

		return false;
	}

	static void insert(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				hs[arr[i]][0] = true;
			} else {
				hs[Math.abs(arr[i])][1] = true;
			}
		}
	}


	public static void main(String args[]) {

		int arr[] = { -1, 9, -5, -8, -5, -2};

		insert(arr);  // We can insert in range [-1000, +1000]

		int Target = 8;
		if (search(Target) == true) {
			System.out.println("Present");
		} else {
			System.out.println("Not Present");
		}

	}
}