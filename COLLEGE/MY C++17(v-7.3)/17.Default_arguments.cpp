#include<iostream>

using namespace std;


// NOTE : we can start making argument default from right to left and in main fun we able to pass either two arguments or three arguments.
int add(int x,int y,int z=0)
{
    return (x+y+z);
}

int main()
{
    int sum;

    sum = add(2,8,5);
    cout<<sum<<endl;

    sum = add(2,4);
    cout<<sum<<endl;

    sum = add(3,9,0);
    cout<<sum<<endl;

    return 0;
}
