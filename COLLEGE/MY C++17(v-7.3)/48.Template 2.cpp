#include<iostream>
using namespace std;

template <class type>
/// The below class is known as Generic Class because we have used template class inside the class .
class ArrayList
{
    private:
        struct ControlBlock
        {
            int capacity;
            type *arr_ptr;
        };
        ControlBlock *s;

    public:
        ArrayList(int capacity)
        {
            s = new ControlBlock;
            s->capacity = capacity;
            s->arr_ptr = new type[s->capacity];
        }

    void addElement(int index,type data)
    {
        if(index>=0 && index<=s->capacity-1)
            s->arr_ptr[index] = data;
        else
            cout<<"\nArray index is not valid."<<endl;
    }


    void viewList()
    {
        int i;
        for(i=0;i<s->capacity;i++)
            cout<<s->arr_ptr[i]<<endl;
    }


};


int main()
{

    ArrayList <double> list1(4);

    list1.addElement(0,1.2);
    list1.addElement(1,1.6);
    list1.addElement(2,2.0);
    list1.addElement(3,2.5);

    list1.viewList();

    return 0;
}


/*
class ArrayList
{
    private:
        struct ControlBlock
        {
            int capacity;
            int *arr_ptr;
        };
        ControlBlock *s;

    public:
        ArrayList(int capacity)
        {
            s = new ControlBlock;
            s->capacity = capacity;
            s->arr_ptr = new int[s->capacity];
        }

    void addElement(int index,int data)
    {
        if(index>=0 && index<=s->capacity-1)
            s->arr_ptr[index] = data;
        else
            cout<<"\nArray index is not valid."<<endl;
    }


    void viewList()
    {
        int i;
        for(i=0;i<s->capacity;i++)
            cout<<" "<<s->arr_ptr[i];
    }


};


int main()
{

    ArrayList list1(4);

    list1.addElement(0,12);
    list1.addElement(1,16);
    list1.addElement(2,20);
    list1.addElement(3,25);

    list1.viewList();

    return 0;
}
*/
