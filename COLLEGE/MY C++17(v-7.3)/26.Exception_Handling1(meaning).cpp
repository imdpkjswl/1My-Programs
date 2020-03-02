#include<iostream>

using namespace std;

int division(int x,int y)
{
    if(y==0)
        throw 000;

    return x/y;
}

int main()
{
    int a,b,c;

    cout<<"Enter two number"<<endl;
    cin>>a>>b;

    try
    {
        c = division(a,b);
        cout<<a<<" divided by "<<b<<" is : "<<c<<endl;
    }
    catch(int ex)
    {
        cout<<"Error code : "<<ex<<endl;
    }

    return 0;
}
