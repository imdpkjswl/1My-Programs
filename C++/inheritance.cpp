#include<iostream>
#include<string>

using namespace std;

class father {
    public :
        string name ;
        int id;
    
        void Info() {
            cout<<"Name is = "<<name<<"\nId is = "<<id<<endl;
        }
};
// inheritated father into son.
class son : public father{

};

int main()
{
    son obj1; // calling son class constructor due to creating object of son class.
    obj1.name = "Deepak Jaiswal"; // assigning string and id in son class constructor BUT not in Father class.
    obj1.id = 118010;

    obj1.Info(); // Calling member function.
    
}