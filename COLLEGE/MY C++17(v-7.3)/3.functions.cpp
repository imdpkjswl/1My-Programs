#include<iostream>

using namespace std;


int add(int x,int y)
{
    int sum;

    sum = x+y;

    return sum;
}


void display(int x,int y)
{
    cout<<"Sum is : "<<add(x,y)<<endl;
}
int main()
{

        int a,b;
        cout<<"Enter two number"<<endl;
        cin>>a>>b;

        display(a,b);

        return 0;
}
