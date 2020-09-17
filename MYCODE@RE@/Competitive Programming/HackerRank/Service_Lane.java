import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// Here, the main goal is to find min element within given range of array.
public class Service_Lane {

    // Complete the serviceLane function below.
    static int serviceLane(int[] arr, int begin, int end) {
        int min = Integer.MAX_VALUE;

        for (int i = begin; i <= end; i++) {
            if (arr[i] <= min)
                min = arr[i];
        }

        return min;

    }

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = in.nextInt();
        int t = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int k = 1; k <= t; k++) {
            int begin = in.nextInt();
            int end = in.nextInt();

            int result = serviceLane(arr, begin, end);
            System.out.println(result);
        }
    }
}
