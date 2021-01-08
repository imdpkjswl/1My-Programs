import java.util.Arrays;

class _1_twoSum {
	private static int[] twoSum(int[] arr, int target) {
		int tmp = 0;
		int[] ans = new int[2];
		out:
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				tmp = target - arr[i];
				//System.out.println(arr[i] + "   " + arr[j]);
				if (tmp == arr[j]) {
					ans[0] = i;
					ans[1] = j;
					break out;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int [] arr = new int[] {2, 3, 1, 7, 11, 15};
		int target = 9;

		System.out.println(Arrays.toString(twoSum(arr, target)));
	}
}