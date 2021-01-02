import java.math.BigInteger;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Chef_and_Division_3 {

    private static int maxHost(int n, int k, int d, int[] problems) {
        int sum =0;
        for(int i=0;i<n;i++){
            sum += problems[i];
        }
        int res = sum/k;
        if(res > d){
            return d;
        }
        return res;
    }

    public static void main (String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T=0; if(in.hasNextInt()){ T = in.nextInt(); }
        for(int t=1;t<=T;t++) {
            int N = 0;if (in.hasNextInt()) { N = in.nextInt(); }
            int K = 0;if (in.hasNextInt()) { K = in.nextInt(); }
            int D = 0;if (in.hasNextInt()) { D = in.nextInt(); }


            int[] problems = new int[N];
            for(int i=0;i<N;i++){
                problems[i] = in.nextInt();
            }

            int result = maxHost(N,K,D,problems);
            System.out.println(result);
        }

    }
}
