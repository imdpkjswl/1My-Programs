package com.iamdj;
import java.util.Scanner;
public class Loop {

    public static void main(String[] args) {
        int x,n;
        x=1;
        System.out.println("Enter last term to print counting");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        while(x<=n)
        {
            System.out.println("Number : "+x);
            x++;
        }


    }
}
