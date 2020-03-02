#include<iostream>

using namespace std;

class MyClass{

    public : 
            MyClass();

};

MyClass :: MyClass()
{
    cout<<"I'm a Constructor"<<endl;
}

int main()
{
    MyClass object;
}