#include<iostream>

using namespace std;


void swap(int a,int b)  // Formal parameter
{
    int temp;

    temp = a;
    a = b;
    b = temp;

}

int main()
{
    int x=10;
    int y=20;

    swap(10,20); // In pass by value,if swap fun called,then no change will occur in x actual parameter.

    cout<<x<<endl<<y<<endl;
    cout<<"Nothing changed in actual parameter"<<endl;

    return 0;
}
