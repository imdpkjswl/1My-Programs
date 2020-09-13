import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Organising_Containers_Of_Ball {

    // Complete the organizingContainers function below.
    static String organizingContainers(int[][] container) {
        int n = container.length;
        int[] space = new int[n];
        int[] ball = new int[n];
        Arrays.fill(space, 0);
        Arrays.fill(ball, 0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                space[i] = space[i] + container[i][j]; // no. of spaces
                ball[i] = ball[i] + container[j][i]; // no.of balls
            }
        }

        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (space[i] == ball[j]) {
                    ball[j] = 0;
                    space[i] = 0;
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }
            if (!flag) {
                break;
            }
        }

        if (!flag)
            return "Impossible";
        else
            return "Possible";

    }


    public static void main(String[] args) throws IOException {

        int q = 2;

        int[][] container = new int[][] {{1, 1}, {1, 1}}; // {{0, 2}, {1, 1}};
        String result = organizingContainers(container);
        System.out.println(result);

    }
}
