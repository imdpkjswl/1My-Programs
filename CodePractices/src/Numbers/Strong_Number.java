package Numbers;
/**
 * Strong Numbers are the numbers whose sum of factorial of digits is equal
 * to the original number.

 * Input  : n = 145
 * Output : Yes
 * Sum of digit factorials = 1! + 4! + 5!
 *                         = 1 + 24 + 120
 *                         = 145
 *
 * Input :  n = 534
 * Output : No
 */

public class Strong_Number {
    static int[] f = new int[10];

    // Fills factorials of digits from 0 to 9.
    static void preCompute() {
        f[0] = f[1] = 1;
        for (int i = 2; i<10; ++i)
            f[i] = f[i-1] * i;
    }

    static boolean isStrong(int num) {
        int fSum = 0;
        int n = num;

        while (n > 0) {
            fSum += f[n%10]; // store factorial sum
            n /= 10;
        }

        return num == fSum;
    }

    public static void main (String[] args) {
        // calling preCompute
        preCompute();

        int num = 145;
        System.out.println(isStrong(num));
    }
}
