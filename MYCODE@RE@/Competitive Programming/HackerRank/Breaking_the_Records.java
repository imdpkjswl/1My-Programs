import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Breaking_the_Records {

	// Complete the breakingRecords function below.
	static int[] breakingRecords(int[] scores) {
		int curMax, curMin;
		curMax = curMin = scores[0];
		int maxCount = 0, minCount = 0;

		for (int i = 1; i < scores.length; i++) {
			if (scores[i] > curMax) {
				maxCount++;
				curMax = scores[i];
			} else if (scores[i] < curMin) {
				minCount++;
				curMin = scores[i];
			}
		}

		int[] res = new int[2];
		res[0] = maxCount;
		res[1] = minCount;

		return res;
	}



	public static void main(String[] args) {

		int n = 9;
		int[] arr = new int[] {10, 5, 20, 20, 4, 5, 2, 25, 1};

		int[] res  = breakingRecords(arr);

		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}

	}
}
