#include<iostream>

using namespace std;

int main()
{

    int size;
    cout<<"Enter the size of an array"<<endl;
    cin>>size;

    int a[size];

    cout<<"Enter the "<<size<<" elements"<<endl;

    for(int i=0;i<size;i++)
        cin>>a[i];

    cout<<"The array elements are :"<<endl;
    for(int i=0;i<size;i++)
        cout<<a[i]<<" ";
}
