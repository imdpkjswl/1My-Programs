import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Modified_Kaprekar_Numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int p = scan.nextInt(); // begin
		int q = scan.nextInt(); // end
		String prefix = "";
		for (int k = p; k <= q; k++) {
			if (isKaprekar(k)) {
				System.out.print(prefix + k);
				prefix = " ";
			}
		}
		if (prefix.equals(""))
			System.out.println("INVALID RANGE");
	}

	public static boolean isKaprekar(long k) {
		if (k < 10)
			return (k == 1 || k == 9);
		long square = k * k;
		String str = String.valueOf(square);
		int d = String.valueOf(k).length();
		int first, second;
		try {
			first = Integer.parseInt(str.substring(0, str.length() - d));
			second = Integer.parseInt(str.substring(str.length() - d));
		} catch (Exception e) {
			System.out.println("\n" + k + ", " + square + ", " + str.length() + ", " + d);
			throw e;
		}
		if (first + second == k) {
			return true;
		}
		return false;
	}
}