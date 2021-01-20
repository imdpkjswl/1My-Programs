class Check_if_a_Given_String_is_Palindrome {
	private static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;

		while (i < j) {
			// Compare first and last characters in string
			if (s.charAt(i++) != s.charAt(j--)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String str = "ABCBA";

		boolean res = isPalindrome(str);
		System.out.println(res);
	}
}