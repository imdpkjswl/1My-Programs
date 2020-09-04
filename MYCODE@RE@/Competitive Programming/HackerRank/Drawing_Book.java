import java.util.*;

public class Drawing_Book {

	// Real solution

	/**
	  * Brie wants to turn a minimum number of pages to get to page number
		from either page number  or page number . The number of pages she
		must turn from page number  is always , but there is a twist when
		she's turning backward from page number :

		* If 'n' is odd, then she turns (n-p) pages.
		* If 'n' is even, then she turns (n-p+1)/2 pages.
	*/
	public static int solve(int n, int p) {
		int front = p >> 1;
		int back =  ((n & 1) == 1)
		            ? (n - p) >> 1 // odd number of pages
		            : (n - p + 1) >> 1; // even number of pages

		return Math.min(front, back);
	}


	public static int solve2(int n, int p) {
		return Math.min(p / 2 , n / 2 - p / 2); // do not use this (n-p)/2, ith shows 1/27 test failed.
	}




	//My solution got 10/27 test cases failed :(
	static int pageCount(int n, int p) {
		if (n < p || p == 1 || n == p)
			return 0;

		if (n % 2 != 0 && p == n - 1)
			return 0;

		int start = 1, count = 0;

		if ((p - 1) < (n - p)) { // move forward
			for (int i = start; i < p; i += 2) {
				count++;
			}

		} else { // move backward
			if (n % 2 == 0) { // for even
				n = n + 1;
			} else { // for odd
				n = n;
			}

			for (int i = n; i >= p; i -= 2) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		int n = 5;
		int p = 4;

		int result = pageCount(n, p);

		System.out.println(result);

		// Real solution1
		System.out.println(solve(n, p));

		// Real solution2
		System.out.println(solve2(n, p));
	}

}