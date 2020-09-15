import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


/** Given a sequence of integers , a triplet (a[i],a[j],a[k]) is beautiful if:
* i < j < k
* a[j] - a[i] = a[k] - a[j] = d
*/


public class Beautiful_Triplets {

	// Complete the beautifulTriplets function below.
	static int beautifulTriplets(int d, int[] arr) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] - arr[i] != d) { // Due to this line, i abled to pass all cases under given time limits.
					continue;
				}
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[j] - arr[i] == d && arr[k] - arr[j] == d) {
						count++;
					}
				}
			}
		}

		return count;
	}


	public static void main(String[] args) throws IOException {

		int n = 7; // length of given array
		int d = 3; // beautiful difference
		int[] arr = new int[] {1, 2, 4, 5, 7, 8, 10};

		int result = beautifulTriplets(d, arr);
		System.out.println(result);

	}
}
