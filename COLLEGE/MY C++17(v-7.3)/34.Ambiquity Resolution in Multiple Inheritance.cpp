#include <iostream>
#include<conio.h>
using namespace std;

class A
{
    public:
        void display()
        {
            cout << "Class A" << endl;
        }
};

class B
{
    public:
        void display()
        {
            cout << "Class B" << endl;
        }
};

class C : public A, public B
{
    public:
    void view()
        {
            /// Ambiguity issue can be resolved by using the class resolution operator with the function.
            A::display(); /// calling display() fun of class A.
            B::display(); /// calling display() fun of class B.
        }
};


int main()
{
        cout<<"Called by base class A"<<endl;
        A a;
        a.display();   // Calling the display() function of A class.
        a.A :: display();  // Calling the display() function defined in A class.
        cout<<endl;

        cout<<"Called by base class B"<<endl;
        B b;
        b.display();               // Calling the display() function of B class.
        b.B :: display();       // Calling the display() function defined in B class.
        cout<<endl;
        /*The function of the derived class overrides the method of the base class. Therefore,
        call to the display() function will simply call the function defined in the derived class.
        If we want to invoke the base class function, we can use the class resolution operator.  */

        cout<<"Called by derived class C"<<endl;
        C c;
        c.view();


        getch();
        return 0;
}
