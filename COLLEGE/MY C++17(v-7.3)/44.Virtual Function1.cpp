#include<iostream>
using namespace std;

/// virtual is used to tell compiler for late binding.

class A
{

    public :
        virtual void f1()
        {
            cout<<"Parent class method called"<<endl;
        }
};

class B : public A
{
    public :
        void f1()  /// Overriding
        {
            cout<<"Child class method called"<<endl;
        }
};


int main()
{
    /// Base class pointer can point to the object of any of its descendant class,
   ///  Note: its converse is not true.
   /// Point wali baat: base class ka pointer child class ke object ko point kar sakta hai but child base ko nhi kar sakta hai.
  // For example:
    A *p, obj1;
    B obj2;

    p = &obj2;

    p->f1();
}
