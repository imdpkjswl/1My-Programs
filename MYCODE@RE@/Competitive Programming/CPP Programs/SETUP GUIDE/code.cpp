#define INPUT_OUTPUT { \
	freopen("input.txt", "r", stdin); \
	freopen("output.txt", "w", stdout);\
}
/* OR USE BELOW
  #ifndef ONLINE_JUDGE
	   freopen("input.txt", "r", stdin);
	   freopen("output.txt", "w", stdout);
    #endif  */


#include<bits/stdc++.h>
using namespace std;

int main()
{

	INPUT_OUTPUT;

	int a, b, sum;

	cout << "Enter two number:" << endl;
	cin >> a >> b;
	sum = a + b;
	cout << "sum is: " << sum << endl;


	return 0;
}
