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
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */


    /*
        // Real solution1: GITHUB
        public static int pickingNumbers(List<Integer> a) {
            Collections.sort(a);
            int start = 0;
            int i = 0;
            int max = 0;

            while (i < a.size()) {
                if (Math.abs(a.get(start) - a.get(i)) > 1) {
                    start = i;
                }
                max = Math.max(max, i - start + 1);
                i++;
            }
            i--;
            return Math.max(max, i - start + 1);
        }
    */

    // Real solution2: HACKERRANK
    public static int pickingNumbers(List<Integer> a) {
        // An array of zeroes
        int[] frequency = new int[100 + 1];
        // Fill array so that the value at each index corresponds to the number of occurrences of that integer
        for (int i = 0; i < a.size(); i++) {
            frequency[a.get(i)]++;
        }
        // Determine which pair of adjacent integers has the highest number of occurrences
        int max = 0;
        for (int i = 1; i <= 100; i++) {
            int count = frequency[i] + frequency[i - 1];//why we are doing like this coz absolute diff must be 0 or 1.


            max = Math.max(max, count);
        }
        return max;
    }


    /*  // MY SOLUTION: 5/9 test cases failed:)
        public static int pickingNumbers(List<Integer> a) {
            int maxMultiSet = 0;

            for (int i = 0; i < a.size(); i++) {
                int curMax = 0;
                for (int j = 0; j < a.size(); j++) {
                    if (Math.abs(a.get(i) - a.get(j)) <= 1  && i != j) {
                        curMax++;
                    }
                }
                maxMultiSet = Math.max(maxMultiSet, curMax);
            }
            return maxMultiSet;

        }
    */

}

public class Picking_Numbers {
    public static void main(String[] args) throws IOException {

        List<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(6);
        a.add(5);
        a.add(3);
        a.add(3);
        a.add(1);


        int result = Result.pickingNumbers(a);
        System.out.println(result);
    }
}
