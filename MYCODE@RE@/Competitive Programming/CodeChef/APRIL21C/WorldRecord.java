/*
// THE ORIGINAL ANSWER FOR THIS PROBLEM IS GIVEN BELOW:
#include <iostream>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t-- > 0){
	    float k1, k2, k3, v;
	    cin>>k1>>k2>>k3>>v;
	    
	    float tmp = 100.00/(k1*k2*k3*v);
	    float target = 9.575;
	    if(tmp >= target){
	        cout<<"NO"<<endl;
	    }else{
	        cout<<"YES"<<endl;
	    }
	}
	return 0;
}
*/
 


import java.text.DecimalFormat;
import java.util.*;
import java.lang.*;
// THIS SOLUTION IS THROWING TIME LIMIT EXCEEDED ERROR.

class WorldRecord {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = 0;if (in.hasNextInt()) {T = in.nextInt();}

        for(int i=0;i<T;i++) {
            float k1 = 0, k2 = 0, k3 = 0, v = 0;
            if (in.hasNextFloat()) {
                k1 = in.nextFloat();
            }
            if (in.hasNextFloat()) {
                k2 = in.nextFloat();
            }
            if (in.hasNextFloat()) {
                k3 = in.nextFloat();
            }
            if (in.hasNextFloat()) {
                v = in.nextFloat();
            }
/*
            //if you want to round up to 2 decimal places,then use
            String num = String.format("%.2f", 9.546); //OR USE BELOW ONE
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println(Double.valueOf(df.format(9.546)));

 */
            DecimalFormat df = new DecimalFormat("#.###");
            DecimalFormat tf = new DecimalFormat("#.##");
            float totalSpeed = k1 * k2 * k3 * v;
            float dr = Float.parseFloat(df.format(totalSpeed));
            //System.out.println(dr);


            float res = 100f / dr;
            String ans = tf.format(res);

            if(ans.equals("9.58")){
                System.out.println("NO");
            }else if(Float.compare(res,9.58f) < 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

}
