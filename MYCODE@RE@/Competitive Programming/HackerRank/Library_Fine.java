import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Library_Fine {

    // Complete the libraryFine function below.
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int day = 0, month = 0, year = 0;
        // int fine = 0;

        day = d1 - d2;
        month = m1 - m2;
        year = y1 - y2;

        if (year != 0) {
            if (year < 0)
                return 0;
            return 10000 * year;
        }
        if (month != 0 ) {
            if (month < 0)
                return 0;
            return 500 * month;
        }
        if (day != 0) {
            if (day < 0)
                return 0;
            return 15 * day;
        }
        return 0;

    }



    public static void main(String[] args) throws IOException {

        int d1 = 9;
        int m1 = 6;
        int y1 = 2016;

        int d2 = 6;
        int m2 = 6;
        int y2 = 2016;
        int result = libraryFine(d1, m1, y1, d2, m2, y2);
        System.out.println(result);


    }
}
