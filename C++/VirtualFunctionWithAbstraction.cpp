#include<iostream> 
using namespace std; 
  
class Base 
{ 
   int x; 
public: 
    virtual void fun() = 0;  // Virtual function with Abstraction.
    int getX() { return x; } 
}; 
  
// This class inherits from Base and implements fun() 
class Derived: public Base   // Child class.
{ 
    int y; 
public: 
    void fun() { cout << "fun() called."; } 
}; 
  
int main(void) 
{ 
    Derived obj; 
    obj.fun(); 
    return 0; 
} 