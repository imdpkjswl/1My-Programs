#include<iostream>
#include<conio.h>

using namespace std;

int main()
{
    int *p = new int[5]; // This array is created in Heap memory and it can be accessed by pointer that is present in stack.

    cout<<"Enter 5 elements : "<<endl;
    for(int i=0;i<5;i++)
        cin>>p[i];


    cout<<"The array elements are : "<<endl;
    for(int i=0;i<5;i++)
        cout<<p[i]<<" ";

    // Deallocating memory
    delete []p;

    getch();

    return 0;

}
