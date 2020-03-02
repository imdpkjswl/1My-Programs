#include<iostream>
#include<conio.h>
using namespace std;

class your;  /// Type specifier declaration

class my
{
    private:
        int a;
    protected:
        int b;
    public:
        int c;

       friend your; // Extracting the property of my class into your class by using friend keyword.
};

class your
{
    public:
        my m;

    //void, it might be any function or constructor...
    your()
    {
        m.a =10;
        m.b =20;
        m.c =30;

        cout<<"a :   "<<m.a<<"\nb :   "<<m.b<<"\nc :   "<<m.c<<endl;
    }

};

int main()
{
    your y;
    //y.fun();

    return 0;
}
