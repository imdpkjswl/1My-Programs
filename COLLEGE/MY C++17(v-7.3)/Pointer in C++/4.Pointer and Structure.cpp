/* C++ Pointers and Structures. This C++ program
 * demonstrates about declaration and the use of
 * Structure Pointers in C++ */

#include<iostream>
#include<conio.h>
using namespace std;

int main()
{
	struct date
	{
		short int dd, mm, yy;

	}birthdate = {21, 03, 2000};

	date *date_ptr;
	date_ptr = &birthdate;

	cout<<"Printing the structure elements using the structure variable:\n";
	cout<<"dd = "<<birthdate.dd<<", mm = "<<birthdate.mm<<", yy = "<<birthdate.yy<<"\n";
	cout<<"\nPrinting the structure elements using the structure pointer:\n";
	cout<<"dd = "<<date_ptr->dd<<", mm = "<<date_ptr->mm<<", yy = "<<date_ptr->yy<<"\n";

	getch();
}
