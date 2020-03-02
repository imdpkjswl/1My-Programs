#include <iostream>
using namespace std;
 
#include "externSupportSecond.cpp"  // includes the content of externSupportSecond.cpp
 
extern int temp;  // declaring temp
 
int main()
 
{
 
    cout<<temp<<endl;
 
    sum(5);
 
    cout<<temp<<endl;
 
    return 0;
 
}