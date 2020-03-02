#include<iostream>

using namespace std;

int main()
{
    float
    a,b,c;

    cout<<"Enter two number to divide them"<<endl;
    cin>>a>>b;

    try
    {
        if(b==0)
            throw 000;
        c = a/b;
        cout<<a<<" divided by "<<b<<" is : "<<c<<endl;
    } catch(int ex)
        {
            cout<<"Divisible by zero."<<endl<<"Error code : "<<ex<<endl;
        }
}
