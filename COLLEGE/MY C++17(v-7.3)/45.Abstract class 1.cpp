/* A do nothing function is called Pure virtual function.
 * RULE 1: If a class containing do nothing function(f=0),web can't create object of that class.
 * RULE 2: For accessing data and member function of base class ,we have to inherit base class as well have to be override do nothing function in sub class.

 * DEFINITION: A class containing at least one pure virtual function is called Abstract class.
 */

 #include<iostream>
 #include<conio.h>

 using namespace std;

 class person
 {

    public:
        virtual void fun()=0; // Late binding

        void f1()
        {
            cout<<"Parent class function"<<endl;
        }

 };


 class student : public person
 {
    public :
        void fun()  // Early binding
        {
            cout<<"Child class function"<<endl;
        }
 };

 int main()
 {
    //person object; Not allowed
    // General way to call
    person *p;
    student obj;
    p = &obj;

    /// Another way to call
    person *pointer_object = new student();
    pointer_object->fun();

    return 0;
 }
