#include<iostream>
#include<conio.h>

#include<cstdlib>
#include<ctime>

using namespace std;

int main()
{

    cout<<"The 5 random numbers are :"<<endl;
    srand(time(0));
    for(int i=1;i<=5;i++)
        cout<<rand()%10<<"\t"; /// mod 10 is used to generate number less than 10.

    cout<<endl;
    getch();
    return 0;
}

/// NOTE:
///    1. rand() funtion is used to generate random number but only one time.
///    2. srand() method is used to change algo of rand() function by using time library to generate random number every time.
