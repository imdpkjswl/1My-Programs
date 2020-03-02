#include<iostream>
/*
In this prgm,when ptr try to call derived class function by base class pointer and derived class object,but due to base class pointer base function is called,so
to calling derived class function,WE HAVE to use virtual keyword just before base class function name.

*NOTE: The ambiguity arises bcuz ,when we have pointer of one class and object of another class.

*/
using namespace std;

class base
{
    public:

        virtual void fun()
        {
            cout<<"--> Display of Base.\n"<<endl;
        }
};

class derived : public base
{
    public:

        void fun()
        {
            cout<<"--> Display of derived."<<endl;
        }

};


int main()
{

    base *ptr = new derived();
    ptr->fun();
    return 0;

}
