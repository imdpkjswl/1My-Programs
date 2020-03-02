#include<iostream>
#include<conio.h>

using namespace std;

class Example {
    // Variable Declaration
    int a, b;
public:

    //Constructor

    Example(int x, int y) {
        // Assign Values In Constructor
        a = x;
        b = y;
        cout << "I'm a Constructor\n";
    }

    void Display() {
        cout << "Values : " <<endl<< a <<endl<< b;
    }
};

int main() {
    Example Object(10, 20);
    // Constructor invoked.
    Object.Display();

    // Wait For Output Screen
    getch();
    return 0;
}