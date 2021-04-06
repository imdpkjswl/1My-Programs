import java.util.*;
/*
// Got partial output, FOR CORRECT OUTPUT SEE THE BELOW CODE
public class Equal_elements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while(t-->0) {
            int N = in.nextInt();
            int[] a = new int[N];
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                a[i] = in.nextInt();
                max = Math.max(max, a[i]);
            }

            for (int i = 0; i < N; i++) {
                int tmp = a[i];
                while (tmp <= max) {
                    a[i] = tmp;
                    tmp += 2;
                }
            }

            int minCoin = 0;
            for (int val : a) {
                minCoin += Math.abs(max - val);
            }

            System.out.println(minCoin);
        }
    }
}

*/


import java.util.*;

public class Equal_elements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while(t-->0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            int noOfEven = 0;
            int noOfOdd = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                if (arr[i] % 2 == 0) {
                    noOfEven++;
                } else {
                    noOfOdd++;
                }
            }
       	    
	    //System.out.println(noOfEven);
            //System.out.println(noOfOdd);

            int min = Math.min(noOfEven, noOfOdd);
            System.out.println(min);
        }


    }
}
