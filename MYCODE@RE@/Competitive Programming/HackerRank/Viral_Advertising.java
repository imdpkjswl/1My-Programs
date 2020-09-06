import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
Here, the main idea, firstly find nth day people how much received advertisement.
then, find out likes of per day and at last, get the sum of all likes from the first day.
and return as answer.
*/
public class Viral_Advertising {

    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
        int people = 5;
        int like;
        int share;
        int nextDay;
        int cumulative = 0;

        for (int i = 1; i <= n; i++) {

            like = people / 2;
            cumulative += like;
            // System.out.println(cumulative);
            share = 3;
            nextDay = like * share;
            people = nextDay;

        }
        // System.out.println(people); // show the (n+1) day's people.
        return cumulative;
    }



    public static void main(String[] args) throws IOException {

        int n = 5; // no. of days
        int result = viralAdvertising(n);
        System.out.println(result);
    }
}
