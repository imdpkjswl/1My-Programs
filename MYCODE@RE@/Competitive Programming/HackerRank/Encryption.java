import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Encryption {

    // Complete the encryption function below.
    static String encryption(String s) {
        int textLength = s.length();
        double value = Math.sqrt(textLength);
        int row = (int)Math.floor(value);
        int column = (int)Math.ceil(value);

        if (row * column < textLength)
            row += 1;

        char[] chr = s.toCharArray();
        int count = 0;
        char[][] grid = new char[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (count == textLength)
                    break;
                grid[i][j] = chr[count++];
            }
        }

        count = 0;
        String result = "";
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                if (Character.isAlphabetic(grid[j][i]))
                    result += grid[j][i];
                //System.out.print(grid[j][i] + " ");
            }
            result += " ";
            System.out.println();
        }
        return result;
    }


    public static void main(String[] args) throws IOException {
        String s = "chillout";//"feedthedog";

        String result = encryption(s);
        System.out.println(result);
    }
}
