// This program is only works on c++ 17

#include<bits/stdc++.h>

#define ll long long int

using namespace std;

int main()
{
	ll t, n;
	cin>>t;
	
	while(t--)
	{
		cin>>n;
		ll ansoflcm = 1;
		for(ll i=1;i<=n;i++)
		{
			ansoflcm = lcm(ansoflcm,i);
		}
		
		cout<<(n*(n+1))/2<<" "<<ansoflcm<<endl;
	}

	return 0;
}