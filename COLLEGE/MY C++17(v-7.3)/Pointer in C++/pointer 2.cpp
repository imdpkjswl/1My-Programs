#include<iostream>
#include<conio.h>
using namespace std;

int main()
{

	float a = 5.999; // Normal variable
	float *b, *c; /// Pointer variable
	b = &a;   // Copying address of a into b
	c = b;    // Copying address of b into c


	cout<<"CODE:\nfloat a = 5.999; // Normal variable\nfloat *b, *c; /// Pointer variable\nb = &a;   // Copying address of a into b\nc = b;    // Copying address of b into c"<<endl;
	cout<<"Output:"<<endl;
	cout<<"a = "<<a<<endl;
	cout<<"*(&a) = "<<*(&a)<<endl;
	cout<<"*b = "<<*b<<endl;
	cout<<"*c = "<<*c<<endl;

	getch();
}
