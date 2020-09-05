import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Designer_Pdf_Viewer {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
        char[] chr = word.toCharArray();
        int[] temp = new int[26];

        int k = 0;
        for (char i : chr) {
            int t = (int)i;
            temp[t - 97] = t - 96;
        }


        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (temp[i] != 0) {
                arr.add(h[i]);
            }
        }

        int max = 0;
        for (int i : arr) {
            max = Math.max(max, i);
        }


        return max * chr.length;
    }

    public static void main(String[] args) throws IOException {

        int[] h = new int[] {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7, 7};

        String word = "zabc";

        int result = designerPdfViewer(h, word);
        System.out.println(result);

    }
}
