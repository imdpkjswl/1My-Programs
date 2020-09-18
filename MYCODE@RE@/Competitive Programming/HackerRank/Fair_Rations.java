import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Fair_Rations {

    // Complete the fairRations function below.
    static int fairRations(int[] B) {

        int n = B.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (B[i] % 2 == 1) {
                if (i == n - 1)
                    return -1;
                else
                    B[i] += 1;
                B[i + 1] += 1;
                count += 2;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int N = 5;
        int[] B = new int[] {2, 3, 4, 5, 6};

        int result = fairRations(B);
        System.out.println(result);

    }
}
