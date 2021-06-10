import java.io.*;

class Bitwise_Tuples {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long mod = 100000007;
        //int t = Integer.parseInt(br.readLine());
        //while(t-->0){}

        String s = br.readLine();

        String[] s1 = s.split(" ");
        long n, m;
        n=Integer.parseInt(s1[0]);
        m=Integer.parseInt(s1[1]);

        System.out.println((long)Math.pow((Math.pow(m,n)-1), m) % mod);

    }
}