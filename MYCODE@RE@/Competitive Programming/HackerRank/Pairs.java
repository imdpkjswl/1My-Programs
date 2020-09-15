import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Pairs {

    // Complete the pairs function below.
    static int pairs(int k, int[] arr) {
        Arrays.sort(arr);
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (k > arr[i]) {
                index = i;
            }
        }

        int count = 0;
        for (int i = index; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((int)Math.abs(arr[j] - arr[i]) == k)
                    count++;
            }
        }

        return count;

    }


    public static void main(String[] args) throws IOException {

        int n = 5;
        int k = 2;
        int[] arr = new int[] {1, 5, 3, 4, 2};

        int result = pairs(k, arr);
        System.out.println(result);
    }
}
