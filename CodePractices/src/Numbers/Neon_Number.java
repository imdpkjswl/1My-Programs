package Numbers;

public class Neon_Number {

    static boolean isNeon(int num) {
        int sqr = num * num;
        int sum = 0;

        while (sqr > 0) {
            int r = sqr % 10;
            sum += r;
            sqr /= 10;
        }

        return num == sum;
    }


    public static void main(String[] args) {
        int num = 9;

        System.out.println(isNeon(num));
    }
}
