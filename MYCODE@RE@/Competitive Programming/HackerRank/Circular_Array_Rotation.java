import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Circular_Array_Rotation {

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {

        // 1/15 test cases failed, due to runtime error.
        int n = a.length;
        int q = queries.length;
        int[] temp = new int[n];
        int[] result = new int[q];
        int r = 0;

        // copy k element from last to another array
        for (int i = n - k; i < n; i++) {
            temp[r++] = a[i];
        }

        // copy first n-k element to another array
        for (int i = 0; i < n - k; i++) {
            temp[r++] = a[i];
        }

        // store queries[i]th index value to result
        for (int i = 0; i < q; i++) {
            result[i] = temp[queries[i]];
        }

        return result;

    }


    public static void main(String[] args) throws IOException {

        int k = 2; // no. of right roations

        int[] arr = new int[] {1, 2, 3, 4, 5};
        int[] queries = new int[] {0, 4, 2};

        int[] result = circularArrayRotation(arr, k, queries);
        for (int i : result)
            System.out.println(i);

    }
}
