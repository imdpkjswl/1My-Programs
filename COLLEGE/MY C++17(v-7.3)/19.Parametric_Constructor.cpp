#include<iostream>

using namespace std;


class complex
{

    private:
        int real;
        int img;

    public:
    complex(int x,int y) // parametric constructor
    {
        real=x;
        img=y;
    }

    complex(int z)
    {
        real = z;
    }

    void display()
    {
        cout<<real<<endl<<img<<endl;
    }


};

int main()
{
    complex obj1(3,8),obj2(5);

    obj1.display();
    obj2.display();

    return 0;
}
