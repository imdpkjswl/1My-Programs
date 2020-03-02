#include<iostream>
#include<conio.h>
using namespace std;

int main()
{

	int num=20;
	int val;
	int *iptr;

	iptr = &num;
	val = *iptr;

    /// for printing or copying value , use * operator :
	cout<<"num = "<<num<<"\n*iptr = "<<*iptr<< "\nval = "<<val<<endl;

	getch();
}
