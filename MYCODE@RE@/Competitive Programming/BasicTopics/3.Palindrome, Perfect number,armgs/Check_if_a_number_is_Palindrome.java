class Check_if_a_number_is_Palindrome {

	private static boolean isPalindrome(int n) {
		int temp, digit, rev = 0;
		temp = n;

		while (n > 0) {
			digit = n % 10;
			rev = rev * 10 + digit;
			n /= 10;
		}

		if (temp == rev)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int num = 123421;

		boolean res = isPalindrome(num);
		System.out.println(res);
	}
}