#include<iostream>

using namespace std;

class class1
{
    public :
        void fun()
        {
            cout<<"parent class method called !!!"<<endl;
        }
};

class class2 : public class1
{

    public :
        void fun(int x) // Same function name with argument is called function hiding.
        {
            cout<<"Child class method called !!!"<<endl;
        }
};

int main()
{
    class2 obj;
   /* obj.fun();// error occur ! , This is called method method over hiding
    * Above will through an error ,because already we have method with same name in child class but different argument.
    * So,compiler first see method name "is present in child class or not,then it will look into parent class" ,But here
    * we have method with same name with different argument.So if we not pass any argument then,Compiler will not look into parent class
    * because of still we have method with same name in child class.HENCE IN THIS WAY,WE CAN ABLE TO HIDE THE DATA */
    obj.fun(5);
    return 0;
}

