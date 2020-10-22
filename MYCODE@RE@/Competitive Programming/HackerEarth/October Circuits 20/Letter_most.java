/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

import java.util.*;

// 100% Working
class Letter_most {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        char[] chr = s.toCharArray(); 
        int[] table = new int[123];
        Arrays.fill(table, 0);

        for(int i=0;i<n;i++){
        	table[(int)chr[i]]++;
        }

        int result = Integer.MIN_VALUE;
        for(int i: table){
        	if(result <=i){
        		result = i;
        	}
        }

        System.out.println(result);
         

    }
}
