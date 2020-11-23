import java.util.*;

class _1_Rectangle_pattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int rows = in.nextInt();
		int cols = in.nextInt();

		for(int i=1;i<=rows;i++){
			for(int j=1;j<=cols;j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}
}