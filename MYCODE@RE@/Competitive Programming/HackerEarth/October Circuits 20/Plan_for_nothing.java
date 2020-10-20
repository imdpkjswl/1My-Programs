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

class Plan_for_nothing {
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
        HashSet<Integer> s = new HashSet<>();

        int n = in.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n+1;j++){
                s.add(in.nextInt());
            }
        }

        // finding minimum element
       int min = (int)Collections.min(s);
      // finding maximum element
      int max = (int)Collections.max(s);

      for(int i=min;i<=max;i++){
        if(!s.contains(i)){
            System.out.println(i);
            break;
        }
      }
    }
}
