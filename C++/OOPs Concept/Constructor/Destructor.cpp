#include<bits/stdc++.h>

using namespace std;  
class Employee  
{  
   public:  
        Employee()    
        {    
            cout<<"Constructor Invoked"<<endl;    
        }    
        
        ~Employee()    
        {    
            cout<<"Destructor Invoked"<<endl;    
        }  
};  

int main(void)   
{  
    Employee e1;   
    Employee e2; 

    return 0;  
}  