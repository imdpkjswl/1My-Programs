import java.util.*;

class _12_Palindromic_pattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for(int i=1;i<=n;i++){
			// Print space at n-i times in each row
			for(int j=1;j<=n-i;j++){ 
				System.out.print(" ");
			}

			// Print left most digit in decreasing order
			for(int k=i;k >=1;k--){
				System.out.print(k);
			}

			// Print right most digit in increasing order to form palindromic pattern
			int p = 2;
			for(int j=1;j<=i-1;j++){
				System.out.print(p++);
			}

			System.out.println();
		}

	}
} 