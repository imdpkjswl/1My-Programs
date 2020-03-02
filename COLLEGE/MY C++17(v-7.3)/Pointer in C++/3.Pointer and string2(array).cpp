/* C++ Pointers and Arrays. Pointers and Strings
 * Program to swap the position of two characters.
 */

#include<iostream>
#include<conio.h>
#include<string.h>

using namespace std;

int main()
{

	char *names[] = {"Sachin", "Dhoni", "Virat", "Rohit", "Yuvraj"};
	int len=0;

	len=strlen(names[1]);   // length of 2nd string
	cout<<"Originally:\nString 2 is  ";
	cout.write(names[1],len).put('\n');
	cout<<"and String 4 is  ";
	cout.write(names[3],len).put('\n');

	// now exchange the position of string 2 and 4
	char *tptr;
	tptr = names[1];
	names[1] = names[3];
	names[3] = tptr;

	// now print the exchanged string
	cout<<"\nExchanged:\nString 2 is  ";
	cout.write(names[1],len).put('\n');
	cout<<"and String 4 is  ";
	cout.write(names[3],len).put('\n');

	getch();
}
