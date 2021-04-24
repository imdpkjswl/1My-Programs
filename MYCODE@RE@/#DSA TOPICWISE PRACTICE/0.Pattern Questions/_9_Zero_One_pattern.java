import java.util.*;

class _9_Zero_One_pattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				if((j & 1)==0)
					System.out.print("0"); // For even position
				else
					System.out.print("1"); // For odd position
			}
			System.out.println();
		}

	}
}