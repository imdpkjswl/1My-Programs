import java.util.*;
import java.lang.*;

class Chef_and_Dice {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = 0;if (in.hasNextInt()) {T = in.nextInt();}

        while(T-->0) {
            int N = 0;if (in.hasNextInt()) {N = in.nextInt();}
            int s1 = 20;
            int s2 = 36;
            int s3 = 51;
            int s4 = 60;

            int ans = 0;
            if (N == 1) {
                System.out.println(s1);
            } else if (N == 2) {
                System.out.println(s2);
            } else if (N == 3) {
                System.out.println(s3);
            } else if (N == 4) {
                System.out.println(s4);
            } else {
                int r = N % 4;
                ans =( 60 * (N / 4)) - (4 * (N - 4));

                if (r == 1) {
                    ans += s1;
                } else if (r == 2) {
                    ans += s2;
                } else if (r == 3) {
                    ans += s3;
                }
                System.out.println(ans);
            }


        }
    }

}




