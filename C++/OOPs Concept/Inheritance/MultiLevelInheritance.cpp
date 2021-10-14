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
     A e;
     cout<<e.salary<<endl;

     B e;
     cout<<e.salary<<endl; 

     C e;
     cout<<e.salary<<endl;   
     return 0;  
}  