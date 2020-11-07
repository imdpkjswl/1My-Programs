/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Ada_and_Dishes{
    private static boolean br1 = true, br2 = true;
    private static int requiredTime = 0;
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int burner(int dish1, int dish2){
        //System.out.println(dish1+"   "+dish2);

        int minV = (int)Math.min(dish1, dish2);
        requiredTime += minV;
        //System.out.println(minV);

        dish1 -= minV;
        dish2 -= minV;
        //System.out.println(dish1+"   "+dish2);

        if(dish1 == 0){
            br1 = false; return dish2; }
        else// if(dish2 == 0){
        {    br2 = false; return dish1; }
    }


    private static Scanner in = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception {
        int testCases =0;
        if(in.hasNextInt()){
            testCases = in.nextInt();
        }

        for(int t=0;t<testCases;t++) {
            // Set some before running test cases
            requiredTime = 0;
            br1 = true;
            br2 = true;

            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            // Handling smaller size array
            int max = -2;
            if(n <=2){
                for(int i=0;i<n;i++){
                    if(max < arr[i]){
                        max = arr[i];
                    }
                }
                System.out.println(max);
            }

            if(max != -2){
                continue;
            }

            // Check whether elements are identical or not.
            int same = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] != arr[i]) {
                    same = 1;
                    break;
                }
            }
            // When elements are identical, perform below operation.
            if (same == 0) {
                if (n % 2 == 0) {
                    System.out.println((int) Math.pow(arr[0], n / 2)); // even
                } else {
                    System.out.println((int) Math.pow(arr[0], (n / 2) + 1)); // odd
                }
            } else {

                Arrays.sort(arr);
                // Two Pointer Technique
                int p1 = 0, p2 = arr.length - 1;
                while (p1 < p2) {  // Reverse array
                    swap(arr, p1++, p2--);
                }

                int dish = -1; // initial dish minutes

                for (int i = 1; i < n; i++) {
                    if (dish == -1) {
                        dish = arr[0];
                        dish = burner(dish, arr[i]);
                    } else if (br2 == false) {
                        dish = burner(dish, arr[i]);
                        br2 = true;
                    } else if (br1 == false) {
                        dish = burner(arr[i], dish);
                        br1 = true;
                    }
                }

                System.out.println(requiredTime);
            }
        }
    }
}