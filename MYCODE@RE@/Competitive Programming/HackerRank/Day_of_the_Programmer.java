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

public class Day_of_the_Programmer {
    static boolean isLeapYear(int year) {
        if (year % 400 == 0)
            return true;

        // if (year % 100 == 0)
        //     return false;

        if (year % 4 == 0)
            return true;
        return false;
    }


    // 7/60 test case failed.For example: at 2200 should be 13.09.2200.
    static String dayOfProgrammer(int year) {
        boolean leap = isLeapYear(year);

        if (leap) {
            return "12.09." + year;
        } else {
            return "13.09." + year;
        }

    }

    public static void main(String[] args) throws IOException {
        int year = 2200;// at this getting wrong answer.

        String ans = dayOfProgrammer(year);

        System.out.println(ans);
    }
}
