#include <bits/stdc++.h>  
using namespace std;  

class A {  
   public:  
   float salary = 60000;   
 };

class B : public A {    
        float salary = 50000;    
};

class C : public B {
    float salary = 90000;
};


int main(void) 
{  
     A emp1;
     cout<<emp1.salary<<endl;

     B emp2;
     cout<<emp2.salary<<endl; 

     C emp3;
     cout<<emp3.salary<<endl;   
     return 0;  
}  