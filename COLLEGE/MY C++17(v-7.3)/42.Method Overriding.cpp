#include<iostream>

using namespace std;

class Car
{
    public :
        void shiftGear()
        {
            cout<<"Car gear got changed(OLD) !!!"<<endl;
        }
};

class SportsCar : public Car
{

    public :
        void shiftGear()
        {
            cout<<"Sports Car gear got changed(NEW) !!!"<<endl;
        }
};

int main()
{

    SportsCar obj;

    obj.shiftGear(); // In c++ ,local method will be called(if exist).

    cout<<"Here,we can see that have created object of child class BUT it only initialize the child class method(Despite of parent class)"<<endl;
    cout<<"So,this type of method is call method overriding"<<endl;
    cout<<"Parent class method will initialize,when parent class object will created."<<endl;
    return 0;
}
