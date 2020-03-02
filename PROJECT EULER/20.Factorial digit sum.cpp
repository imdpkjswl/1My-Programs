#include<iostream>
#include<cstdlib>

using namespace std;

int main()
{

    int num;
    char a[1000];
    long long int fact=1,res,n;
    long long int s =0,temp;

    cout<<"Not enter any big number:"<<endl;
    cout<<"Enter the value of n:"<<endl;
    cin>>num;

    n = num;
    while(n!=0)
    {
        fact *=n;
        a[] = fact;
        n--;
    }
    res = fact;
    while(res!=0)
    {
        temp = res%10;
        s += temp;
        res = res / 10;
    }

    cout<<num<<"!  =  "<<fact<<endl;
    cout<<"Sum =  "<<s<<endl;

    return 0;
}
