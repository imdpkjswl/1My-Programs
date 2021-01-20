// This approach takes O(n) time and O(1) extra space.
class _1_Implement_Circular_Array {
	private static void printCircularArray(int[] arr, int ind){
		int n = arr.length;

		for(int i=ind;i<n+ind;i++){
			System.out.print(arr[i%n]+"  ");
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5,6};
		int ind = 3; // start index

		printCircularArray(arr, ind-1);
	}
}