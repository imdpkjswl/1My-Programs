#include<iostream>

using namespace std;

int add(int* a,int* b)
{
    int sum;
    sum = *a+*b;
    return sum;
}


int main()
{
    int a,b,res;

    cout<<"Enter two number"<<endl;
    cin>>a>>b;
    res = add(&a,&b);

    cout<<"Sum of "<<a<< " and " <<b<< " is " <<res<<endl;


}
