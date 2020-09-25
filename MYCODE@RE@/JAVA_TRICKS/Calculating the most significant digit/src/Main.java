import java.math.*;

public class Main {

    public static void main(String[] args) {
        int N = 12345678;

        double K = Math.log10(N);
        K = K - Math.floor(K);
        int X = (int)Math.pow(10, K);  // X will be the most significant digit.

        System.out.println(X);
    }
}
