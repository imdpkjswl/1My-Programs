import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/** How i think:
* Let us see an example:
* n = 15, c = 3, m = 2
* As question said, at every m chocolate eaten by little bobby, an extra chocolate will be given to him.
  so, the sequence of total eaten chocolates are:
* 15 -->  12 -> 9 -> 9 -> 6 -> 6 -> 3 -> 3 -> 0 -> 0
* Here, from 12 to 0, total chocolate eaten by bobby is 9.
*/

public class Chocolate_Feast {

	// Complete the chocolateFeast function below.
	static int chocolateFeast(int n, int c, int m) {
		int count = 0;
		int curwrapper = 0;

		while (n >= 0) {
			if (curwrapper != m) {
				if (n == 0 || n < c)
					return count;
				n = n - c;
				curwrapper++;
			} else {
				curwrapper = 0;
				curwrapper++;

			}
			count++;
		}

		return count;

	}


	public static void main(String[] args) throws IOException {

		int n = 7;//10;//15;
		int c = 3;//2;//3;
		int m = 2;//5;//2;

		int result = chocolateFeast(n, c, m);
		System.out.println(result);
	}
}
