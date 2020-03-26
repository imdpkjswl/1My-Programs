/*
    INPUT:
    price[] = { 100, 180, 260, 310, 40, 535, 695 };

    OUTPUT:
    Buy on day : 0   Sell on day: 3
    Buy on day : 4   Sell on day: 6

 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        int i,j,n,count=0;
        int []arr = new int[50];
        System.out.println("Enter the size of array:");
        n=in.nextInt();

        for(i=0;i<n;i++)
            arr[i] = in.nextInt();

        for(i=0;i<n;i++) {
            for(j=i+1;j<n;j++) {
                if(arr[i] <= arr[j]) {
                    count++; // counter is used for last items
                    if(count == n) {
                        System.out.println("Buy on day "+i+" at "+arr[i]+"  ==>  Sell on day "+j+ " at "+arr[j]);
                    }
                }else
                {
                    System.out.println("Buy on day "+i+" at "+arr[i]+"  ==>  Sell on day "+j+ " at "+arr[j-1]);
                    i = count; // counter is used, if any stock successfully buy and sell.
                }

            }
        }
    }
}
