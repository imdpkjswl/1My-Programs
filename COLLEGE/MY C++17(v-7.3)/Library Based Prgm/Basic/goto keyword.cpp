#include<iostream>

using namespace std;

int main()
{
    int a;

    a = 0 ;
    start :
    cout << ++a << endl ;

    if(a < 50)
        goto start ;


    return 0;
}
