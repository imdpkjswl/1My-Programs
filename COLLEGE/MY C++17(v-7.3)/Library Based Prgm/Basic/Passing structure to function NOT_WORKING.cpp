#include<iostream>
#include<cstdlib>

/// NOT WORKING>>>>>>>>>
using namespace std;


struct distance
{
	int feet;
	int inches;
};




void cnvt(distance length1, distance length2)
{
	distance length3;      // new structure

	length3.feet=length1.feet+length2.feet+(length1.inches+length2.inches)/12;  // 1 feet=12 inches
	length3.inches=(length1.inches+length2.inches)%12;

	cout<<"\n\nTotal Feet: "<<l3.feet<<"\n";
	cout<<"Total Inches: "<<l3.inches;

}




int main()
{

	distance length1, length2;   /// two structures of type distance declared

	/* Read values for length1 */
	cout<<"Enter length 1:\n";
	cout<<"Feet: ";
	cin>>length1.feet;
	cout<<"\nInches: ";
	cin>>length1.inches;

	/* Read values for length2 */
	cout<<"\n\nEnter length 2:\n";
	cout<<"Feet: ";
	cin>>length2.feet;
	cout<<"\nInches: ";
	cin>>length2.inches;

	cnvt(length1, length2);      // print sum of length1 and length2

	getch();

    return 0;
}
