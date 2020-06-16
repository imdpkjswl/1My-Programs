package com.company;

import java.util.Scanner;

/**
 * Find minimum number of jumps to reach at end where each index value represents max number of steps can be made.
 * Time Complexity: O(n
 * Space Complexity: O()
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr= new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int run=0;
        int count=0;
        int c =0;

        quit:
        for(int j=0;j<n;) {

            for (int i = 0; i < arr[j]; i++) {
                    c++;
                    run++;
                    if(run >= n) {
                        count++;  // before exit increment count by 1.
                        break quit;
                    }
            }
            count++;
            j = c;
        }

        System.out.println("minSteps: "+count);
    }
}
