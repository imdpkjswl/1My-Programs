import java.util.*;

class _6_Floyds_Triangle_pattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int rows = in.nextInt();

		int count = 1;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print((count++)+" ");
			}
			System.out.println();
		}

	}
}