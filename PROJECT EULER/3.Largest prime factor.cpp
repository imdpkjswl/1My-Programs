#include<iostream>
#include<cstdlib>
#include<cmath>

using namespace std;

int main()
{
    int i,n=13195,flag,j;

    for(i=sqrt(n);i>=1;i--)
    {
        if(n%i ==0)
        {
            flag=0;
            for(j=sqrt(i);j>=1;j--)
            {
                if(i%j==0)
                    flag=1;

            }

        }

        if(flag!=1)
            {
                cout<<i<<" ";
                break;
            }
    }

    return 0;
}










//600851475143
/* NOT WORKING FOR BIG NUMBER
int prime(int num)
{
    int i;

    for (i = 2; i <= num; i++)
    {
        if (num % i == 0)
        {
                num /= i;
                i--;
        }
    }

    return i;
}


int main()
{
    int num,res;
    cout<<"Enter number to find largest prime factor"<<endl;
    cin>>num;

    res = prime(num);

    cout<<"Largest prime factor :  "<<res<<endl;

    return 0;
}

*/
