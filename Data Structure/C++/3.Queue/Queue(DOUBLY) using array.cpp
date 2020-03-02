#include<iostream>
#include<cstdlib>

#define m 10
using namespace std;


class Queue
{
    int r =-1,f=0;

    public :
        int que[m];
        int temp =0;
        void insert_rear();
        void delete_front();
        void insert_front();
        void delete_rear();
        void display();
        bool isEmpty();
        bool isFull();
};

bool Queue :: isFull()
{
    if(temp == m)
        return true;
    else
        return false;
}

bool Queue :: isEmpty()
{
    if(r == -1 || r<f)
        return true;
    else
        return false;
}

void Queue :: insert_rear()
{
    if(isFull())
    {
        cout<<"Queue is Full"<<endl;
        return;
    }

    int item;
    cout<<"Enter an item\n";
    cin>>item;

    que[++r] = item;
    temp++;
    cout<<item << " is inserted.\n";

}

void Queue :: insert_front()
{
    if(isFull())
    {
        cout<<"Queue is Full"<<endl;
        return;
    }

    int item;
    cout<<"Enter an item\n";
    cin>>item;

    temp++;
    que[--f] = item;
    cout<<item << " is inserted.\n";
}

void Queue :: delete_front()
{
    if(isEmpty())
    {
        cout<<"Queue is Empty"<<endl;
        return;
    }
    cout<<que[f]<<" is deleted."<<endl;
    ++f;
    temp--;

}

void Queue :: delete_rear()
{
    if(isEmpty())
    {
        cout<<"Queue is Empty"<<endl;
        return;
    }
    cout<<que[r]<<" is deleted."<<endl;
    --r;
    temp--;

}

void Queue :: display()
{
    if(isEmpty())
    {
        cout<<"Queue is Empty"<<endl;
        return;
    }
    for(int i=f;i<=r;i++)
    {
        cout<<que[i]<<"  ";
    }
    cout<<endl;
}


int main()
{
    int ch;
    Queue obj;

    while(1)
    {

        cout<<"1.Insert Rear\n2.Delete Front\n3.Insert Front\n4.Delete Rear\n5.Display\n6.Exit\nEnter your choice\n";
        cin>>ch;

        system("cls");
        switch(ch)
        {
            case 1:
                obj.insert_rear();
                break;

            case 2:
                obj.delete_front();
                break;

            case 3:
                obj.insert_front();
                break;

            case 4:
                obj.delete_rear();
                break;

            case 5:
                obj.display();
                break;

            case 6:
                cout<<"Exiting..."<<endl;
                exit(0);
        }
    }
}
