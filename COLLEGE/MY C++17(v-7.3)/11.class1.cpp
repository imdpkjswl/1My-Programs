#include<iostream>
#include<conio.h>

using namespace std;


class complex
{

    private:
        int a,b; // here, a and b are the real and imaginary values.

    public:
        void set_data(int x,int y)
        {
            a = x;
            b = y;
        }

        void show_data()
        {
            cout<<"The Real and Imaginary value is : "<<endl;
            cout<<"a : "<<a<<endl<<"b : "<<b<<endl;
        }

};


int main()
{
    int x,y;

    complex c1;

    cout<<"Enter real and imaginary value"<<endl;
    cin>>x>>y;

    c1.set_data(x,y);
    c1.show_data();


    return 0;
}
