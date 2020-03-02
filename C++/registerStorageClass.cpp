#include <iostream>
#include<conio.h>
using namespace std;

int main()
{
    register int x = 6; // register is used for fast process and use bcuz x is use many times.
    int y = 9;
    cout << x << endl;
    cout << y << endl;

    y = x++;
    x--;
    cout << y << endl;
    cout << x << endl;

    y = x + 3;
    cout << y << endl;
    getch(); // Used to take one character from keyboard.
}