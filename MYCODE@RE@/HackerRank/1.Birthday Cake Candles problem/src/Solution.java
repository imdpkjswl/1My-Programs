import java.io.*;
import java.util.*;


public class Solution {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        // I don't know why this is working on Hackerrank
        int tallest = 0;
        int frequency = 0;


        for(int i=0; i < ar.length; i++){
            int height = ar[i];

            if(height > tallest){
                tallest = height;
                frequency = 1;
            }
            else if(height == tallest) frequency++;
        }

        return frequency;

    }

    public static void main(String[] args) {
        int[] ar = {3 , 7, 2 , 5, 3, 1, 3};
        int result = birthdayCakeCandles(ar);
        System.out.println(result);
    }
}
