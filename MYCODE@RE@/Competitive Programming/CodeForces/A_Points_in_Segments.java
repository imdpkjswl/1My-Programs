import java.util.*;

public class A_Points_in_Segments {

	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {

		int n;
		int m;
		n = in.nextInt();
		m = in.nextInt();
		boolean[] rs = new boolean[m + 1];
		Arrays.fill(rs, false);

		int first, last;
		for (int i = 0; i < n; ++i) {
			first =	in.nextInt();
			last  = in.nextInt();
			for (int j = first; j <= last; ++j) {
				rs[j] = true;
			}
		}

		int count = 0;
		String result = "";
		for (int i = 1; i < m + 1; ++i) {
			if (!rs[i]) {
				count++;
				result += "" + i + " ";
			}
		}

		System.out.println(count);
		System.out.println(result);



	}
}

/*
Input:
3 5 // n and m(1 to M)
2 2
1 2
5 5

Output:
2
3 4
*/