#include<stdio.h>
#include<iostream>

using namespace std;
int main()
{
	cout<<"Enter two number"<<endl;
	int n1, n2;
	cin>>n1>>n2;
	int gcd = 0;	
	for(int i=1;i<=n1 && i<=n2;i++){
		if(n1%i==0 && n2%i==0){
			gcd = i;
		}
	}
	
	int lcm = (n1*n2)/gcd;
	cout<<"LCM of "<<n1<<" and "<<n2<<" : "<<lcm<<endl;
	
	return 0;
}