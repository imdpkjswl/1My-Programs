import java.util.*;

class The_GCD_function {


	private static long gcd(long x, long y) {
		if (y == 0)
			return x;
		return gcd(y, x % y);
	}

	/* This solution Partially accepted
	private static void solve1(int n) {
	    if(n == 1){
	        System.out.println("1 1");
	    }
	    int x = n*(n-1); // found series pattern BUT not worked

	    int max = 0;
	    for(int i=1;i<=n;i++){
	        max += gcd(x,i);
	    }
	    System.out.println(max +" "+x);
	}
	*/

	public static void main(String args[] ) {
		//Scanner
		Scanner s = new Scanner(System.in);

		long t = s.nextInt();

		for (long i = 1; i <= t; i++) {
			long N = s.nextInt();
			solve2(N);
		}

	}

	private static void solve2(long n) {
		long lcm = 1;

		for (long i = 1; i <= n; i++) {
			lcm = findLcm(lcm, i);
		}
		System.out.println(((n * (n + 1)) / 2) + " " + lcm);
	}

	private static long findLcm(long a, long b) {
		long lcm = (a * b) / gcd(a, b);
		return lcm;
	}
}
