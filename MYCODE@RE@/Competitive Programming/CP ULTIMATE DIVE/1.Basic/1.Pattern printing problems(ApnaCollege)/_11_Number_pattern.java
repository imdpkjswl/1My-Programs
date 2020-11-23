import java.util.*;

class _11_Number_pattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for(int i=1;i<=n;i++){
			// Print space at n-i times in each row
			for(int j=1;j<=n-i;j++){ 
				System.out.print(" ");
			}

			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}
} 