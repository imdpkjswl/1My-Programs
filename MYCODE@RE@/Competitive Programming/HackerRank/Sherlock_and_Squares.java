import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Sherlock_and_Squares {

    // Complete the squares function below.
    static int squares(int a, int b) {
        // Your code did not execute within the time limits
        // int count = 0;
        // for (int i = a; i <= b; i++) {
        //     double findRoots = Math.sqrt(i);
        //     if ((int)Math.sqrt(i) == findRoots)
        //         count++;
        // }
        // return count;

        // As the above prgm shows time limit exceeded, then the new approach is
        // to find sqrt of first number(take their ceil value) and also find sqrt of second number
        // (take floor value) and then count by using formula = (last+1) - first.
        double first = Math.sqrt(a);
        double second = Math.sqrt(b);
        if ((int)Math.sqrt(a) != first)
            first = (int)first + 1;

        if ((int)Math.sqrt(b) != second)
            second = (int)second;
        //System.out.println(second);

        return (int)second + 1 - (int)first;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int a = 24;
        int b = 49;

        int result = squares(a, b);
        System.out.println(result);
    }
}
