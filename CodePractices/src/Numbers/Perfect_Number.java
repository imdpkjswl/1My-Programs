package Numbers;

/**
 A number is a perfect number if is equal to sum of its proper divisors, that is,
 sum of its positive divisors excluding the number itself.

 Input: n = 15
 Output: false
 Divisors of 15 are 1, 3 and 5. Sum of
 divisors is 9 which is not equal to 15.

 Input: n = 6
 Output: true
 Divisors of 6 are 1, 2 and 3. Sum of
 divisors is 6.
 */

public class Perfect_Number {

    static boolean isPerfect(int num){
        int sum = 0;

        for(int i=1;i<num;i++){
            if(num%i == 0){
                sum += i;
            }
        }

        return num == sum;
    }
    public static void main(String[] args) {
        int num  = 6;

        System.out.println(isPerfect(num));
    }
}
