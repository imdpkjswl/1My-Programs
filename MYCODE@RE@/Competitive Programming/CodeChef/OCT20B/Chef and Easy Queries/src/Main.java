import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = 0;
        if(in.hasNextInt())
            t = in.nextInt();

        for(int j =1;j<=t;j++) {
            long  n, k;
            n = in.nextLong();
            k = in.nextLong();
            long[] queries = new long[(int) n];
            for (int i = 0; i < n; i++) {
                queries[i] = in.nextLong();
            }


            // The below solution gives partially correct answer: I got 20% points.
            long ans = 1;
            long p=0;
            long total = queries[(int) p++];

            while (total>=k){
                total = total - k;  // left
                ans++;
                if (p != queries.length)
                    total += queries[(int) p++];
            }
            System.out.println(ans);
        }
    }
}
