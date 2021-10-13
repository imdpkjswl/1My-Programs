#include<bits/stdc++.h>

using namespace std;
class Employee{
    public:
    int id;
    string name;

    Employee(int id, string name)
    {
        this->id = id;
        this->name = name;
    }
};


int main()
{
    Employee e(10, "Deepak Jaiswal");

    cout<<e.id<<endl;
    cout<<e.name<<endl;
    
    return 0;
}