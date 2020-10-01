import java.util.*;

public class A_Serval_and_Bus {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int t = in.nextInt();

		int[] table = new int[1001000];
		Arrays.fill(table, 0);

		for(int i=1;i<=n;i++) {
			int a = in.nextInt();
			int b = in.nextInt();

			while(a <= 100000) {
				table[a] = i;
				a += b;
			}
		}

		for(int i = t; true ;i++) {
			if(table[i] != 0){
				System.out.println(table[i]);
				System.exit(0);
			}
		}

	}
}