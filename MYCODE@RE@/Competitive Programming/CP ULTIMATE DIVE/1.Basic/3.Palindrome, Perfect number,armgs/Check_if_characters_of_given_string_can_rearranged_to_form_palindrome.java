import java.util.*;

class Check_if_characters_of_given_string_can_rearranged_to_form_palindrome {
	private static boolean isPalindrome(String s) {
		int[] table = new int[256];
		Arrays.fill(table, 0);

		for (int i = 0; i < s.length(); i++) {
			table[(int)s.charAt(i)]++;
		}


		int oddSum = 0;

		for (int i = 0; i < table.length; i++) {
			if (table[i] % 2 != 0) {
				oddSum += table[i];
			}
		}
		// A string might be palindrome if odd no. of characters sum must be less than  or equal 1.
		if (oddSum > 1)
			return false;
		else
			return true;
	}

	public static void main(String[] args) {
		String str = "deepakodeepak"; //"deepakfordeepak";

		boolean res = isPalindrome(str);
		System.out.println(res);
	}
}