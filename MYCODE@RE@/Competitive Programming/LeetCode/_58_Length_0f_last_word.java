class _58_Length_0f_last_word {
	public static int lengthOfLastWord(String s) {
		int count = 0;
		int cur = s.length();

		// Removing spaces from end of string
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				cur = i; // stored index of last occurred space
			} else {
				break;
			}
		}

		// Count length of word and stop when space occurred
		for (int i = cur - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				count++;
			} else {
				break;
			}
			//System.out.println(s.charAt(i));
		}
		return count;

	}


	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("  Hello World  "));
	}
}