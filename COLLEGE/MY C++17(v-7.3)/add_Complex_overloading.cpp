#include<iostream>


using namespace std;

class complex
{
    private:
        int real;
        int img;

    public:
        complex(int r=0 , int i=0)
        {
            real = r;
            img = i;
        }

        operator+(complex c2)//Operator Overloading      //GENERAL METHOD:void add(complex c2)
        {
            complex temp;

            temp.real = real + c2.real;
            temp.img = img +c2.img;
            cout<<temp.real <<"+"<< temp.img<<"i"<<endl;

        }

};

int main()
{

    complex c1(4,6);
    complex c2(2,10);
    complex c3;

    //c3 = c1.add(c2); // GENARAL METHOD
    c3 = c1 + c2; /// Here ,+ works as a operator overload.
}
