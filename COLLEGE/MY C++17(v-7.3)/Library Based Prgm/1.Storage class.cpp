#include<iostream>
#include<conio.h>

/*
Storage classes in C++, basically defines the scope and life time of the variable,functions
in our program. Here are the list of C++ storage classes available in C++:

    auto
    extern
    register
    static
*/

using namespace std;

/* // auto storage class

int main()
{
    auto int counter;
	int a;
	auto int b;
	cout<<"Enter any two number: ";
	cin>>a>>b;

	cout<<"\nPrinting these two number, 10 times:\n";

	for(counter=0; counter<10; counter++)
	{
		cout<<a<<"\t"<<b<<"\n";
	}

	getch();

	// auto keyword must be declared within function or locally

}
*/













/*

C++ Register Storage class:
The register variables is stored in the register instead of RAM. Due to this, you can not define register
variable which occupy more size than the maximum size of register. Because the register variable stored
inside the register instead of RAM, so you can't apply & operator (address operator) on the register variable,
since the & operator is used to acquire the address of the variable

int main()
{

    int num1, num2;
	cout<<"Enter any two number: ";
	cin>>num1>>num2;

	cout<<"\nIncrementing and printing these two numbers 10 times:\n";
	for(register int counter=1; counter<=10; counter++)
	{
		cout << num1 << "\t" << num2 << "\n";
		num1++;
		num2++;
	}
	getch();
}
*/










/*
C++ static storage class plays an important role in a C++ program,
when the program require to keep previous value of a variable.

void fun();
int main()
{
	for(int i=1; i<=10; i++)
	{
		fun();
	}

	getch();
}

void fun()
{
	static int val = 10;
	val++;
	cout<<val<<"  ";
}

*/











/*

C++ extern storage class is simply used to give a reference of global variable. You can use
extern storage class to define variables, functions, that you want to use these variables
and functions inside another file


extern void welcome_message(void);
*/


void welcome_message(void)
{
	cout<<"Welcome to Addition Portal\n";
	cout<<"Do number ko add karne wala program hai\n\n";
}


int main()
{

	welcome_message();

	int num1, num2;
	cout<<"Enter any two number: ";
	cin>>num1>>num2;

	cout<<"\nThe sum of the two number is "<<num1+num2<<endl;

	getch();
	return 0;
}
