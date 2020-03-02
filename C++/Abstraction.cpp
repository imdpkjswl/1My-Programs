#include <iostream> 
using namespace std; 
  
class implementAbstraction 
{ 
    private: 
        int a, b; // This value only accessible within this class.
  
    public: 
      
        // method to set values of private members. 
        
        void set(int x, int y) 
        { 
            a = x; 
            b = y; 
        } 
          
        void display() 
        { 
            cout<<"a = " <<a << endl; 
            cout<<"b = " << b << endl; 
        } 
}; 
  
int main()  
{ 
    implementAbstraction obj;  // Creating an object.
    int x,y;
    cout<<"Enter any two number to verify"<<endl;
    cin>>x>>y;

    obj.set(x,y); // value of x and y sent to set() method.
    obj.display();  // Calling display() method to print result.
    return 0; 
} 