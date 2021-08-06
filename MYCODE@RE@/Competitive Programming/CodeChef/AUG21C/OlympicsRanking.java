import java.io.*;
import java.util.*;

class OlympicsRanking {
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while(T-->0){
            int G1, S1, B1;
            int G2, S2, B2;

            String str = br.readLine(); // read whole line
            String[] s = str.split(" "); // separate line by space

            G1=Integer.parseInt(s[0]);
            S1=Integer.parseInt(s[1]);
            B1=Integer.parseInt(s[2]);

            G2=Integer.parseInt(s[3]);
            S2=Integer.parseInt(s[4]);
            B2=Integer.parseInt(s[5]);

            long c1 = G1+S1+B1;
            long c2 = G2+S2+B2;

            if(c1>c2){
                System.out.println("1");
            }else{
                System.out.println("2");
            }

        }


    }
}
