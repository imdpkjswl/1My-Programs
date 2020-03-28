/*
    Given two arrays X[] and Y[] of positive integers,find number of pairs such that x^y > y^x
    where x is an element from X[] and y is an element from Y[].

Input: X[] = {2, 1, 6}, Y = {1, 5}
Output: 3
Explanation: There are total 3 pairs where pow(x, y) is greater
than pow(y, x) Pairs are (2, 1), (2, 5) and (6, 1)


Input: X[] = {10, 19, 18}, Y[] = {11, 15, 9}
Output: 2
Explanation: There are total 2 pairs where pow(x, y) is greater
than pow(y, x) Pairs are (10, 11) and (10, 15)
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n,m,i,j,count=0;
        int [] a1 = new int[50];
        int [] a2 = new int[50];

        System.out.println("Enter the size of first array:");
        n= in.nextInt();
        for(i=0;i<n;i++)
            a1[i] = in.nextInt();

        System.out.println("Enter the size of second array:");
        m= in.nextInt();
        for(i=0;i<m;i++)
            a2[i] = in.nextInt();


        for(i=0;i<n;i++) {
            for(j=0;j<m;j++) {
                if(Math.pow(a1[i],a2[j]) > Math.pow(a2[j],a1[i])) {
                    System.out.println("("+a1[i]+","+a2[j]+")");
                    count++;
                }
            }
        }

        System.out.println("Total pairs:  "+count);

    }
}
