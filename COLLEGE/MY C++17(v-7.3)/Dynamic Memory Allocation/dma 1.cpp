/* C++ Dynamic Memory Allocation  Program */

#include<iostream>
#include<conio.h>
#include<cstdlib>
using namespace std;

// We may also declare pointer globally:
//int *usn;    // declares an integer pointer
//float *marks;   // declares a float pointer

int main()
{

	int size, i;
	cout<<"How many elements for the array ? ";
	cin>>size;

	///Creating array dynamically...
	string *usn = new string[size]; 	// dynamically allocate usn array
	float *marks = new float[size];        // dynamically allocate marks array

	// first check, whether the memory is available or not
	if((!usn) || (!marks))
	{
		cout<<"Out of Memory..!!..Aborting..!!"<<endl;
		exit(1);
	}

	// read values in the array elements
	for(i=0; i<size; i++)
	{
		cout<<"Enter usn and marks for student :"<<(i+1)<<endl;
		cin>>usn[i]>>marks[i];
	}

	// now display the array contents
	cout<<"\nUsn \t\t Marks\n";
	for(i=0; i<size; i++)
	{
		cout<<usn[i]<<" \t\t "<<marks[i]<<"\n";
	}

	delete[]usn;    // deallocating usn array
	delete[]marks;     // deallocating marks array

	getch();
	return 0;
}
