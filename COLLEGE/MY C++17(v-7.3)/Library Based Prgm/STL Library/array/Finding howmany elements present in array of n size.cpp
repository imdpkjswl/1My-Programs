#include<iostream>

using namespace std;

int main()
{
    int a[10] = {1,2,3,4,5};

    for(int i=0;i<10;i++)
        cout<<a[i]<<"  ";
    cout<<endl<<endl;

    int i=0;
    while(a[i] !='\0')
        i++;

    cout<<"Elements present in array : "<<i<<endl;
}
