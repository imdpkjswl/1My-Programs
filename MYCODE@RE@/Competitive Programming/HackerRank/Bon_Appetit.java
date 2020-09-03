import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Bon_Appetit {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int sumExceptK = 0;

        for (int i = 0; i < bill.size(); i++) {
            if (k != i) {
                sumExceptK += bill.get(i);
            }
        }
        sumExceptK /= 2;

        if (sumExceptK < b) {
            System.out.println(b - sumExceptK);
        } else if (sumExceptK == b) {
            System.out.println("Bon Appetit");
        }



    }

    public static void main(String[] args) throws IOException {
        int k = 1; // kth index

        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);

        int bActual = 7;

        bonAppetit(bill, k, bActual);

    }
}
