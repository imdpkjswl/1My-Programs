import java.io.*;
import java.util.*;

class Bella_ciao {
    public static void main(String[] args) throws Exception {
      
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
     
        int T = Integer.parseInt(br.readLine());
        
        while(T-->0){
            int D, d;
            int P, Q;
            
            String s = br.readLine(); // read whole line
            String[] s1 = s.split(" "); // separate line by space
        
            D=Integer.parseInt(s1[0]);
            d=Integer.parseInt(s1[1]);
            P=Integer.parseInt(s1[2]);
            Q=Integer.parseInt(s1[3]);
            

            long n = D/d;
            long sum=0;
            
            sum = d * (P*n + Q*( (n-1)*(n)/2 ) );
                
                if(D%d==0)
                {
                    System.out.println(sum);
                }
                else
                {
                    sum = d * (P*n + Q*( (n-1)*(n)/2 ) );
                    sum = sum + D%d*(P + n*Q);
                    System.out.println(sum);
                }
                            
            }
        
        
    }
}
