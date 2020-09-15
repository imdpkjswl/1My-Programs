import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
// Here, motto is to find min distance between two integers of same digit.
public class Minimum_Distances {

    // Complete the minimumDistances function below.
    static int minimumDistances(int[] a) {

        int distance = -1;
        int min = Integer.MAX_VALUE;

        for (int j = 0; j < a.length; j++) {
            int temp = a[j];
            for (int i = j + 1; i < a.length; i++) {
                if (temp == a[i]) {
                    distance = i - j;
                    if (distance < min) {
                        min = distance;
                    }
                }
            }
        }

        if (min == Integer.MAX_VALUE)
            return -1;
        return min;

    }


    public static void main(String[] args) throws IOException {

        int n = 6;
        int[] a = new int[] {7, 1, 3, 4, 1, 7};

        int result = minimumDistances(a);
        System.out.println(result);
    }
}
