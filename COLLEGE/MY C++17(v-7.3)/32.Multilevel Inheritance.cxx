/*
C++ Multi Level Inheritance:
        A
        ^
        |
        B
        ^
        |
        C
When one class inherits another class which is further inherited by another class, it
is known as multi level inheritance in C++. Inheritance is transitive so the last derived
class acquires all the members of all its base classes.
*/

#include <iostream>
using namespace std;


class Animal
{
    public:
        void eat()
        {
            cout<<"Eating..."<<endl;
        }
};


class Dog: public Animal
{
    public:
        void bark()
        {
            cout<<"Barking..."<<endl;
        }
};


class BabyDog: public Dog
{
    public:
        void weep()
        {
            cout<<"Weeping...";
        }
};


int main()
{

        BabyDog a;

        a.eat();
        a.bark();
        a.weep();

        return 0;
}
