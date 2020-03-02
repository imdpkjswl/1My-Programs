#include <iostream>
using namespace std;

int main()
{
    int x = 7;

    cout << x << endl;
    {
        int x = 5; // auto storage which has scope-Local.

        cout << x << endl;
    }

    cout << x << endl;
}