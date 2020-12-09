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


	// Solution is Correct But threw TLE Error - Got 10 Points
	private static void solution1(int N, int K) {
		int count = 0; // count positive numbers
		int[] ans = new int[N];
		boolean flag = false;
		if ((N & 1) == 0)
			flag = true; // even

		// when N = even: make odd pos negative and even pos positive
		// when N = odd: make odd pos positive and even pos negative
		for (int i = 1; i <= N; i++) {
			if (!flag) {
				if (i % 2 != 0) {
					ans[i - 1] = i;
					count++;
				} else
					ans[i - 1] = -i;
			} else {
				if (i % 2 != 0)
					ans[i - 1] = -i;
				else {
					ans[i - 1] = i;
					count++;
				}
			}
		}

		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += ans[i];
			if (sum > 0) {
				if (count < K) {
					int diff = K - count;
					for (int j = N - 1; j >= 0; j--) {
						int val = ans[j];
						if (val < 0) {
							ans[j] = -val;
							count++;
						}
						if (count == K) {
							break;
						}
					}
				} else if (count > K) {
					int diff = count - K;
					for (int j = N - 1; j >= 0; j--) {
						int val = ans[j];
						if (val > 0) {
							ans[j] = -val;
							count--;
						}
						if (count == K) {
							break;
						}
					}
				}
			}
		}


		for (int val : ans) {
			System.out.print(val + " ");
		}
		System.out.println();

	}

	public static void main (String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int T = 0; if (in.hasNextInt()) { T = in.nextInt(); }

		for (int t = 1; t <= T; t++) {
			int N = 0; if (in.hasNextInt()) { N = in.nextInt(); }
			int K = 0; if (in.hasNextInt()) { K = in.nextInt(); }

			//bruteForce(N, K);
			solution1(N, K);
		}

	}

}
