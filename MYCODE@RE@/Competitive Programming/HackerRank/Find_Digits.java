import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Find_Digits {

    // Complete the findDigits function below.
    static int findDigits(int n) {
        int num = n;
        int count = 0;
        List<Integer> digits = new ArrayList<>();
        while (n > 0) {
            int temp = n % 10;
            n = n / 10;
            if (temp != 0)
                digits.add(temp);
        }

        //System.out.println(digits);
        // now, count the digits which completely divides given num.
        for (int i = 0; i < digits.size(); i++) {
            if (num % digits.get(i) == 0)
                count++;
        }
        return count;

    }



    public static void main(String[] args) throws IOException {

        int n = 1012;
        int result = findDigits(n);
        System.out.println(result);
    }
}
