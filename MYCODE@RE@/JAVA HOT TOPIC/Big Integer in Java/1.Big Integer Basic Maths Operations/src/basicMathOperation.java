import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class basicMathOperation {
    public static void main(String [] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter First number: ");
        int a = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter second number: ");
        int b = Integer.parseInt(bufferedReader.readLine());

        BigInteger res1 = new BigInteger(String.valueOf(BigInteger.valueOf(a))); // Converting int into string
        BigInteger resA = res1.add(BigInteger.valueOf(b)); // adding a with b
        System.out.println("ADDITION:  "+resA);

        BigInteger res2 = res1;
        BigInteger resM = res2.subtract(BigInteger.valueOf(b)); // subtracting a with b
        System.out.println("SUBTRACTION:  "+resM);

        BigInteger res3 = res1;
        BigInteger resMul = res3.multiply(BigInteger.valueOf(b)); // multiply a with b
        System.out.println("MULTIPLICATION:  "+resMul);

        BigInteger res4 = res1;
        BigInteger resD = res4.divide(BigInteger.valueOf(b)); // dividing a with b
        System.out.println("DIVISION:  "+resD);

        BigInteger res5 = res1;
        BigInteger resR = res5.remainder(BigInteger.valueOf(b)); // remainder a with b
        System.out.println("REMAINDER:  "+resD);
    }
}
