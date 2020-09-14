import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Modified_Kaprekar_Numbers {
//kaprekarNumbers is: square of num and sum of right half and sum of left half should be equal to given number.

	// Complete the kaprekarNumbers function below.
	static void kaprekarNumbers(int p, int q) {
		// 1/7 test cases got failed :)
		boolean flag = false;

		for (int i = p; i <= q; i++) {
			long  sum;
			long  a = 0;
			long  k = i;
			while (k > 0) {
				k /= 10 ;
				++a;
			}
			long  sq = i * i;
			long  g = (long)Math.pow(10, a);
			sum = sq % g + sq / g;
			if (sum == i) {
				System.out.print(sum + " ");
				flag = true;
			}
		}
		if (!flag)
			System.out.println("INVALID RANGE");
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int lower = 1;
		int upper = 100;
		kaprekarNumbers(lower, upper);

	}
}
