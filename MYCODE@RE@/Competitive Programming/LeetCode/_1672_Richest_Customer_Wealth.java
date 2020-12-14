class _1672_Richest_Customer_Wealth {
	public int maximumWealth(int[][] accounts) {
		int ans = 0, sum = 0;
		// where i --> customer & j --> bank accounts
		for (int i = 0; i < accounts.length; i++) {
			for (int j = 0; j < accounts[i].length; j++) {
				sum += accounts[i][j];
			}
			ans = Math.max(sum, ans);
			sum = 0;
		}

		return ans;
	}

	public static void main(String[] args) {
		int[][] bank = { {1, 2, 3, 6},
			{5, 8, 1, 8},
			{2, 6, 2, 9}
		};

		int result = new _1672_Richest_Customer_Wealth().maximumWealth(bank);
		System.out.println(result);
	}
}