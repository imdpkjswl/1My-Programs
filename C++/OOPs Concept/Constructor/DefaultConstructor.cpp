#include<bits/stdc++.h>
/*
A constructor which has no argument is known as default 
constructor. It is invoked at the time of creating object.
*/
using namespace std;

// Whenever object is created the default constructor called by compiler.
class Employee
{
    public:
        Employee()
        {
            cout<<"Default constructor invoked."<<endl;
        }
};

int main()
{
    Employee e1;
    Employee e2;

    return 0;    
}