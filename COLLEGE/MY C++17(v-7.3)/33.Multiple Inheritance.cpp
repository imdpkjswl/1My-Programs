/*
C++ Multiple Inheritance:

Multiple inheritance is the process of deriving a new class that inherits the attributes from two or more classes.
SYNTAX:
    class Derived : visibility B-1, visibility B-2,...visibility B - n
    {
        // Body of the class;
    }
*/

#include<iostream>
using namespace std;

class A
{
    protected:
         int x;

    public:
        void get_x(int n)
        {
            x = n;
        }
};


class B
{
    protected:
        int y;

    public:
        void get_y(int n)
        {
            y = n;
        }
};


class C : public A,public B
{
    public:
        void display()
        {
            cout << "The value of a is : " <<x<< endl;
            cout << "The value of b is : " <<y<< endl;
            cout<<"Addition of a and b is : "<<x+y;
        }
};


int main()
{

       C c;
       int a,b;
       cout<<"Enter a number :"<<endl;
       cin>>a;
       cout<<"Enter another number :"<<endl;
       cin>>b;

       c.get_x(a);
       c.get_y(b);

       c.display();

return 0;
}
