#include <iostream>
using namespace std;

void fun();

int main()
{
    fun();
    fun();
}

void fun()
{
    static int x; // Due to use of x ,The x value will not destroy after first call.
    x++;

    cout << "Value of x : " << x << endl;
}