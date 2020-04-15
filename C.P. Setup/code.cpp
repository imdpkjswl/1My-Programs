#include<bits/stdc++.h>
#define INPUT_OUTPUT { \
	freopen("input.txt", "r", stdin); \
	freopen("output.txt", "w", stdout);\
}
/*  #ifndef ONLINE_JUDGE
	   freopen("input.txt", "r", stdin);
	   freopen("output.txt", "w", stdout);
    #endif  */  

/*
You are given two positive integers a and b. In one move you can increase a by 1 (replace a with a+1). 
Your task is to find the minimum number of moves you need to do in order to make a divisible by b. 
It is possible, that you have to make 0 moves, as a is already divisible by b. You have to answer
t independent test cases.

Example:
inputCopy
5
10 4
13 9
100 13
123 456
92 46

outputCopy
2
5
4
333
0
*/

#include<bits/stdc++.h>
using namespace std;

int main()
{

	INPUT_OUTPUT;

	int n,a, b,count=0;
	 cin>>n;

	 for(int j=1;j<=n;j++) {
	 	count=0;
	 	cin>>a>>b;
	 	while(1) {
	 
	 		if((a % b) == 0) {
	 			cout<<count<<endl;
	 			count = 0;
	 			break;
	 		}
	 		a++;
	 		count++;
	 	}
	} 	
	 
	return 0;
}





