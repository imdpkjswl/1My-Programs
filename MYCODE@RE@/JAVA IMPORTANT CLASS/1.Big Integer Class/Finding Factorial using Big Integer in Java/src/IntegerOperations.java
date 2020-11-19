import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class IntegerOperations {
    public static void main(String [] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int n = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Factorial of "+n+" is:  "+factorial(n));

    }

    /**
     * @param n is the number
     * @return factorial of n
     */
    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;

        for(int i=2;i<=n;i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
