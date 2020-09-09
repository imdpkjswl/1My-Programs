import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Repeating_String {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long res = 0;
        char[] chr = s.toCharArray();
        long l = chr.length;
        long count_a = 0;
        // first count no. of a's present string
        for (int i = 0; i < l; i++) {
            if ('a' == chr[i]) {
                count_a++;
            }
        }

        long tmp1 = n % l; // get the partial word info
        long tmp2 = n / l; // get full word info

        // calculate a's in partial word
        long remain_a = 0;
        for (int i = 0; i < tmp1; i++) {
            if ('a' == chr[i]) {
                remain_a++;
            }
        }

        // add all a's occurred in string(repeating) of length n.
        long a_occurrence = tmp2 * count_a + remain_a;

        return a_occurrence;
    }


    public static void main(String[] args) throws IOException {

        String s = "abcac";
        long n = 18;

        long result = repeatedString(s, n);
        System.out.println(result);
    }
}
