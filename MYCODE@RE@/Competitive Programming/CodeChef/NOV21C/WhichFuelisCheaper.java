import java.util.*;
import java.io.*;

class WhichFuelisCheaper {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while(T-->0) {
            int X, Y;
            int A, B;
            int K;

            String s = br.readLine(); // read whole line
            String[] s1 = s.split(" "); // separate line by space

            X = Integer.parseInt(s1[0]);
            Y = Integer.parseInt(s1[1]);
            A = Integer.parseInt(s1[2]);
            B = Integer.parseInt(s1[3]);
            K = Integer.parseInt(s1[4]);

            long res1 = X + A * K;
            long res2 = Y + B * K;
            if(res1<res2){
                System.out.println("PETROL");
            }else if(res2<res1){
                System.out.println("DIESEL");
            }else{
                System.out.println("SAME PRICE");
            }
        }



    }
}

/**
 * 3
 * 1 1 1 1 1
 * SAME PRICE
 * 2 1 2 1 2
 * DIESEL
 * 2 2 1 1 2
 * SAME PRICE
 */