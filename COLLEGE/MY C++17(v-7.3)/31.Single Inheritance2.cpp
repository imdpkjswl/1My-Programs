#include<iostream>

using namespace std;

class car
{
    /// If i write private here,then it can't be inherited by the other class.
    public:
        char company[20];
        char addr[20];

    public:
        void scan1()
        {
            cout<<"Enter company name :"<<endl;
            cin>>company;
            cout<<"Enter the address of company :"<<endl;
            cin>>addr;
        }
};

class suzuki : public car
{
    private:
        char model[20];
        float price;

    public:
        void scan2()
        {
            cout<<"Enter the car model :"<<endl;
            cin>>model;
            cout<<"Enter the car price :"<<endl;
            cin>>price;
        }

    void display()
    {
        cout<<"\nDetails are : "<<endl;

        cout<<"Company name : "<<company<<endl;
        cout<<"Company address : "<<addr<<endl;
        cout<<"Car model : "<<model<<endl;
        cout<<"Car price : "<<price<<endl;
    }
};

int main()
{
    suzuki obj;

    obj.scan1();
    obj.scan2();
    obj.display();

    return 0;
}
