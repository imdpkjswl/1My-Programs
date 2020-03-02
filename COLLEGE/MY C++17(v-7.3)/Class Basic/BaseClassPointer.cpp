#include<iostream>

using namespace std;

class base
{
    public:

        void fun1()
        {
            cout<<"Fun1 of base class"<<endl;
        }

};

class derived : public base
{
    public:

        void fun2()
        {
            cout<<"Fun2 of base class"<<endl;
        }

};


int main()
{

    derived d;
    base *ptr = &d;

    ptr->fun1(); /// Access only base class method.
    /// ptr->fun2(); fun2() is not member of base class


    return 0;
}
