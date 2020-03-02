#include<iostream>
#include<string>

using namespace std;

int main()
{
    string range = "The char range is in between 0-127";
    char x=127;
    x++;

    cout<<range<<endl<<(int)x<<endl;
    cout<<"After cross its range,it again cyclic started from beginning"<<endl;

    return 0;

}
