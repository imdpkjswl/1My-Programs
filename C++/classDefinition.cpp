#include<iostream> 
using namespace std; 
class Name 
{ 
    // Access specifier 
    public: 
  
    // Data Members 
    string myname; 
  
    // Member Functions() 
    void printname() 
    { 
       cout << "My name is :  " << myname; 
    } 
}; 
  
int main() { 
  
    // Declare an object of class Name 
    Name obj; 
  
    // accessing data member (Variable).
    obj.myname = "Deepak Jaiswal"; 
  
    // accessing member function 
    obj.printname(); 
    return 0; 
} 