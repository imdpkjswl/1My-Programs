import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/* MY SOLUTION
// 6/21 Test cases failed: Terminated due to timeout :( --> Your code did not execute within the time limits
public class Flatland_Space_Stations {

	private static int getNearestStationIndex(int[] temp, int i) {
		int index = -1;
		int t = 0;
		int distance = Integer.MAX_VALUE;

		for (int j = 0; j < temp.length; j++) {
			if (temp[j] == -2) {
				t = (int)Math.abs(j - i);
				if (t <= distance) {
					distance = t;
					index = j;
				}
			}
		}

		return index;
	}

	// Complete the flatlandSpaceStations function below.
	static int flatlandSpaceStations(int n, int[] c) {
		if (n == c.length)
			return 0;

		int[] temp = new int[n]; // ctreate n cities
		Arrays.fill(temp, -1); // fill all cities with no station

		for (int i = 0; i < c.length; i++) {
			temp[c[i]] = -2;  // fill station
		}

		int maxDistance = Integer.MIN_VALUE;
		for (int i = 0; i < temp.length; i++) {
			int nearestStationIndex =  getNearestStationIndex(temp, i);
			int distance = (int)Math.abs(nearestStationIndex - i);

			maxDistance = Math.max(distance, maxDistance);
		}

		return maxDistance;
	}


	public static void main(String[] args) throws IOException {

		int n = 20; //5;
		int m = 5; //2;

		int[] c = new int[] {13, 1, 11, 10, 6}; // {0, 4};

		int result = flatlandSpaceStations(n, c);
		System.out.println(result);
	}
}
*/

// REAL SOLUTION: LEADERBOARD
public class Flatland_Space_Stations {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 20;
		int m = 5;
		int[] c = new int[] {13, 1, 11, 10, 6}; // m -stations

		Arrays.sort(c);
		int mdx = Math.max(c[0], n - c[c.length - 1] - 1);
		for (int i = 0; i < m - 1; i++) {
			mdx = Math.max((c[i + 1] - c[i]) / 2, mdx);
		}
		System.out.println(mdx);
	}
}