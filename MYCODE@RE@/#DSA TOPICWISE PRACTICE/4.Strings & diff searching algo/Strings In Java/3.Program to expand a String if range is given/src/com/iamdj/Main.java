package com.iamdj;

/*
// My program is working for only one digits.
public class Main {

    public static void main(String[] args) {

        String str = "1-5 2 1-4 8 2 2-9";
        char[] chr = str.toCharArray();
        int n = chr.length;
        char[] ans = new char[n*n];

        int k =0;
        for(int i=1;i<n;i++){

            if(chr[i] == '-') {
                int t1 = (int)chr[i-1];
                int t2 = (int)chr[i+1];
                for(int j =t1;j<=t2;j++) {
                    ans[k++] = (char)j;
                }
            }

            if(chr[i-1] == ' ' && chr[i+1] == ' ') {
                ans[k++] = chr[i];
            }
        }

        System.out.println(ans);
    }
}
*/

public class Main {

    public static void expandString(String word) {

        StringBuilder sb = new StringBuilder();

        // Get all intervals
        String[] strArr = word.split(", ");

        // Traverse through every interval
        for (int i = 0; i < strArr.length; i++) {

            // Get lower and upper
            String[] a = strArr[i].split("-");

            if (a.length == 2) {

                int low = Integer.parseInt(a[0]);
                int high = Integer.parseInt(a[a.length - 1]);

                // Append all numbers
                while (low <= high) {
                    sb.append(low + " ");
                    low++;
                }
            }
            else
                {
                    sb.append(strArr[i] + " ");
                }
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {

        String str = "1-5, 8, 11-14, 18, 20, 26-29";
        expandString(str);
    }
}