#include<iostream>
#include<conio.h>

/// Need to UnderStand this code...
using namespace std;

int main()
{
    int arr[] = {4, 6, 10, 12};
	int *ptr;
	int i;
	ptr = arr; // copying address of first index of array...

	for(i=0; i<3; i++)
	{
		cout << *ptr << " -> ";
		ptr++;
	}
	cout<<*ptr<<endl;

	cout<<"Multiplied by 3"<<endl;
	for(i=0; i<4; i++)
	{
		(*ptr) *= 3;
		--ptr;
	}

	for(i=0; i<4; i++)
	{
		cout << arr[i] << " -> ";
	}

	getch();

}
