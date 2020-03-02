#include <iostream>
#include <cstdlib>

// Driver program
int main(void)
{
    // This program will create same sequence of
    // random numbers on every program run

    for (int i = 0; i < 7; i++)
    {

        std::cout << rand() << std::endl;
    }
    return 0;
}