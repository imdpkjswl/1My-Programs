#include<bits/stdc++.h>

using namespace std;

int main()
{
    int a = 10;
    int b = 20;

    int *p1;
    int *p2;

    p1 = &a;
    p2 = &b;

    *p1 = *p1 + *p2;
    *p2 = *p1 - *p2;
    *p1 = *p1 - *p2;

    cout<<*p1<<endl;
    cout<<*p2<<endl; 

    cout<<a<<endl;
    cout<<b<<endl;
}