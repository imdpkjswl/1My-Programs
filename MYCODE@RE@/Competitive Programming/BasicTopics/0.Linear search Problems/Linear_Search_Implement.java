
class Normal_Linear_Search {
	public static int search(int[] arr, int target) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == target)
				return i; // position
		}
		return -1;
	}


	public static void main(String args[]) {
		int arr[] = { 2, 3, 4, 10, 40, 22, 15 };
		int x = 10;

		int result = search(arr, x);
		if (result == -1)
			System.out.print("Element is not present in array");
		else
			System.out.print("Element is present at index " + result);
	}
}

/*
The time complexity of the above algorithm is O(n).

Improve Linear Search Worst-Case Complexity are:
--> if element Found at last  O(n) to O(1)
--> if element Not found O(n) to O(n/2)
*/

class Linear_Search_Implement {

	public static void search(int arr[], int search_Element) {
		int left;
		int right = arr.length - 1;
		int position = -1;

		// run loop from 0 to right
		for (left = 0; left <= right;) {

			// if search_element is found with left varaible
			if (arr[left] == search_Element) {
				position = left;
				System.out.println("Element found at " + (position + 1) +
				                   " Position with " + (left + 1) + " Attempt");
				break;
			}

			// if search_element is found with right varaible
			if (arr[right] == search_Element) {
				position = right;
				System.out.println("Element found at " + (position + 1) +
				                   " Position with " + (arr.length - right) + " Attempt");
				break;
			}

			left++; // moving to right
			right--; // moving to left
		}

		// if element not found
		if (position == -1)
			System.out.println("Not found in Array with " + left + " Attempt");
	}



	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 45, 10, 40, 22, 15 };
		int search_element = 10;

		search(arr, search_element);
	}
}