#include<cstdio>
#include<iostream>

using namespace std;

class car
{
    public:
        static int price;

        static int getprice()
        {
            return price;
        }

};

int car::price = 30;

int main()
{
    cout<<"Car price : "<<car::getprice()<<endl; /// Accessing static data member without creating object of class BY SCOPE RESOLUTION OPERATOR.

    car c;
    cout<<"Car price : "<<c.getprice()<<endl; // Accessing static data member with creating object of class.


    return 0;
}
