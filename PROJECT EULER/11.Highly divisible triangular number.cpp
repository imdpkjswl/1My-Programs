#include<iostream>
#include<cstdlib>

using namespace std;

int main()
{
    int i,j,sum;

    j=0;
    for(i=0;i<501;i++)
    {
        j++;
        sum = i+j;
        j = i+j;
        cout<<sum<<" ";
    }
}
