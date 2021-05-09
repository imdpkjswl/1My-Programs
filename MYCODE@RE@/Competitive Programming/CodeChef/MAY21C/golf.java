import java.util.*;
import java.lang.*;

class golf {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int T = 0;if (in.hasNextInt()) {T = in.nextInt();}

       while(T-->0){
           int n = 0;if (in.hasNextInt()) {n = in.nextInt();}
           int x = 0;if (in.hasNextInt()) {x = in.nextInt();}
           int k = 0;if (in.hasNextInt()) {k = in.nextInt();}

           if(x%k==0 || (n+1-x)%k==0){
               System.out.println("YES");
           }else{
               System.out.println("NO");
           }



        }
    }

}

/*
#include <bits/stdc++.h>
using namespace std;


int main() {

	int t;
	cin>>t;
	while(t--){
	    int n,x,k;
	    cin>>n>>x>>k;
	    if(x%k==0 || (n+1-x)%k==0){
	        cout<<"YES"<<endl;
	    }else{
	        cout<<"NO"<<endl;
	    }
	}
	return 0;
}

 */


