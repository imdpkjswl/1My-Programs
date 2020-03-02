#include<iostream>
#include<conio.h>

using namespace std;

int main()
{
    int n,num,cmp,i,k,first;
    int temp=10,m;


    for(num=2518;num<=2525;num++)
    {
        n= num;
        cmp= num; // For comparison
        for(i=1;i<=10;i++) // To check it's divisibility
        {
            m=i;
            first =(int)n/i;
            //cout<<endl<<n<<endl;
            n = first*i;

            if(cmp != n)
            {
               i=1;
               num = num+1;
            }
        }
        if(temp == m)
        {
            cout<<endl<<cmp<<endl;
            return 0;
        }
    }

    return 0;
}
