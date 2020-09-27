import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Manasa_and_Stones {

    // Complete the stones function below.
    static ArrayList<Integer> stones(int n, int a, int b) {
        if( a > b){
            a ^= b;
            b ^= a;
            a ^= b;
        }
        // Take set to eliminate duplicates
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(i*a +(n-i-1)*b);
        }
        
        // convert Set into array
        ArrayList<Integer> result = new ArrayList<Integer>(set);
        Collections.sort(result); // as question said.
        return result; 
    }

    public static void main(String[] args) throws IOException {
            
            int n = 4;
            int a = 10;
            int b = 100;

            ArrayList<Integer> result = stones(n, a, b);
            for(int i=0;i<result.size();i++)
                System.out.print(result.get(i)+" ");

       
    }
}


/*
Input:
n = 4
a = 10
b = 100

Output:
30 120 210 300

Solution:
--> Follow the pattern:
(300-100)+10 = 210
(210-100)+10 = 120
(120-100)+10 = 30
*/