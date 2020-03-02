#include<iostream>

using namespace std;


void swap(int &a,int &b)  // Formal parameter
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

    swap(x,y);

    cout<<x<<endl<<y<<endl;
    cout<<"Changed in actual parameter Done"<<endl;

    return 0;
}
