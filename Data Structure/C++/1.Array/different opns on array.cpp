#include<iostream>
#include<cstdlib>
#include<conio.h>
#include<string>

using namespace std;

int insert_at_pos(int a[] ,int n,int item, int pos)
{
    int i;
    if(pos>n || pos<0) // Checking valid position or not
    {
        cout<<"Invalid Position\n";
        return n;
    }
    for(i=n-1;i>=pos;i--) // Shifting elements from left to right
    {
        a[i+1]=a[i];
    }

    a[pos] = item;
    return (n+1);
}

int delete_at_pos(int a[] ,int n,int item, int pos)
{
    int i;

    if(pos>n || pos<0)
    {
        cout<<"Invalid Position\n";
        return n;
    }

    cout<<"The Item at "<<pos<<" is deleted :  "<<a[pos]<<endl;

    for(i=pos;i<n-1;i++) // Shifting elements from right to left.
    {
        a[i]=a[i+1];
    }

    return (n-1);

}

void read_array(int a[] , int n)
{
    int i;

    for(i=0;i<n;i++)
    {
        cin>>a[i];
    }
}

void print_array(int a[] , int n)
{
    int i;

    for(i=0;i<n;i++)
    {
        cout<<a[i]<<"  ";
    }
    cout<<"\n";
}

int main()
{
    int choice,a[100],item,pos;
    int n=0;

    for(;;)
    {

        cout<<"1.Read array\n";
        cout<<"2.Print array\n";
        cout<<"3.Insert array at position\n";
        cout<<"4.Delete array at position\n";
        cout<<"5.Exit\n";

        cout<<"ENTER YOUR CHOICE\n";
        cin>>choice;

        system("cls");
        switch(choice)
        {

            case 1: cout<<"Enter the number of elements\n";
                    cin>>n;

                    cout<<"Enter "<<n<<" elements\n";

                    read_array(a,n);
                    break;

            case 2: if (n == 0)
                        cout<<"Array is empty\n";
                    else
                    {
                        cout<<"The element of arrays are :\n";
                        print_array(a,n);
                    }
                    break;

            case 3: cout<<"Enter the item to be inserted\n";
                    cin>>item;

                    cout<<"Enter the position of array where the item insert\n";
                    cin>>pos;
                    n=insert_at_pos(a,n,item,pos);
                    break;

            case 4: cout<<"Enter position to delete an element\n";
                    cin>>pos;

                    if (n == 0) // Check array is empty or not.
                        cout<<"Array is empty,First insert or read array\n";
                    else
                    n=delete_at_pos(a,n,item,pos);

                    break;

            default : exit(0);


        }

    }
}


