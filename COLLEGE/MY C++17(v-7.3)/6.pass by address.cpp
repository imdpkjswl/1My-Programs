#include<iostream>

using namespace std;


void swap(int* a,int* b)  // Formal parameter
{
    int temp;

    temp = *a;
    *a = *b;
    *b = temp;

}

int main()
{
    int x=10;
    int y=20;

    swap(&x,&y);

    cout<<"Value of x and y is swapped"<<endl;
    cout<<x<<endl<<y<<endl;

    return 0;
}
