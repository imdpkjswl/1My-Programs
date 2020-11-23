import java.util.*;

/*here row is fixed and  n(stars) == 9

  *   *
 * * * *
*   *   *

*/
class _14_ZigZag_pattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for(int i=1;i<=3;i++){
			for(int j=1;j<=n;j++){
				if(((i+j)%4==0) || (i ==2 && j%4==0)){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}

			System.out.println();
		}

	}
} 