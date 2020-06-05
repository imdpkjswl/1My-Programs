
#include <iostream>
using namespace std;
void isprime(int n)
{
    if(n == 1)
        return;
        
    for(int i=2;i<n;i++)
    {
        if(n%i == 0)
            return;
    }
    
    cout<<n<<" ";
    
}

int main()
{
    int start,end;
    
    cout<<"Enter starting number: "<<endl;
    cin>>start;
    cout<<"Enter ending number: "<<endl;
    cin>>end;
    for(int i=start;i<=end;i++)
    {
        isprime(i);
    }
    
    
    return 0;
}
