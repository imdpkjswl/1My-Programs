#include <bits/stdc++.h>  
using namespace std;  

class Student  
{  
   public:  
    int usn;  
    Student(int a)                // parameterized constructor.  
    {  
      usn=a;  
    }  

    Student(Student & old) // copy constructor-SYNTAX: Class_name(Class_name &old_object);    
    {  
        usn = old.usn;  
    }  
};  

int main()  
{  
    Student s1(20);     // Calling the parameterized constructor.  
    
    Student s2(s1);    //  Calling the copy constructor.  
    
    cout<<s2.usn;   
    return 0;  
}  