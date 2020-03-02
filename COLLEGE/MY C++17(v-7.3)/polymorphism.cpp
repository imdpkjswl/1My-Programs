#include<iostream>
#include<cstdio>

using namespace std;

class car
{
    public:

        virtual void start() = 0; /// When we assign a vitual function to zero ,then it is called as PURE VIRTUAL FUNCTION.
        virtual void stop() = 0;

};


class duster : public car
{
    public:

        void start()
        {
            cout<<"Duster car is started"<<endl;
        }

        void stop()
        {
            cout<<"Duster car is stopped"<<endl;
        }

};


class swift : public car
{
    public:

        void start()
        {
            cout<<"Swift car is started"<<endl;
        }

        void stop()
        {
            cout<<"Swift car is stopped"<<endl;
        }

};



int main()
{

    car *ptr = new duster();
    ptr->start();
    ptr->stop();


    ptr = new swift();
    ptr->start();
    ptr->stop();



    return 0;
}
