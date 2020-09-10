import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Equalize_the_Array {

	// Complete the equalizeArray function below.
	static int equalizeArray(int[] arr) {
		int[] table = new int[101];
		Arrays.fill(table, 0);

		for (int i = 0; i < arr.length; i++) {
			table[arr[i]]++;
		}

		int max = 0;
		for (int i = 0; i < table.length; i++) {
			if (max < table[i]) {
				max = table[i];
			}
		}

		return (arr.length - max);

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int[] arr = new int[] {3, 3, 2, 1, 3};

		int result = equalizeArray(arr);
		System.out.println(result);
	}
}
