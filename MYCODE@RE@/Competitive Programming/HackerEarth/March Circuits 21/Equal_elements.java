import java.util.*;
// Got partial output
public class Equal_elements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while(t-->0) {
            int N = in.nextInt();
            int[] a = new int[N];
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                a[i] = in.nextInt();
                max = Math.max(max, a[i]);
            }

            for (int i = 0; i < N; i++) {
                int tmp = a[i];
                while (tmp <= max) {
                    a[i] = tmp;
                    tmp += 2;
                }
            }

            int minCoin = 0;
            for (int val : a) {
                minCoin += Math.abs(max - val);
            }

            System.out.println(minCoin);
        }
    }
}
