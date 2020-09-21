import java.util.*;

/*
This problem can be solved using the next greedy approach:
let's iterate over all i from 1 to n. If s[i]=t[i], go further.
Otherwise let's find any position j>i such that s[j]=t[i] and
move the character from the position j to the position i. If
there is no such position in s, the answer is "-1".

Upper bound on time complexity (and the size of the answer) of this solution is O(n2).
*/

public class B_Obtaining_the_String {

	private static void swap(char[] s, int i, int j) {
		char temp;
		temp = s[i];
		s[i] = s[i + 1];
		s[i + 1] = temp;
	}

	private static void swappedPosition(char[] s, char[] t) {
		int n = s.length;
		List<Integer> ans = new ArrayList<>();  // used to store swap positions
		for (int i = 0; i < n; ++i) {
			if (s[i] == t[i]) continue;

			int pos = -1;
			for (int j = i + 1; j < n; ++j) {
				if (s[j] == t[i]) {
					pos = j;
					break;
				}
			}

			if (pos == -1) {
				System.out.println("-1");
				return;
			}

			for (int j = pos - 1; j >= i; --j) {
				swap(s, j, j + 1);
				ans.add(j);
			}
		}

		System.out.println(ans.size());
		for (int itr : ans)
			System.out.print((itr + 1) + " ");

	}


	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		n = in.nextInt();

		String s = in.next();
		String t = in.next();

		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();

		swappedPosition(sChar, tChar);

	}
}