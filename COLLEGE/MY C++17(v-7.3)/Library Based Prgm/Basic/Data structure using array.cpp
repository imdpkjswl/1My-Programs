/* C++ Structure Array - C++ Array of Structure */

#include<iostream>
#include<conio.h>
#include<cstdlib>
#include<cstdio>

using namespace std;

struct addr
{
	char city[20];
	char state[20];
};

struct emp
{
	int empno;
	char name[20];
	float basic;

	addr address; /// creating a variable of addr type.
};



int main()
{

	emp evar[10];

	int i,n;
	char ch;

	cout<<"Enter the no. of employee"<<endl;
	cin>>n;

    for( i=0; i<n; i++ )
	{
		cout<<"Employee No: ";
		cin>>evar[i].empno;

		cout<<"Employee Name: ";
		cin>>evar[i].name;

		cout<<"City: ";
		cin>>evar[i].address.city;

		cout<<"State: ";
		cin>>evar[i].address.state;
		cout<<"Basic Pay: ";
		cin>>evar[i].basic;
		cout<<endl<<endl;
	}

	system("cls");

	do
	{
		cout<<"Enter employee number whose information is to be displayed : \n";
		int eno;
		cin>>eno;

		int flag=0;
		for(i=0; i<n; i++)
		{
			if(evar[i].empno == eno)
			{
				flag = 1;
				cout<<"\nEmployee Data: \n";
				cout<<"Employee No:  "<<evar[i].empno;
				cout<<"\nName:  "<<evar[i].name;

				cout<<"\nAddress:  ";
				cout<<evar[i].address.city<<", ";
				cout<<evar[i].address.state<<endl;
				cout<<"Basic Pay: "<<evar[i].basic;
				cout<<"\n";
				break;
			}
		}
		if(!flag)
		{
			cout<<"\nSorry..!!..No such employee exists..!!\n";
			cout<<"Exiting.....Press a key...\n";
			getch();
			exit(0);
		}
		cout<<"Want to display more ? (y/n).. ";
		cin>>ch;
	}while(ch=='y' || ch=='Y');
	getch();
}
