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

    Rectangle *r1 = new Rectangle(); // Here, r1 and r2 are the two objects that created in HEAP.

    r1->length = 5;
    r1->breadth = 10;

    cout<<"Area is : "<<r1->area()<<endl;
    cout<<"Perimeter is : "<<r1->perimeter()<<endl;

    delete r1; // We have to deallocate the data of heap.
    return 0;
}

