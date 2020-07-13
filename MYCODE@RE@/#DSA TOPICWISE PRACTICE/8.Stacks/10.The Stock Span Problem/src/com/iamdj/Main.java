package com.iamdj;

import java.util.Arrays;

/** My Method:
 * Time complexity: O(n^2)
 * SPace complexity: O(n)
 */
public class Main {

    public static void main(String[] args) {

        int[] arr =  { 10, 4, 5, 90, 120, 80 }; // {100, 80, 60, 70, 60, 75, 85};

        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1);  // fill array with 1 coz first index value not gonna compared.

        int count = 1;
        for (int i= n-1; i>0; i--) {
            for (int j = i-1; j>=0 ; j--) {
                if(arr[i] >= arr[j])  // continuously second element is greater than first one.
                  count++;
                else{
                      ans[i] = count ;  // for handling discrete moment
                    count =1;
                    break;
                }
            }

            // for handling else part, if no discrete point found.
            if(count != 1){
                ans[i] = count;
                count = 1;
            }
        }

        // Print answer
        System.out.println(Arrays.toString(ans));
    }
}
