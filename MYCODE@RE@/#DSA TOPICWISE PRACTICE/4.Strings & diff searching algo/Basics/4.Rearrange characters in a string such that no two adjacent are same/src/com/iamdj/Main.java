package com.iamdj;

/* NOTE: THIS PROGRAM NOT WORKING FOR LARGE NUMBER OF CHARACTER.
public class Main {

    public static void main(String[] args) {

        // Given string to convert character array
        String str = "bbaayuwhvhabdjhiuwhebjabsdj";
        char[] stringToCharArray = str.toCharArray();
        int n = stringToCharArray.length;
        char[] ans = new char[stringToCharArray.length];

        // Sorting given character array using bubble sort
        for (int  j = 1; j < n; j++) {
            for(int i = 0; i < n - j; i++) {

                if((int)stringToCharArray[i] > (int)stringToCharArray[i+1]){
                    char temp;
                    temp = stringToCharArray[i];
                    stringToCharArray[i] = stringToCharArray[i+1];
                    stringToCharArray[i+1] = temp;
                }

            }
        }
        // Print sorted array
        System.out.println(stringToCharArray);
// WE CAN ALSO SORT String USING BUILT-IN METHOD.
//        char[] chArray = str.toCharArray();
//        Arrays.sort(chArray);

        int i = 0;
        int j = stringToCharArray.length-1;

        int k = 0;
        while(i <= j) {  // Termination condition

            ans[k++] = stringToCharArray[i++]; // Append left side character to ans.
            if(i<=j)
                ans[k++] = stringToCharArray[j--]; // Append right side character to ans.

            if(k > 1 && ans[k-1] == ans[k-2]) {  // Condition to check for adjacent character same or not.
                System.out.println("Not possible");
                break;
            }
        }
        // Print Character array
        System.out.println(ans);

    }
}
*/

// Note: NOT WORKING FOR TOO MANY REPEATED LETTERS AND ALSO NOT WORK IF REPEATED LETTER AT LAST OF STRING.
import java.util.Arrays;

class Main {
    public static void main(String[]  args) {
        // Given string to convert character array
        String str = "aaaabbccdde";
        char[] chr = str.toCharArray();
        int n = chr.length;
        char[] ans = new char[n];


        int k=0;
        ans[k++] = chr[0];  // Assign first character coz for checking adjacent same or not.
        for(int i=1;i<n;i++) {
            for(int j=1;j<n;j++) {
               if(chr[j]!= '$' && chr[j] != ans[k-1]) {
                   ans[k++] = chr[j]; // Assign chr without same adjacent element
                   chr[j] = '$'; // Mark assigned element visited
                   break;
               }
            }
        }
        if(k == chr.length){
            System.out.println("The rearrangement of string:");
            System.out.println(Arrays.toString(ans));
        }
        else
            System.out.println("Not possible");



    }
}