#include<iostream>
using namespace std;

/*
    this is an object pointer in every instance member function which contain address of caller objects.
*/
class Box
{
    private:
        int a,b,c;

    public:

        void setDimension(int a,int b,int c)
        {
            /// Here, this pointer is representing to member of caller object.
            this->a = a;
            this->b = b;
            this->c = c;
        }

        void showDimension()
        {
            cout<<"a = "<<a<<endl<<"b = "<<b<<endl<<"c = "<<c<<endl;
        }
};

int main()
{
    Box smallBox;

    smallBox.setDimension(2,3,4);
    smallBox.showDimension();

    return 0;

}

