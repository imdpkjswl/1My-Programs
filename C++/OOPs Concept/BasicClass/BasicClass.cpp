#include<bits/stdc++.h>

using namespace std;

class Student{
    public:
        int usn = 10;;
        string name = "Deepak Jaiswal";

    bool isWalking()
    {
        cout<<"Walking..."<<endl;
        return true;
    }
};

int main()
{
    Student s; // create object

    cout<<"Student usn:  "<<s.usn<<endl;
    cout<<"Student name:  "<<s.name<<endl;

    bool isWalking = s.isWalking();
    cout<<isWalking<<endl;

    return 0;
}