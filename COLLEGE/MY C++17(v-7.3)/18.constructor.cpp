#include<iostream>

using namespace std;


class complex
{

    private:
        int real;
        int img;

    public:
    complex()
    {
        cout<<"Constructor is now invoked.Whenever object is created."<<endl;
    }


};

int main()
{
    complex obj1,obj2,obj3;

    return 0;
}
