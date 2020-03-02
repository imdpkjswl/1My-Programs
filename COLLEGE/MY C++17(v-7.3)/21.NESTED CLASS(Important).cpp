#include<iostream>

using namespace std;

class outer
{
    public:
        int a=10;
        static int b;

        void fun()
        {
            i.show();
            cout<<"x : "<<i.x<<endl;
            cout<<"a : "<<a<<endl; /// Non-static member can access only within its own class.
        }

        class inner
        {
            public:
                int x=20;

                void show()
                {
                    cout<<"b : "<<b<<endl;
                                    /// We can not access non-static member of other class into another class. //cout<<a<<endl;
                }
        };
        inner i;  //Creating object of innner class in outer class
};

int outer:: b=30;

int main()
{
    outer o;
    o.fun();

    return 0;
}
