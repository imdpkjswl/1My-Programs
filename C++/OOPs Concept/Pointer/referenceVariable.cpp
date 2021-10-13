#include <iostream>  
using namespace std;  
// A reference variable is alias name of other variable which already exist.

int main()  
{    
   int n = 10;    
   int &a = n; // creating a reference variable  
   
   cout<<"The value of 'i' variable is :"<<a;  
   
   return 0;  
}  