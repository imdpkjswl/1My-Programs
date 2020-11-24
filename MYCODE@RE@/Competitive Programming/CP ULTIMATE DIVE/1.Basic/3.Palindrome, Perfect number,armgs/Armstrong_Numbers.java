class Armstrong_Numbers {
	// TIME COMPLEXITY: O(N*M)
	static boolean isArgs(int n) {
		int temp = n;
		int sum = 0;

		while (n > 0) {
			int d = n % 10;
			n /= 10;
			sum = sum + (int)Math.pow(d, 3);
		}
		if (temp == sum)
			return true;
		else
			return false;
	}

	// TIME COMPLEXITY: O(N)
	static void isArmgs(int n) {
		int sum = 0;
		int temp = n;
		while (temp != 0) {
			int rem = temp % 10;
			sum += rem * rem * rem;
			temp /= 10;
		}
		if (sum == n)
			System.out.printf("%d is Armstrong number \n", n);
		else
			System.out.printf("%d is Not an Armstrong number \n", n);
	}

	public static void main(String[] args) {
		int num = 153;
		if (isArgs(num))
			System.out.println("Armstrong Numbers");
		else
			System.out.println("Not A Armstrong Numbers");


		isArmgs(num);

	}
}