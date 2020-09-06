import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Beautiful_Days_at_Movies {
//3/10 test cases failed :(
    static int reverseNum(int n) {
        if (n / 10 == 0)
            return n;
        int res = 0;
        while (n > 0) {
            int temp = n % 10;
            n /= 10;
            res = res * 10 + temp;
        }
        return res;
    }

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int count = 0;

        while (i <= j) {
            int reverse = reverseNum(i);
            int diff = Math.abs((i - reverse));
            if (diff % k == 0)
                count++;
            i++;
        }
        return count;

    }


    public static void main(String[] args) throws IOException {

        int i = 1;//20;
        int j = 2000000;//23;
        int k = 23047885;//6;

        int result = beautifulDays(i, j, k);
        System.out.println(result);

    }
}
