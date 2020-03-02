#include<iostream>

using namespace std;

class Box
{
    private:
        int a,b,c;

    public:

        void setDimension(int x,int y,int z)
        {
            a = x;
            b = y;
            c = z;
        }

        void showDimension()
        {
            cout<<"a = "<<a<<endl<<"b = "<<b<<endl<<"c = "<<c<<endl;
        }
};

int main()
{
    Box *p , smallBox;
    p = &smallBox;// Storing address of object,This p points to address of smallBox object
    cout<<"Calling by using object pointer"<<endl;
    p->setDimension(2,3,4);
    p->showDimension();


    cout<<"Calling by using object"<<endl;
    smallBox.setDimension(2,3,4);
    smallBox.showDimension();

    return 0;

}
