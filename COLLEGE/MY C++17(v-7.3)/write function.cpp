/*
SYNTAX :
    cout.write(source,size);

NOTE :
    * cout is an object of ostream class represents the standard output stream.
    * It can write characters either as formatted data using for example the
    * insertion operator ostream::operator<< or as Unformatted data using the
    * write member function. */

#include<iostream>
#include<conio.h>
using namespace std;

int main()
{
    cout.write("Hello World!!!\nIts a write member function.",14);

    return 0;
}
