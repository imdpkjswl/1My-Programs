import java.util.*;

class A_chessboard {
	private static void solve(int x1, int y1, int x2, int y2) {
		if (((x2 - x1) == 0) && ((y2 - y1) == 0)) { // coordinates of the second king are exactly equal
			System.out.println("SECOND"); // to the first, then the second king wins.
		} else if ((Math.abs((x1 - x2)) <= 1) && (Math.abs((y1 - y2)) <= 1)) { // In one move, first king able to kill
			System.out.println("FIRST");							// 	second king, hence first will win.
		} else {
			System.out.println("DRAW"); // both play optimally
		}
	}

	public static void main(String args[] ) throws Exception {
		//Scanner
		Scanner s = new Scanner(System.in);

		// Write your code here
		int t;
		t = s.nextInt();

		for (int i = 1; i <= t; i++) {
			int x1 = s.nextInt();
			int y1 = s.nextInt();
			int x2 = s.nextInt();
			int y2 = s.nextInt();

			solve(x1, y1, x2, y2);
		}

	}
}
