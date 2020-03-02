#include<iostream>
#include<cstdlib>

using namespace std;

class base
{
    public:
        int x;

    void show()
    {
        cout<<"base x : "<<x<<endl<<endl;
    }
};

class derived : public base
{
    public:
        int y;

    void display()
    {
        cout<<"derived : "<<endl<<"x : "<<x<<endl<<"y : "<<y<<endl;
    }

};


int main()
{
    base b;
    b.x = 10;
    b.show();


    derived d;
    d.x = 20;
    d.y = 30;
    d.show();
    d.display();

    return 0;

}
