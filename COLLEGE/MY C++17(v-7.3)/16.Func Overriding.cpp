#include<iostream>

///Overriding:When the same function is written in derived class after inherit from base class with same modification.
using namespace std;

class parent
{
    public:

        void display()
        {
            cout<<"--> Display of parent.\n"<<endl;
        }
};

class child : public parent
{
    public:

        void display()
        {
            cout<<"--> Display of child."<<endl;
        }

};


int main()
{
    parent p;
    p.display();

    child c;
    c.display();

    return 0;
}
