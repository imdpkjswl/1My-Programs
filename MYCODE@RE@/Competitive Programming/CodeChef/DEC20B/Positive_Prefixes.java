import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Positive_Prefixes {

	// THIS SOLUTION IS NOT WORKING IN SOME OF THE TEST CASES
	private static void bruteForce(int N, int K) {
		int sum = 0;
		int count = 0; // count for k positive prefixes
		int neg = 0;
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			if (count <= K) {
				if (i - sum <= 0) {
					if (neg >= N - K) {
						ans.add(i);
						count++;
						continue;
					}
					ans.add(-i);
					++neg;
				} else {
					ans.add(i);
					sum += i;
					++count;
				}
			} else {
				ans.add(-i);
			}
		}

		for (int val : ans)
			System.out.print(val + " ");
		System.out.println();

	}



	public static void main (String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int T = 0; if (in.hasNextInt()) { T = in.nextInt(); }

		for (int t = 1; t <= T; t++) {
			int N = 0; if (in.hasNextInt()) { N = in.nextInt(); }
			int K = 0; if (in.hasNextInt()) { K = in.nextInt(); }

			bruteForce(N, K);
		}

	}

}
