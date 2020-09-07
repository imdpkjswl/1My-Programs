import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Save_The_Prisoner {

    // Complete the saveThePrisoner function below.
    static int saveThePrisoner(int prisoners, int candy, int start) {
        //My solution
        // int temp, count;
        // temp = candy % prisoners;
        // count = temp + start - 1;
        // return count;

        // Real solution
        int temp;
        temp = (candy + start - 1) % prisoners;
        if (temp == 0)
            return prisoners;
        else
            return temp;
    }



    public static void main(String[] args) throws IOException {

        int n =  7;    // total prisoners
        int m = 19;   // total candy
        int s =  2;  // distribution start

        int result = saveThePrisoner(n, m, s);
        System.out.println(result);
    }
}
