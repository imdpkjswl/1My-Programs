import java.util.*;

class _13_Star_pattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for(int i=1;i<=n;i++){
			// Print space at n-i times in each row
			for(int j=1;j<=n-i;j++){ 
				System.out.print(" ");
			}

			// Print 1 to i stars 
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}

			// Print 1 to i-1 stars
			for(int j=1;j<=i-1;j++){
				System.out.print("*");
			}


			System.out.println();
		}


		// Print lower pattern, just mirror image of above pattern
		for(int i=n;i>=1;i--){
			// Print space at n-i times in each row
			for(int j=1;j<=n-i;j++){ 
				System.out.print(" ");
			}

			// Print 1 to i stars  
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}

			// Print 1 to i-1 stars 
			for(int j=1;j<=i-1;j++){
				System.out.print("*");
			}

			System.out.println();
		}

	}
} 