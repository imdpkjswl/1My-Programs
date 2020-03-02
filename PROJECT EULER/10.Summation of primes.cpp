/*
Problem 10:
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
*/

#include<iostream>

using namespace std;

int main()
{
    long int i,j,n,sum=0;

    cout<<"Enter the number till which you want prime numbers\n";
    cin>>n;

    cout<<"Prime numbers are:-\n";
    for(i=1;i<=n+1;i++) /// Below 2 million
    {
        int c=0;
        for(j=1;j<=i;j++)
        {
            if(i%j==0)
            {
                c++;
            }
        }

       if(c==2)
        {
            cout<<i<<" ";
            sum+=i;
        }
    }

    cout<<"Sum of primes are :  "<<sum;

    return 0;
}
