/// If a class having pure virtual function,then that class is called as Abstract class.

#include<iostream>

using namespace std;
// A do nothing function is called pure virtual function.
class base
{
    public:

        void fun1() /// Concrete function:have own body.
        {
            cout<<"This is base class fun1"<<endl;
        }

        virtual void fun2() = 0; /// PURE VIRTUAL FUNCTION.
};


class derived : public base
{
    public:

        void fun2()
        {
            cout<<"This is derived class fun2"<<endl;
        }

};

int main()
{
    base *ptr;
    ptr = new derived();
    ptr->fun2();
    /// the below run,bcuz the same function is not present in derived class.
    ptr->fun1();

    cout<<endl<<endl<<endl;

    derived d;
    d.fun1();
    d.fun2();

    return 0;
}
