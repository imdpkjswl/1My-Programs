/* This program
 * demonstrates the concept of close association
 * between arrays and pointers in C++. */

#include<iostream>
#include<conio.h>
using namespace std;

int main()
{

	int *iptr[5];
	int fa=65, fb=66, fc=67, fd=68, fe=69;
	int i;

	// initialize array pointers by making them point to 5 different ints
	iptr[0] = &fa;
	iptr[1] = &fb;
	iptr[2] = &fc;
	iptr[3] = &fd;
	iptr[4] = &fe;

	// now prints the values being pointed to by the pointers
	for(i=0; i<5; i++)
	{
		cout<<"Pointer iptr["<<i<<"] points to "<<*iptr[i]<<endl;
	}
	cout<<endl<<endl;

	// now print the addresses stored in the array
	cout<<"Base address of the array iptr of pointers is : "<<iptr<<endl;
	for(i=0; i<5; i++)
	{
		cout<<"Address stored in iptr["<<i<<"] is :  "<<iptr[i]<<endl;
	}

	getch();
}
