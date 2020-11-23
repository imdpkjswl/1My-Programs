import java.util.*;

class _7_Butterfly_pattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();// n = 2*(rows + cols)

		
		// print upper half butterfly
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}

			// calculate spaces at each row
			int space = 2*n-2*i;

			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}

			for(int j=1;j<=i;j++){
				System.out.print("*");
			}

			System.out.println();
		}


		// print lower half butterfly
		for(int i=n;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}

			// calculate spaces at each row
			int space = 2*n-2*i;

			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}

			for(int j=1;j<=i;j++){
				System.out.print("*");
			}

			System.out.println();
		}


	}
}