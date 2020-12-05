/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Even_Pair_Sum {

    public static void main (String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        /* BRUTE FORCE THROUGH TLE ERROR
                int T=0, a=0, b=0;
                if(in.hasNextInt()){
                    T = in.nextInt();
                }


                for (int t = 1; t <= T; t++) {
                    int ans = 0;
                    if(in.hasNextInt()){
                        a = in.nextInt();
                    }
                    if(in.hasNextInt()){
                        b = in.nextInt();
                    }

                    for (int i = 1; i <= a; i++) {
                        for (int j = 1; j <= b; j++) {
                            if ((i + j) % 2 == 0){
                                ans++;
                            }
                        }
                    }
                    System.out.println(ans);
                }
        */

// Here the idea is, even + even = even and odd + odd = even
        long T = 0, a = 0, b = 0;
        if (in.hasNextInt()) {
            T = in.nextInt();
        }

        for (int t = 1; t <= T; t++) {
            if (in.hasNextInt()) {
                a = in.nextInt();
            }
            if (in.hasNextInt()) {
                b = in.nextInt();
            }

            long ans = 0;
            long e1 = 0, e2 = 0, o1 = 0, o2 = 0;

            if (a % 2 == 0 && b % 2 == 0) {
                e1 = a / 2;
                e2 = b / 2;
                o1 = a / 2;
                o2 = b / 2;
            } else if (a % 2 != 0 && b % 2 != 0) {
                e1 = a / 2;
                e2 = b / 2;
                o1 = (a / 2) + 1;
                o2 = (b / 2) + 1;
            } else if (a % 2 != 0 && b % 2 == 0) {
                e1 = a / 2;
                e2 = b / 2;
                o1 = (a / 2) + 1;
                o2 = b / 2;
            } else if (a % 2 == 0 && b % 2 != 0) {
                e1 = a / 2;
                e2 = b / 2;
                o1 = a / 2;
                o2 = (b / 2) + 1;
            }

            ans = e1 * e2 + o1 * o2;
            System.out.println(ans);
        }

    }
}
