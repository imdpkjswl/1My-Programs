import java.util.*;

class _2_Hollow_Rectangle_pattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int rows = in.nextInt();
		int cols = in.nextInt();

		for(int i=1;i<=rows;i++){
			for(int j=1;j<=cols;j++){
				// Print * for first and last rows
				if(i==1 || i == rows){
					System.out.print("*");
				}
				// Print * for first and last cols
				else if(j == 1 || j == cols){
					System.out.print("*");
				}
				// Print space for other places
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}