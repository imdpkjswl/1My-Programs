// Hybrid inheritance is a combination of more than one type of inheritance
// eg: single+multiple = Hybrid etc.

#include <iostream>
using namespace std;

/// Example Logic of inheritance : A -> B  &&  A -> C  ,  then   B,C -> D
class A
{
    protected:
        int a;

    public:
        void get_a()
        {
           cout << "Enter the value of a : " << endl;
           cin>>a;
        }
};


class B : public A
{
    protected:
        int b;

    public:
        void get_b()
        {
            cout << "Enter the value of b : " << endl;
           cin>>b;
        }
};


class C
{
    protected:
        int c;

    public:
        void get_c()
        {
            cout << "Enter the value of c : " << endl;
            cin>>c;
        }
};

class D : public B, public C
{
    protected:
        int d;

    public:
        void sum()
        {
             get_a();
             get_b();
             get_c();
             cout << "Sum of a,b and c is : " <<a+b+c<< endl;
        }
};


int main()
{
        D d;
        d.sum();
        return 0;
}
