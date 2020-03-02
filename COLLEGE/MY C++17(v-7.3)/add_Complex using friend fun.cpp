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

        friend operator+(complex c1,complex c2);

};

operator+(complex c1,complex c2)
{
            complex temp;

            temp.real = c1.real + c2.real;
            temp.img = c1.img +c2.img;
            cout<<"RESULT :"<<endl;
            cout<<temp.real <<"+"<< temp.img<<"i"<<endl;
}



int main()
{

    complex c1(4,6);
    complex c2(2,10);
    complex c3;


    c3 = c1 + c2; /// Here ,+ works as a operator overloading(Binary Operator).
}
