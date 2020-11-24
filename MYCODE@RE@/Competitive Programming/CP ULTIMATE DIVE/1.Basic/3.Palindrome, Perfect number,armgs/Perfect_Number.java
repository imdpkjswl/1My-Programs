/*
A number is a perfect number if is equal to sum of its proper divisors, that is, sum
of its positive divisors excluding the number itself.
*/

class Perfect_Number {

	// Returns true if n is perfect: TIME COMPLEXITY: O(sqrt(N))
	static boolean isPerfect(long n) {
		// To store sum of divisors
		long sum = 1;

		// Find all divisors and add them
		for (long i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				if (i * i != n)
					sum = sum + i + n / i;
				else
					sum = sum + i;
			}
		}
		// If sum of divisors is equal to
		// n, then n is a perfect number
		if (sum == n && n != 1)
			return true;

		return false;
	}


	public static void main (String[] args) {
		System.out.println("Below are all perfect numbers till 10000:");
		for (long n = 2; n < 10000; n++)
			if (isPerfect(n))
				System.out.println( n + "  is a perfect number");
	}
}
