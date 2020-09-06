import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Angry_Professor {

    // Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {
        int count = 0; // count total attended student
        for (int i : a)
            if (i <= 0)
                count++;

        if (count < k) // compare
            return "YES"; // class cancelled
        else
            return "NO"; // class not cancelled
    }

    public static void main(String[] args) throws IOException {

        int[] a = new int[] { -1, -3, 4, 2}; // here, two student attended the class[-1, -3].
        int k = 3; // professor want atleast three student to attend.Hence class will be cancelled.

        String result = angryProfessor(k, a);
        System.out.println(result);

    }
}
