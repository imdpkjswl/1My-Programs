import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Sequence_Equation {

    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
        int[] result = new int[p.length];

        for (int x = 1; x <= p.length; x++) {
            int f = 0;
            for (int i = 0; i < p.length; i++) {
                if (p[i] == x) {
                    f = i + 1;
                    break;
                }
            }
            //System.out.println(p[f - 1]);
            for (int i = 0; i < p.length; i++) {
                if (p[f - 1] == p[p[i] - 1]) {
                    // System.out.println(i + 1);
                    result[x - 1] = i + 1;
                    break;
                }
            }
        }

        return result;

    }


    public static void main(String[] args) throws IOException {


        int[] p = new int[] {2, 3, 1};

        int[] result = permutationEquation(p);
        for (int i : result)
            System.out.print(i + " ");

    }
}


/*
For each x from 1 to n, print an integer denoting any valid y satisfying the equation p(p(y)) == x on a new line.

Sample Input 1
5
4 3 5 1 2

Sample Output 1
1
3
5
4
2
*/