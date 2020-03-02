#include<iostream>

using namespace std;

int x =30; // Global variable

int main()
{
    int x=10; //Local variable

    /// :: is used to access the global variables.
    cout<<"Local x :  "<<x<<endl;
    cout<<"Global x :  "<<::x<<endl; /// :: is a unary scope operator

    return 0;
}
