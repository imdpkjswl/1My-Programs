#include<iostream>

using namespace std;

class father {
    public:
        father(){
            cout<<endl<<"This is Father class Constructor."<<endl;
        }
};

class son : public father{
    public :
        son() {
            cout<< "This is a Son class Constructor."<<endl;
        }

};

int main()
{
    father obj1; // If we create object of father class,then it'll only call father class statements.

    son obj2; // If we create object of son class,then it'll call both father and son class statements.
}