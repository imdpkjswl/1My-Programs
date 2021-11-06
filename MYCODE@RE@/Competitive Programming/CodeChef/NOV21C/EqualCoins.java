import java.util.*;
import java.io.*;

class EqualCoins {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String s = br.readLine(); // read whole line
            String[] s1 = s.split(" "); // separate line by space

            long X = Integer.parseInt(s1[0]); // Distribution depends on X value whether X is ODD or EVEN
            long Y = Integer.parseInt(s1[1]); // Will be always EVEN


            if((X%2)==0){
                if(X==0 && Y%2!=0){ // Handling special case, When X=0 and Y = Odd
                    System.out.println("NO");
                }else{
                System.out.println("YES");
                }
            }else{
                System.out.println("NO");
            }

        }

    }
}