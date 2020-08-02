public class Main {

    static int power(int x, int n) {
        // Base case
        if(n == 0)
            return 1;

        if(n % 2 == 0)
            return power(x, n/2)*power(x, n/2)*x; // even
        else
            return power(x, n/2)*power(x, n/2); // odd
    }

    public static void main(String[] args) {

        int x = 2;
        int n = 4;

        int result = power(x,n);

        System.out.println(result);

    }
}
