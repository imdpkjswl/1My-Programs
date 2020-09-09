import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'nonDivisibleSubset' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY s
     */

    public static int nonDivisibleSubset(int k, List<Integer> arr) {
        // int max = 0;
        // for (int i = 0; i < arr.size(); i++) {
        //     for (int j = i + 1; j < arr.size(); j++) {
        //         if ((arr.get(i) + arr.get(j)) % k != 0) {
        //             max++;
        //         }
        //     }
        // }
        // return max;


        // REAL SOLUTION
        // Array for storing frequency of modulo values
        int[] f = new int[k];

        // Fill frequency array with values modulo K
        for (int i = 0; i < arr.size(); i++)
            f[arr.get(i) % k]++;

        //  if K is even, then update f[K/2]
        if (k % 2 == 0)
            f[k / 2] = Math.min(f[k / 2], 1);

        // Initialize result by minimum of 1 or count of numbers giving remainder 0
        int res = Math.min(f[0], 1);

        // Choose maximum of count of numbers giving remainder i or K-i
        for (int i = 1; i <= k / 2; i++)
            res += Math.max(f[i], f[k - i]);

        return res; // maximum subset possible

    }

}

public class Non_Divisible_Subset {
    public static void main(String[] args) throws IOException {

        int k = 3;

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(7);
        arr.add(2);
        arr.add(4);

        int result = Result.nonDivisibleSubset(k, arr);
        System.out.println(result);

    }
}
