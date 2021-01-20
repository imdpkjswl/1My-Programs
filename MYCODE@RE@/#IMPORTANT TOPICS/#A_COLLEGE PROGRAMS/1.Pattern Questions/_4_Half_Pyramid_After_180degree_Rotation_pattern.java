import java.util.*;

class _4_Half_Pyramid_After_180degree_Rotation_pattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int rows, cols;
		rows = cols = in.nextInt();

		for(int i=1;i<=rows;i++){
			for(int j=1;j<=cols;j++){
				// print space from first to second last position(j = cols-1)
				if(j <= cols-i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}

	}
}