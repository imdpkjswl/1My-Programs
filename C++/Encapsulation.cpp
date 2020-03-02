// Encapsulation 
  
#include<iostream> 
using namespace std; 
  
class Employee 
{ 
    private: 
        // data hidden from outside world 
        int salary; 
          
    public: 
        // function to set value of variable x 

        void set() 
        { 
            cout<<"Salary initialized"<<endl;
            salary = 50000;
            cout<<"This is the inside class salary is : "<<salary<<" dollor."<<endl;
        }      
}; 
  
 
int main() 
{ 
    Employee obj; // Create object. 
      
    obj.set(); // Just call the method.
    return 0;

}