class _53_max_subarray {

	public static int maxSubArray(int[] nums) {
		int n = nums.length;
		int sum = 0;
		int max = Integer.MIN_VALUE;

		for (int j = 0; j < n; j++) {
			for (int k = j; k < n; k++) {
				sum = 0;
				for (int i = j; i <= k; i++) {
					sum += nums[i];
				}
				if (sum >= max) {
					max = sum;
				}
			}
		}
		return max;
	}


	public static void main(String[] args) {
		int[] nums = new int[] { -1, 0}; //{-2,-1}; //{-2,1,-3,4,-1,2,1,-5,4};
		int result = maxSubArray(nums);
		System.out.println(result);
	}
}