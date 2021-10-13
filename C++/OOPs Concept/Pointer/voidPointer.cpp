#include<bits/stdc++.h>
/* Void Pointer can hold address of any data type BUT 
   it can not associated with any data types. */

using namespace std;

int main()
{
    void *p;   
    int *ptr1;  
    int data = 10;   
    p = &data;  // store address of 'data' in void pointer

    ptr1 = (int*)p; // assigning void to integer pointer  
    cout <<*ptr1<<endl;  
    
    return 0;  
}