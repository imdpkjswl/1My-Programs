import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Counting_Valley {

    // Complete the countingValleys function below.
    static int countingValleys(String str) {
        int altitude = 0;
        int valley = 0;

        char[] chr = str.toCharArray(); // convert string to char array

        // Idea is, whenever hiker reached at same level, we have to count as a valley.
        for (char steps : chr) { // pick one charcter one by one and decide altitude
            if (steps == 'D')
                altitude--;
            if (steps == 'U') {
                altitude++;
                if (altitude == 0)
                    valley++;  // got the sea level
            }
        }

        return valley;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String string = "DDUUDDUDUUUD";
        int result = countingValleys(string);

        System.out.println(result);

    }
}
