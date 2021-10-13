#include<bits/stdc++.h>
using namespace std;

/*
int main()  
{  
  cout << "Address of a main() function is : " <<&main<< endl;  
  return 0;  
} 
*/

int add(int a , int b)  
{  
    return a+b;  
} 

int main()  
{  
    int (*fptr)(int,int);  // function pointer declaration - SYNTAX  
    fptr = add; // funcptr is pointing to the add function  
    
    int sum = fptr(5,6);  
    cout << sum << endl;  
    
    return 0;  
}  