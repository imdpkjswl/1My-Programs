/*
Problem 9

A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2

For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/


/// NOTE : This program is more sufficient than the lower one.
#include <cmath>
#include <iostream>
using namespace std;
int main()
{
    /*
    explanation:

    **  b = a;
        if a, b (a <= b) and c are the Pythagorean triplet,
        then b, a (b >= a) and c - also the solution, so we can search only one case.
    *** c = 1000 - a - b; It's one of the conditions of the problem (we don't need to scan all possible 'c' : just calculate it)
    */
    const int sum = 1000;
    int a;
    for (a = 1; a <= sum/3; a++)
    {
        int b;
        for (b = a + 1; b <= sum/2; b++)
        {
            int c = sum - a - b;
            if ( a*a + b*b == c*c )
               {
                   cout<<"a=  "<<a<<" b=  "<<b<<" c=  "<<c<<endl;
                   cout<<endl<<"The product of "<<a<<","<<b<<" and "<<c<<" is :  "<<a*b*c<<endl;
               }
        }
    }
    return 0;
}

/*
#include<iostream>
#include <conio.h>
#include<cmath>

using namespace std;

int main()
{
    int a,b,c;

    cout<<"Process Started :"<<endl;
    for (a = 1; a<=1000; a++)
    {
        for (b = 1; b<=1000; b++)
        {
            for (c = 1; c<=1000; c++)
            {
                if ((int)pow(a,2) + (int)pow(b,2) == (int)pow(c,2) && ((a+b+c) ==1000))
                    cout<<"a=  "<<a<<" b=  "<<b<<" c=  "<<c<<endl;
            }
        }
    }
    getch();
}
*/
