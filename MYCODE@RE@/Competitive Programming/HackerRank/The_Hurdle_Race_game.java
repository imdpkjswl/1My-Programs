import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class The_Hurdle_Race_game {

    // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {
        int max = 0;

        // pick max one and do minus with max and return. for negative return 0.
        for (int i : height) {
            max = Math.max(max, i);
        }

        if ((max - k) <= 0 )
            return 0;
        else
            return (max - k);

    }


    public static void main(String[] args) throws IOException {

        int n = 5;

        int k = 4;

        int[] height = new int[] {1, 6, 3, 5, 2};

        int result = hurdleRace(k, height);
        System.out.println(result);

    }
}
