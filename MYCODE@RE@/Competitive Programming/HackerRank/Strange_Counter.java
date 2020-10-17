/*
import java.util.Scanner;

// 4/9 failed due to time limit exceeded BUT program giving the correct output:(
public class Strange_Counter{
    public static void main(String[] args) {
        long t;
        t = new Scanner(System.in).nextLong();


        // Handling first cycle manually
        if(t <= 3){
            if(t == 3)
                System.out.println("1");
            else if( t == 2)
                System.out.println("2");
            else if(t == 1)
                System.out.println("3");
            return;
        }

        long cycle = 3;
        long temp =3;
        long i=2;

        long range1, range2;
        while(true){
            range1 = cycle; // t must be greater than range1.

            temp = 2*temp;
            cycle += temp;

            range2 = cycle; // t must be lesser than or equal to range2.

            //System.out.print(temp +"  ---->  ");
            //System.out.println(cycle);

            if(t > range1 && t <= range2){
                //System.out.println(i);
                break;
            }

            ++i;
        }

        range1 = range1+1;
        long dec = temp;
        //System.out.println(range1);
        //System.out.println(range2);
        //System.out.println(temp);

        for(long j= range1;j<t;j++){
            dec--;
        }

        System.out.println(dec);

    }
}
*/


// Full working program 
import java.io.*;
import java.util.*;
import java.text.*; 
import java.math.*; 
import java.util.regex.*;

public class Strange_Counter {
    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

	    long t = in.nextLong();
	    long d = 3;
	    long ans = 0;
	    
	    while(true){
	        if(t<=d){
	            ans = d+1-t;
	            break;
	        }
	        else{
	            t-=d;
	            d  =  2*d;
	        }
	    }
	    
	    System.out.println(ans);
	}
}