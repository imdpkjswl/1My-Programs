#include<iostream>

using namespace std;

class MyClass{

    public : 
            MyClass();   // Constructor Member Function.
            ~ MyClass(); // Destructor  Member Function.

};

MyClass :: MyClass()  // Body of Constructor.
{
    cout<<"I'm a Constructor."<<endl;
}
MyClass :: ~ MyClass() // Body of Destructor To vanish the constructor.
{
    cout<<"I'm a Destructor."<<endl;
}

int main()
{
    MyClass object;
}