// sort algorithm example
#include <iostream>     // std::cout
#include <algorithm>    // std::sort

#include<cstdlib> // for clear screen

using namespace std;

#define m 10
class stack
{
    int top=-1;

    public:
        int arr[m];

        void push();
        bool isFull();
        void pop();
        bool isEmpty();
        void display();
        void sort_stack();
};


void stack :: sort_stack()
{
    if(isEmpty())
    {cout<<"Stack is Empty\n"<<endl;
        return;}

        int temp;

    /// Used bubble sort
    for(int i=1;i<=top+1;i++)
    {
        for(int j=0;j<top-i+1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                temp =arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }

    cout<<"The sorted stack is : "<<endl;

}


bool stack :: isEmpty()
{
    if(top == -1)
        return true;
    else
        return false;
}


bool stack :: isFull()
{
    if(top == m -1)
        return true;
    else
        return false;
}

void stack :: push()
{
    int item;
    if(isFull())
    {
        cout<<"Stack is Overflow\n";
        return;
    }
    cout<<"Enter an item\n";
    cin>>item;

    arr[++top] = item;
    cout<<item <<" is inserted"<<endl;
}

void stack :: pop()
{
    if(isEmpty())
    {
        cout<<"Stack is UnderFlow\n";
        return;
    }
    cout<<arr[top--]<<" is popped"<<endl;
}

void stack :: display()
{

    if(isEmpty())
    {
        cout<<"Stack is UnderFlow\n";
        return;
    }

    for(int i=0;i<=top;i++)
    {
        cout<<arr[i]<<"  ";
    }
    cout<<endl;

}


int main()
{
    stack obj;
    int ch;

    do
    {
        cout<<"1.Push\n2.Pop\n3.Traverse\n4.Sort stack\n5.Exit\nEnter your choice\n";
        cin>>ch;

        system("cls");

        switch(ch)
        {
            case 1:
                obj.push();
                break;

            case 2:
                obj.pop();
                break;

            case 3:
                obj.display();
                break;

            case 4:
                obj.sort_stack();
                obj.display();
                break;

            case 5:
                cout<<"Exiting..."<<endl;
                break;

            default:
                cout<<"Enter the correct input"<<endl;
        }

        } while(ch!=5);

}

