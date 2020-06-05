
#include <iostream>
using namespace std;

int fact(int n)
{
    if(n == 1)
    return 1;
    
    return n*fact(n-1);
}


int main()
{
    int n;
    
    cout<<"Enter a number: "<<endl;
    cin>>n;
    int res = fact(n);
    
    cout<<"Factorial of "<<n<<" is:  "<<res;
    
    return 0;
}
