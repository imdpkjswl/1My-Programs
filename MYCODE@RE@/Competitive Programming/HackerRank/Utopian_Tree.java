import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Utopian_Tree {

    // Complete the utopianTree function below.
    static int utopianTree(int n) {

        int height = 1; // initial height of tree.
        for (int i = 1 ; i <= n; i++) {
            if (i % 2 == 0)
                height = height + 1; // even-summer
            else
                height = 2 * height; // odd-spring
        }
        return height;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = 5; // , denoting the number of cycles.
        int result = utopianTree(n);
        System.out.println(result);

    }
}
