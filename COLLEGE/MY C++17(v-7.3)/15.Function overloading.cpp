#include<iostream>

using namespace std;

int add(int x,int y)
{
    return (x+y);
}

int add(int x,int y,int z)
{
    return (x+y+z);
}

int main()
{
    int ch,a,b,c,sum;

    cout<<"1.Add two number"<<endl;
    cout<<"2.Add three number"<<endl;
    cout<<"Enter your choice"<<endl;
    cin>>ch;

    if(ch == 1)
    {
        cout<<"Enter two number"<<endl;
        cin>>a>>b;
        sum = add(a,b);
        cout<<"The sum of "<<a<<" and "<<b<<" is : "<<sum<<endl;
    }
    else if(ch == 2)
    {
        cout<<"Enter three number"<<endl;
        cin>>a>>b>>c;
        sum = add(a,b,c);
        cout<<"The sum of "<<a<<","<<b<<" and "<<c<<" is : "<<sum<<endl;
    }
    else
    {
        cout<<"Invalid option chosen"<<endl;
        return 0;
    }
}
