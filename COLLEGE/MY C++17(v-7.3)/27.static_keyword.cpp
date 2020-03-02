#include<iostream>
using namespace std;


class account
{
    private:
        int balance; /// Instance variable
        static float rate; /// Static member variable or class variable

    public:
        void setBalance(int b)
        {
            balance = b;
        }

        static void setRate(float r) /// static member function,It can be call without or with object of the account class BY Scope Resolution operator.
        {
            rate = r;
        }


        void display()
        {
            cout<<"Balance : "<<balance<<endl<<"Rate : "<<rate<<endl;
        }
};

float account::rate; /// Definition of static member

int main()
{
    account obj; // here , obj is a object of account class.

    obj.setBalance(100);

    account::setRate(7.5f); /// Call without object
    obj.setRate(8.5f);      /// Call with object

    obj.display();

    return 0;
}
