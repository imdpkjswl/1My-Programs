import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Append_and_Delete {

    // Complete the appendAndDelete function below.
    /*    static String appendAndDelete(String s, String t, int k) {
            // My solution--> 2/14 test cases failed :(
            if (s == t)
                return "Yes";

            char[] chrOne = s.toCharArray();
            char[] chrTwo = t.toCharArray();
            int i = 0, j = 0;

            int oneLeft = chrOne.length;
            int twoLeft = chrTwo.length;

            while (i < oneLeft && j < twoLeft  && chrOne[i] == chrTwo[j]) {
                //System.out.println(i + " " + j);
                i++;
                j++;
            }


            oneLeft = oneLeft - i;
            twoLeft = twoLeft - j;
            //System.out.println(oneLeft + " " + twoLeft);

            if (oneLeft + twoLeft <= k)
                return "Yes";
            return "No";
        }
    */

    // Real working solution
    private static String appendAndDelete(String s, String t, int k) {

        char[] chrOne = s.toCharArray();
        char[] chrTwo = t.toCharArray();
        int i = 0, j = 0;

        int oneLeft = chrOne.length;
        int twoLeft = chrTwo.length;

        while (i < oneLeft && j < twoLeft  && chrOne[i] == chrTwo[j]) {
            i++;
            j++;
        }


        int l1 = oneLeft - i;
        int l2 = twoLeft - j;

        int need = l1 + l2;
        if (need <= k && (k - need) % 2 == 0 || k >= oneLeft + twoLeft)
            return "Yes";
        return "No";
    }


    public static void main(String[] args) throws IOException {

        String s = "hackerrank";
        String t = "hackerhappy";
        int k = 9;
        // Aim is to convert s string to t string by performing <= k operation.
        String result = appendAndDelete(s, t, k);
        System.out.println(result);
    }
}
