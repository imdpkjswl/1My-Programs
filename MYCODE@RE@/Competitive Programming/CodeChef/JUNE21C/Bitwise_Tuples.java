import java.io.*;
/*
Solution:
Ans = (M^N - 1)^M % mod
*/
class Bitwise_Tuples {

    /* // Function of Modular Expoentiation
    private static long fastPower(long a, long b, long mod){
        long res = 1;

        while(b>0){
            if((b&1)!=0){ // for odd
                res = (res * a %mod) % mod;//res = (res%mod * a%mod) % mod;
            }

            a = (a%mod *a%mod) % mod;
            b = b>>1;    //b = b/2;
        }

        return res;
    }
    */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long mod = 1000000007;
        int t = Integer.parseInt(br.readLine());
        while(t-->0){

            String s = br.readLine();

            String[] s1 = s.split(" ");
            int n, m;
            n=Integer.parseInt(s1[0]);
            m=Integer.parseInt(s1[1]);
/*
            // Finding 2^N using Preserving method BUT SHOWING TLE.
            long[] arr = new long[1000002]; // 10^6
            arr[1] = 2;
            for(int i=2;i<1000002;i++){
                arr[i] = (2*arr[i-1]) % mod;
            }
*/          
            // Finding 2^N using Modular method[FOR THIS CODE REFER ANUJ BHAIYA VIDEO]
            long a = 2;
            int b = n;
            long temp = 1;
            while(b>0){
                if((b&1)!=0){
                    temp = (temp * a%mod) % mod;
                }

                a = (a%mod *a%mod) % mod;
                b = b >> 1;
            }


            long x = temp-1; //arr[n]-1;
            int y = m;
            // Finding x^y using Modular method
            long tmp = 1;
            while(y>0){
                if((y&1)!=0){
                    tmp = (tmp * x%mod) % mod;
                }

                x = (x%mod *x%mod) % mod;
                y = y >> 1;
            }
            
            System.out.println(tmp);
          
        }
    }
}