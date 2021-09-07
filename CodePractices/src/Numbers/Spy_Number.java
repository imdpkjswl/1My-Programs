package Numbers;
/**
 * A number is said to be a Spy number if the sum of all the digits is equal
 * to the product of all digits.

 * Input : 22
 * Output:  Given number is a SPY number.
 * Explanation: Sum of the number is 4 (2 + 2)
 *              Product of the number is as 4 (2 * 2)
 */

public class Spy_Number {
    static  boolean isSpy(int num) {
        int product = 1, sum = 0, r;

        // calculate sum and product of the number
        while (num > 0) {
            r = num % 10;
            sum += r;
            product *= r;
            num = num / 10;
        }

        return sum == product;
    }
    public static void main(String[] args) {

        System.out.println(isSpy(1241));

    }
}
