import java.util.Scanner;

/**
 We need to make our string alternating, i. e. si≠si+1. When we reverse substring sl…sr,
 we change no more than two pairs sl−1,sl and sr,sr+1. Moreover, one pair should be a
 consecutive pair 00 and other — 11. So, we can find lower bound to our answer as maximum
 between number of pairs of 00 and number of pairs of 11. And we can always reach this
 lower bound, by pairing 00 with 11 or with left/right border of s.

 Another way to count the answer is next: suppose we want to make string 0101..., then
 let's transform s to 1 + s + 0. For example, if s= 0110, we will get 101100. We claim
 that after this transformation, we will have equal number of 00 and 11, so the answer
 is the number of consecutive pairs of the same character divided by two. The answer is
 the minimum between answers for 1 + s + 0 and 0 + s + 1.
 */

public class B_Reverse_Binary_Strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


    }
}
