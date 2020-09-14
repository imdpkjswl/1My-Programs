import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Bigger_is_Greater {

	// My Solution got 3/5 test cases failed :(.

	/*	static String biggerIsGreater(String w) {
			int n = w.length();
			char[] chr = w.toCharArray();
			int t1 = -1, t2 = -1;

			for (int i = n - 1; i > 0; i--) {
				if (chr[i - 1] < chr[i]) {
					t1 = i - 1; // previous
					t2 = i; // next
					break;
				}
			}

			if (t1 == -1 && t2 == -1)
				return "no answer";


			// Find minimum lexographical character
			char min = chr[t2];
			int minIndex = t2;
			// System.out.println(t1);
			if (t1 != 0) {
				for (int i = t2; i < n; i++) {
					if (min > chr[i]) {
						min = chr[i];
						minIndex = i;
					}
				}
			} else {
				char[] immediateMax = new char[n - 1 - t1];
				int x = 0;
				for (int i = t1 + 1; i < n; i++) {
					immediateMax[x++] = chr[i];
				}
				Arrays.sort(immediateMax);

				min = chr[t1];
				char nextMin = 0;
				for (int i = 0; i < x; i++) {
					if (min < immediateMax[i]) {
						nextMin = immediateMax[i];
						break;
					}
				}

				for (int i = t1; i < n; i++) {
					if (nextMin == chr[i]) {
						min = chr[i];
						minIndex = i;
						break;
					}
				}
				// System.out.println(chr[minIndex]);
			}
			// Swap t1 with minIndex
			char temp = chr[t1];
			chr[t1] = chr[minIndex];
			chr[minIndex] = temp;

			// Copy the remain element to be sorted
			int k = 0;
			char[] remainSort = new char[n - 1 - t1];
			for (int i = t1 + 1; i < n; i++) {
				remainSort[k++] = chr[i];
			}
			Arrays.sort(remainSort);
			// Now, again place the element into original array
			k = 0;
			for (int i = t1 + 1; i < n; i++) {
				chr[i] = remainSort[k++];
			}
			// System.out.println(remainSort);
			// System.out.println(chr);

			return new String(chr);

		}
	*/






	// REAL SOLUTION: IDEA IS SAME BUT IMPLEMENTATION IS DIFF
	/**
	 * method to find the next lexicographical greater string
	 *
	 * @param w
	 * @return a new string
	 */
	static String biggerIsGreater(String w) {
		char charArray[] = w.toCharArray();
		int n = charArray.length;
		int endIndex = 0;

		// step-1) Start from the right most character and find the first character
		// that is smaller than previous character.
		for (endIndex = n - 1; endIndex > 0; endIndex--) {
			if (charArray[endIndex] > charArray[endIndex - 1]) {
				break;
			}
		}

		// If no such char found, then all characters are in descending order
		// means there cannot be a greater string with same set of characters
		if (endIndex == 0) {
			return "no answer";
		} else {
			int firstSmallChar = charArray[endIndex - 1], nextSmallChar = endIndex;

			// step-2) Find the smallest character on right side of (endIndex - 1)'th
			// character that is greater than charArray[endIndex - 1]
			for (int startIndex = endIndex + 1; startIndex < n; startIndex++) {
				if (charArray[startIndex] > firstSmallChar && charArray[startIndex] < charArray[nextSmallChar]) {
					nextSmallChar = startIndex;
				}
			}

			// step-3) Swap the above found next smallest character with charArray[endIndex - 1]
			swap(charArray, endIndex - 1, nextSmallChar);

			// step-4) Sort the charArray after (endIndex - 1)in ascending order
			Arrays.sort(charArray, endIndex , n);

		}
		return new String(charArray);
	}

	/**
	 * method to swap ith character with jth character inside charArray
	 *
	 * @param charArray
	 * @param i
	 * @param j
	 */
	static void swap(char charArray[], int i, int j) {
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
	}


	public static void main(String[] args) throws IOException {

		String w = "dkhc";

		String result = biggerIsGreater(w);
		System.out.println(result);

	}
}
