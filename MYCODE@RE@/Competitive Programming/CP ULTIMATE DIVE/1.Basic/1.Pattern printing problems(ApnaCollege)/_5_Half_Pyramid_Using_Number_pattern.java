import java.util.*;

class _5_Half_Pyramid_Using_Number_pattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int rows = in.nextInt();

		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i);
			}
			System.out.println();
		}

	}
}