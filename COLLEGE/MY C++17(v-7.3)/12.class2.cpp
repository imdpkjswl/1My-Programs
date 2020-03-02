/// PROGRAM TO ADD TWO COMPLEX NUMBER

#include<iostream>
#include<conio.h>

using namespace std;


class complex
{

    private:
        int a,b; // here, a and b are the real and imaginary values.

    public:
        void set_data(int x,int y)
        {   a = x;
            b = y;  }


        void show_data()
        {
            cout<<"Sum is "<<a<<"+i"<<b<<endl;;
        }

        complex add(complex c)
        {
            complex temp;

            temp.a = a +c.a;
            temp.b = b +c.b;

            return temp;
        }

};


int main()
{
    int r1,r2,i1,i2;
    cout<<"Enter the first complex number(x1+iy1)"<<endl;
    cin>>r1>>i1;
    cout<<"Enter the second complex number(x2+iy2)"<<endl;
    cin>>r2>>i2;


    complex c1,c2,c3;


    c1.set_data(r1,i1);
    c2.set_data(r2,i2);
    c3= c1.add(c2);

    c3.show_data();


    return 0;
}
