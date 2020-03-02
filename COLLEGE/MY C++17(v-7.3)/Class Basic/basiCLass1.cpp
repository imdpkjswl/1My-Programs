#include<iostream>
#include<cstdio>
#include<cstdlib>

using namespace std;

class Rectangle
{
    public:
        int length;
        int breadth;

    int area()
    {
        return (length*breadth);
    }

    int perimeter()
    {
        return 2*(length+breadth);
    }

} ;

int main()
{

    Rectangle r1,r2; // Here, r1 and r2 are the two objects(entities).

    r1.length = 5;
    r1.breadth = 12;

    cout<<"Area is : "<<r1.area()<<endl;
    cout<<"Perimeter is : "<<r1.perimeter()<<endl;

    r2.length = 4;
    r2.breadth = 8;

    cout<<"Area is : "<<r2.area()<<endl;
    cout<<"Perimeter is : "<<r2.perimeter()<<endl;
}
