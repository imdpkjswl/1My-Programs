import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Sock_Merchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int[] table = new int[110];
        Arrays.fill(table, 0);

        for (int i = 0; i < ar.length; i++) {
            table[ar[i]]++; // store frequency of elements
        }

        int count = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i] != 0) {
                count += table[i] / 2;
            }

        }

        return count;

    }


    public static void main(String[] args) {

        int n = 9;
        int[] arr = new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20};

        int result = sockMerchant(n, arr);

        System.out.println(result);
    }
}
