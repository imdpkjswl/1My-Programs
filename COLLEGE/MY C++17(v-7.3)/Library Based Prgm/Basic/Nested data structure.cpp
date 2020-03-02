/* C++ Nested Structure - Example of Nested Structure in C++ */
#include<iostream>
#include<conio.h>
#include<cstdlib>
#include<cstdio>
#include<string>


using namespace std;

struct addr
{
	int houseno;
	char street[30];
	char city[20];
	char state[20];

};

struct emp
{
	int empno;
	char name[30];
	char desig[30];
	float payout;

	addr address;

};

int main()
{

	emp evar;

	cout<<"Employee No: "<<endl;
	cin>>evar.empno;

	cout<<"Employee Name: "<<endl;
	cin>>evar.name;

	cout<<endl<<"Designation: ";
	cin>>evar.desig;

	cout<<endl<<"House No: ";
	cin>>evar.address.houseno;

	cout<<"Street: "<<endl;
	cin>>evar.address.street;

	cout<<endl<<"City: ";
	cin>>evar.address.city;

	cout<<endl<<"State: ";
	cin>>evar.address.state;

	cout<<endl<<"Basic Pay: ";
	cin>>evar.payout;

	cout<<endl;

	char ch;
	cout<<"Want to see details ? (y/n)...";
	cin>>ch;
	if(ch=='y' || ch=='Y')
	{
		cout<<"\n\nEmployee Data : \n";
		cout<<"Employee No: "<<evar.empno;
		cout<<"\nName: "<<evar.name;
		cout<<"\nDesignation: "<<evar.desig;
		cout<<"\nAddress: "<<evar.address.houseno<<", ";
		cout<<evar.address.street<<", ";
		cout<<evar.address.city<<", ";
		cout<<evar.address.state<<endl;
		cout<<"Basic Pay: "<<evar.payout;
		cout<<"\n";
	}

	getch();
}
