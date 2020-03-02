// Use of scope resolution class inside another class.
#include<iostream>
using namespace std;

class outside
{
    public:
        int x;
        class inside
        {
            public:
                int x;
                static int y;
                int foo();

        };
};

int outside::inside::y = 5;

int main()
{
    outside A;
    outside::inside B;

    return 0;
}
