import java.util.*;

class _10_Rhombus_pattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for(int i=1;i<=n;i++){
			// Print space at n-i times in each row
			for(int j=1;j<=n-i;j++){ 
				System.out.print(" ");
			}

			// Print n times * in each row
			for(int j=1;j<=n;j++){
				System.out.print("*");
			}
			
			System.out.println();
		}

	}
} 