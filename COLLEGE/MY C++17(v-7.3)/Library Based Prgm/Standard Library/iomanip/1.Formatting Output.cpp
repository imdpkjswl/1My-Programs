/* C++ Formatting Output - The setw() Manipulator */

#include<iostream>
#include<iomanip>
#include<conio.h>
using namespace std;

int main()
{
    /*
    The setw() manipulator does not stick from one cout statement to the next.
    For example, if you want to right-justify three numbers within an 8-space
    field, you will need to repeat setw() for each value, as it shown below:
    */

    cout<<setw(8)<<22<<endl; //This 22 will start printing at 7th position.
    cout<<setw(8)<<4444<<"\n"; //This 4444 will start printing at 5th position.
    cout<<setw(8)<<666666<<endl; // This will start printing at 3rd position.

    getch();
    return 0;
}


/*
int main()
{

	int i, num;
	cout<<"Enter a number: ";
	cin>>num;
	cout<<"\nTable of "<<num<<" is:\n\n";
	for(i=1; i<=10; i++)
	{
		cout<<num<<setw(3)<<"*"<<setw(4)<<i<<setw(4)<<"="<<setw(4)<<num*i<<"\n";
	}
	getch();

	return 0;
}
*/
