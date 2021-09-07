package Numbers;

public class Armstrong_Number {
    static int power(int x, long y) {
        if( y == 0) return 1;

        if (y%2 == 0) // for even power
            return power(x, y/2)*power(x, y/2);
        // for odd power
        return x*power(x, y/2)*power(x, y/2);
    }

    static boolean isArmstrong(int num) {
        int tmp = num;
        int sum = 0;

        while(tmp>0){
            int r = tmp%10;
            sum += power(r, 3); // store sum of cube of numbers
            tmp /= 10;
        }

        return num == sum;
    }


    public static void main(String[] args) {
        int num = 153;

        System.out.println(isArmstrong(num));
    }
}
