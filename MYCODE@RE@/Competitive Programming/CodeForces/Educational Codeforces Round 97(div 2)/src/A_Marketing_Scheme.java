import java.util.Scanner;

/**
 *
 Note that if ⌊l/a⌋<⌊r/a⌋ then exists such k*a that l≤ka≤r and, obviously, a customer, who wants to buy ka cans won't buy more than he wants.
 That's why ⌊l/a⌋=⌊r/a⌋ and we can rephrase our task as finding such a that a/2≤(l mod a)≤(r mod a)<a. The longer the segment [a/2,a) is the better and the maximum we can take is a=2l.
 As a result, we need to check that r<a ↔ r<2l.(base condition)
 *
→ Problem tags:
        brute force    constructive algorithms    greedy    math    *800
*/

public class A_Marketing_Scheme {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t-- > 0){
            int l = in.nextInt();
            int r = in.nextInt();

            if(2*l > r)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }
}
