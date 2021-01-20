import java.util.*;
/**
 An Efficient Solution is to use count array to check for anagrams, we can
 construct current count window from previous window in O(1) time using
 sliding window concept.
 */
public class Count_Occurrences_of_Anagrams {
	final static int MAX_CHAR = 256;

	// Function to find if two strings are equal
	static boolean isCountZero(int[] count) {
		for (int i = 0; i < MAX_CHAR; i++)
			if (count[i] != 0)
				return false;
		return true;
	}

	static int countAnagrams(String text, String ptr) {
		int N = text.length();
		int n = ptr.length();

		// Check for first window. The idea is to
		// use single count array to match counts
		int[] count = new int[MAX_CHAR];
		for (int i = 0; i < n; i++)
			count[ptr.charAt(i)]++;
		for (int i = 0; i < n; i++)
			count[text.charAt(i)]--;

		// If first window itself is anagram
		int res = 0;
		if (isCountZero(count))
			res++;

		for (int i = n; i < N; i++) {

			// Add last character of current window
			count[text.charAt(i)]--;

			// Remove first character of previous window.
			count[text.charAt(i - n)]++;

			// If count array is 0, we found an anagram.
			if (isCountZero(count))
				res++;
		}
		return res;
	}

	// Driver code
	public static void main(String args[]) {
		String text = "aabaabaa";
		String word = "aaba";
		System.out.print(countAnagrams(text, word));
	}
}











/**
A simple approach is to traverse from start of the string considering
substrings of length equal to the length  of the given word and  then
check if this substring has all the characters of word.
 */
class NaiveApproach {
	// Function to find if two strings are equal
	static boolean araAnagram(String ptr, String s) {
		// converting strings to char arrays
		char[] ch1 = ptr.toCharArray();
		char[] ch2 = s.toCharArray();

		// sorting both char arrays
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		// Check for equality of strings
		if (Arrays.equals(ch1, ch2))
			return true;
		else
			return false;
	}

	static int countAnagrams(String text, String ptr) {
		int N = text.length();
		int n = ptr.length();

		// Initialize result
		int res = 0;

		for (int i = 0; i <= N - n; i++) {

			String s = text.substring(i, i + n);  // splitting main string

			// Check if the ptr and substring are anagram of each other.
			if (araAnagram(ptr, s))
				res++;
		}

		return res;
	}

	public static void main(String[] args) {
		String str = "aabaabaa";
		String ptr = "aaba";

		int result = countAnagrams(str, ptr);
		System.out.println(result);
	}
}
