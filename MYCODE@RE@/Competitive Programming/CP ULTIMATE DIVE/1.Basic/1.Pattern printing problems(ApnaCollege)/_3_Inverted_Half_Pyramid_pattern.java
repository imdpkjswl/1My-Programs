import java.util.*;

class _3_Inverted_Half_Pyramid_pattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int rows, cols;
		rows = cols = in.nextInt();

		for(int i=1;i<=rows;i++){
			for(int j=1;j<=cols;j++){
				System.out.print("*");
			}
			cols--;
			System.out.println();
		}

	}
}