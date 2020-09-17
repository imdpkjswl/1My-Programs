import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// Here, the idea is run problem from 1 to a[i] and increment page, when problem equal to k.
// Do not increment page, when problem == a[i].
// count problem as unique, when page equal to problem.
// And at last, increment page when problem gets over normally.
public class Lisa_s_Workbook {

    // Complete the workbook function below.
    static int workbook(int n, int k, int[] arr) {
        int count = 0;
        int page = 1;
        int problem;

        for (int i = 0; i < n; i++) {
            for (problem = 1; problem <= arr[i]; problem++) {
                if (page == problem) {
                    count++;
                }
                if (problem % k == 0 && problem % arr[i] != 0)
                    page++;
                //System.out.println(page);
            }
            page++;

            // System.out.println(page);
        }

        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = 5;
        int k = 3;
        int[] arr = new int[] {4, 2, 6, 1, 10};

        int result = workbook(n, k, arr);
        System.out.println("Total unique problem in workbook: " + result);
    }
}
