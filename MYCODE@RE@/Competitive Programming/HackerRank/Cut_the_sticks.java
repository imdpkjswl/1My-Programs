import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
Example:
sticks-length length-of-cut sticks-cut:
Take min value and slice all biggest one and remove min and count no. of slice on each iteration.
5 4 4 2 2 8 2 6
3 2 2 _ _ 6 2 4
1 _ _ _ _ 4 1 2
_ _ _ _ _ 3 3 1
_ _ _ _ _ _ DONE
*/
public class Cut_the_sticks {

    // Complete the cutTheSticks function below.
    static void cutTheSticks(int[] arr) {

        // Arrays.sort(arr); // sort array(Optional)
        int count = Integer.MAX_VALUE;

        while (count != 0) {
            int minValue = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (minValue > arr[i] && arr[i] != -1)
                    minValue = arr[i];
            }

            count = 0;
            for (int i = 0; i < arr.length; i++)
                if (arr[i] != -1)
                    count++;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != -1)
                    arr[i] = arr[i] - minValue;
                if (arr[i] == 0) {
                    arr[i] = -1;
                }
            }
            if (count != 0)
                System.out.println(count);
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] arr = new int[] {4, 8, 2, 5, 2, 4};

        cutTheSticks(arr);


    }
}
