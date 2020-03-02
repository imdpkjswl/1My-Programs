#include <iostream>
#include <string>
#include<conio.h>

using namespace std;

int main()
{
    //Simple Calculator
    // int a,b,c;

    // cout<<"Enter First Number"<<endl;
    // cin>>a;

    // cout<<"Enter Second Number"<<endl;
    // cin>>b;

    // cout<<"Sum is  "<< a + b<<endl;
    // cout<<"Subtraction is  "<< a - b<<endl;
    // cout<<"Multiplication is  "<< a * b<<endl;
    // if(b==0)
    // cout<<"Denominator is Zero"<<endl;
    // else
    // cout<<"Division is "<< a / (float) b<<endl;

    //2D Array Example

    // int arr2d[2][3] = {
    //                     {1,2,3},
    //                     {4,5,6}
    // };//Row and Column

    // for(int i=0; i<2; i++)//For Row
    // {
    //     for(int j=0;j<3;j++)//For Column
    //     {
    //         cout<<"The Value at"<<i<<","<<j<<" is "<<arr2d[i][j]<<endl;

    //     }
    // }

    ///Type Casting

    // int  a=343;
    // float b=87.24; //87.24; SAME ANSWER WILL COME.

    // cout<<(float) a/34<<endl;

    // cout<<(int) b;

    ///Printing Character using string

    // string name ="HELLO DEEPAK !!!";

    // cout<<"The name is  "<<name<<endl;
    // cout<<"The length of name is  "<<name.length()<<endl;
    // cout<<"The name is  "<<name.substr(0,5)<<endl;
    // cout<<"The name is  "<<name.substr(6,16)<<endl;

    ///Using Pointer

    // int a =16;
    // int *ptr;

    // ptr=&a;

    // cout<<"The Address of a is "<<&a<<endl;
    // cout<<"The Address of a is "<<ptr<<endl;

    // cout<<"The value of a is  "<<a<<endl;
    // cout<<"The value of a is  "<<*ptr<<endl;

    ///Creating a Class

    class Employee
    {
    public:
        string name;
        long salary;
        int age;
        string college;

    }; //We can Throw this class(GLOBAL CLASS) from the main method.

    Employee dj;
    dj.name = "DEEPAK JAISWAL";
    dj.age = 19;
    dj.salary = 1000000;
    dj.college = "SVIT BANGALORE";

    cout << "The Emloyee detail is " << dj.name << " And his salary is " << dj.salary << endl;
    cout << "His age is " << dj.age << " Studied from " << dj.college << endl;

    getch();
}