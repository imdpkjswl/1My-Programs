/**
 * Here the idea is to count the no. of at risk person and no.of not at risk person,
 * then For counting minimum days to vaccinate the peoples.
 * We use formula is:
 * days = Ceil(at_risk/D people per day) + Ceil(not_risk/D people per day)
 */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Vaccine_Distribution {

	private static int vaccination(int[] arr, int d) {
		double at_risk = 0;
		double not_risk = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 9 || arr[i] >= 80) {
				at_risk++;
			} else
				not_risk++;
		}

		int ans = (int)(Math.ceil(at_risk / d) + Math.ceil(not_risk / d));
//        System.out.println(ans);
		return ans;

	}

	public static void main (String[] args) throws Exception {
		Scanner in = new Scanner(System.in);

		int T = 0;
		int N = 0, D = 0;
		if (in.hasNextInt()) {
			T = in.nextInt();
		}

		for (int t = 1; t <= T; t++) {
			if (in.hasNextInt()) {
				N = in.nextInt();
			}
			int n = N;
			int[] age = new int[n];//{10, 20, 30, 40, 50, 60, 90, 80, 100, 1}; //{9, 80, 27, 72, 79};
			if (in.hasNextInt()) {
				D = in.nextInt();
			}
			for (int i = 0; i < N; i++) {
				age[i] = in.nextInt();
			}

			int ans = vaccination(age, D);
			System.out.println(ans);
		}


	}

}
