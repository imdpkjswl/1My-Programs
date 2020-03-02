#include <bits/stdc++.h> 
using namespace std; 
class className 
{ 
    public: 
    string myname; 
    int id; 
      
    // printname is not defined inside class defination 
    void printname(); 
      
    // printid is defined inside class defination 
    void printid() 
    { 
        cout << "My id is: " << id; 
    } 
}; 
  
// Definition of printname using scope resolution operator :: 
void className::printname() 
{ 
    cout << "My name is: " << myname;  
} 
int main() { 
      
    className obj; 
    obj.myname = "DEEPAK JAISWAL"; 
    obj.id=263; 
      
    // call printname() 
    obj.printname(); 
    cout << endl; 
      
    // call printid() 
    obj.printid(); 
    return 0; 
} 