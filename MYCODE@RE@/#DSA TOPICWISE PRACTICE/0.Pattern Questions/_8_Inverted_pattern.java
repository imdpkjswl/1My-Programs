import java.util.*;

class _8_Inverted_pattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for(int i=1;i<=n;i++){
			for(int j=1;j<=n+1-i;j++){
				System.out.print(j);   // j=i --> j-i+1
			}
			System.out.println();
		}

	}
}