import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


// Terminated due to timeout :(
// 4/9 test cases failed due time limit execeded. Very inefficient program.
public class Climbing_the_Leaderboard {

	// Complete the climbingLeaderboard function below.
	static int climbingLeaderboard(int[] scores, int alice) {
		HashSet<Integer> hash = new HashSet<>();
		ArrayList<Integer> rankList = new ArrayList<>();

		int result = -1;
		int r = 0;

		hash.add(alice);
		for (int i : scores) {
			hash.add(i);
		}

		Iterator<Integer> itr = hash.iterator();
		while (itr.hasNext()) {
			rankList.add(itr.next());
		}

		/* Sorting in decreasing order*/
		Collections.sort(rankList, Collections.reverseOrder());

		//System.out.println(rankList.toString());


		for (int i = 0; i < rankList.size(); i++) {
			if (alice == rankList.get(i)) {
				result = i + 1;
				break;
			}
		}

		return result;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int scoresCount = 7;
		int[] scores = new int[] {100, 100, 50, 40, 40, 20, 10};

		int aliceCount = 4;
		int[] alice = new int[] {5, 25, 50, 120};

		for (int i = 0; i < alice.length; i++) {
			int result = climbingLeaderboard(scores, alice[i]);
			System.out.println(result);
		}
		scanner.close();
	}
}

