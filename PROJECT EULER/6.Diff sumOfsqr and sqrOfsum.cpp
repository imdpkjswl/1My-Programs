/*
The sum of the squares of the first ten natural numbers is,
12+22+...+102=385
The square of the sum of the first ten natural numbers is,
(1+2+...+10)2=552=3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025−385=2640.
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

#include<iostream>

using namespace std;

int sumofsquare()
{
    int n=100,sum=0;

    for(int i=1;i<=n;i++)
    {
        sum += i*i;
    }

    return sum;
}

int squareofsum()
{
    int i,n=100,sum=0;

    for(i=1;i<=n;i++)
    {
        sum +=i;
    }

    sum = sum*sum;

    return sum;
}

int diff(int d1,int d2)
{
    int d;
    d=d2-d1;
    return d;
}


int main()
{
    int s1,s2,res;

    s1 = sumofsquare();
    s2 = squareofsum();
    res = diff(s1,s2);
    cout<<"Difference between the sum of the squares of the first one hundred natural numbers and the square of the sum : ";
    cout<<res<<endl;

    return 0;

}
