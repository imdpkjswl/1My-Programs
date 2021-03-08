import java.math.*;
import java.util.*;
import java.lang.*;

// Getting TLE Error
class Interesting_XOR {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = 0;if (in.hasNextInt()) {T = in.nextInt();}

        for(int t=1;t<=T;t++){
        long C = in.nextLong();

        int d = 0;
        while(C >= Math.pow(2,++d)){}
        //System.out.println(d);
        long n = (int)Math.pow(2,d);

    	long max=0;
    	for(long a=n-1;a>=1;a--){
    		for(long b=a;b<n;b++){
    			long xor = a^b;
    			if(xor == C){
    				max = Math.max(a*b, max);
    				//System.out.println(a+"   "+b);
    			}
    		}
    	}
    	System.out.println(max);
        }

    }
}

