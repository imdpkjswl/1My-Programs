#include<iostream>
#include<conio.h>

using namespace std;

int main()
{

	int arr[100];
	int i,n ,count=0;

	cout<<"Enter n number of elements :"<<endl;
	cin>>n;
	cout<<"Enter array elements: "<<endl;;
	for(i=n-1; i>=0; i--)
	{
		cin>>arr[i];
		/*
		if(arr[i] == -5)
		{
			getch();
			break;
		}
		*/
		count++;
	}

	cout<<"\nArray elements in reverse order :\n";
	for(i=0; i<count; i++)
	{
		cout<<arr[i]<<"  ";
	}

	cout<<endl;
	getch();
}
