import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Halloween_Sale {

	// Complete the howManyGames function below.
	static int howManyGames(int p, int d, int m, int s) {
		// Return the number of games you can buy
		// My code got 1/51 test case failed :)
		int count = 0;
		int remaining = s; // amount in my wallet
		if (p <= s) {

			while (p >= m) {
				count++;
				remaining -= p;
				p = p - d;
			}

			while (m <= remaining) {
				count++;
				remaining -= m;
			}
		}
		return count;
	}


	public static void main(String[] args) throws IOException {

		int p = 100;//20;
		int d = 1;//3;
		int m = 1;//6;
		int s = 99;//80;

		int answer = howManyGames(p, d, m, s);
		System.out.println(answer);
	}
}
