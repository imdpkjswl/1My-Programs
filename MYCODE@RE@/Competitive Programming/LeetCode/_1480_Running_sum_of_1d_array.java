class _1480_Running_sum_of_1d_array {
	public static int[] runningSum(int[] nums) {
		int[] ans = new int[nums.length];

		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			ans[i] = sum;
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] nums = new int[] {1, 2, 3, 4, 5};
		int[] ans = runningSum(nums);
		for (int i : ans)
			System.out.print(i + "  ");

	}
}