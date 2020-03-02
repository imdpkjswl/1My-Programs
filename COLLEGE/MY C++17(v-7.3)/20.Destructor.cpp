#include<iostream>

using namespace std;


class simple
{

    private:
        int a,b;

    public:
        simple()
        {
            cout<<"This is Destructor"<<endl;
        }

};

void fun()
{
    simple obj;
}

int main()
{
    fun();

}
