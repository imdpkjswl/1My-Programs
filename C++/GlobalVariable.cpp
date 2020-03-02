#include <iostream>
using namespace std;

// Global variable declaration:
int G;

int main()
{
    // Local variable declaration:
    int a, b;

    // actual initialization
    a = 10;
    b = 20;
    G = a * b;

    cout << "Multiplication of "  << a << " and " << b << " is  " << G << endl;

    return 0;
}