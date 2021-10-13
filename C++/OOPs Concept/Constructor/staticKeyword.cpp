#include <iostream>  
using namespace std;  

class Account {  
   public:  
       int accno; //data member (also instance variable)      
       string name;   
       static int count;     
       Account(int accno, string name)   
        {    
             this->accno = accno;    
             this->name = name;    
             count++;  
        }

        void display(); // prototype
/*
       void display()    
        {    
            cout<<accno<<" "<<name<<endl;   
        }
*/    
};  

// Initialize the count variable
int Account::count = 0; 
/* Here, each time creating object of Account class, the static variable 
   'count' is not getting vanished due to only one copy of static field 
    created in the memory. It is shared to all the objects.
*/

void Account :: display(){
    cout<<accno<<" "<<name<<endl;
}

int main(void) {  
    Account a1 = Account(201, "Sanjay");  
    Account a2 = Account(202, "Nakul");   
    Account a3 = Account(203, "Ranjana");  
   
    a1.display();    
    a2.display();    
    a3.display();    
   
    cout<<"Total Objects are: "<<Account::count<<endl;  
   
    return 0;  
}  