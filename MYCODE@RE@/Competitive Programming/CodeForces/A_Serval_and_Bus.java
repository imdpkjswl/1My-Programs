import java.util.*;

public class A_Serval_and_Bus {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int t = in.nextInt();

		int[] s = new int[n];
		int[] d = new int[n];

		for(int i=0;i<n;i++){
			s[i] = in.nextInt();
			d[i] = in.nextInt();
		}

		int count=1;
		for(int i=1;i<n;i++){
			if(s[0] == s[i]){
				count++;
			}
		}

		if(count == n){
			System.out.println("1");
			return;
		}

		for(int i=0;i<n;i++){
			if(t <= s[i]){
				System.out.println(i+1);
				return;
			}
		}

	}
}