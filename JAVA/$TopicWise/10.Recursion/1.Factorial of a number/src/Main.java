// Program to find fact of a number

import java.util.*;
public class Main {

    public  static int fact(int n){
        if(n==1)
            return 1;

        return n*fact(n-1);
    }

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = in.nextInt();

        int result = fact(n);
        System.out.println(result);
    }
}
