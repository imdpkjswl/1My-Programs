/*
Hint:
ASCII Value:
0  --> 48
1  --> 49
2  --> 50
3  --> 51
4  --> 52
5  --> 53
6  --> 54
7  --> 55
8  --> 56
9  --> 57
/*
    Example:
Input1:
3 30 34 5 9
Output1:
9534330

Input2:
54 546 548 60
Output2:
6054854654
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter the size of array:");
        n=in.nextInt();
        String []arr = new String[n];

        for(i=0;i<n;i++)
            arr[i]= in.next();



    }
}
