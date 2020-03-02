/*
 *** Write a program to insert an elements into stack and reversed it
     by using another stack and again put the reversed stack elements
     into the first stack.
*/

#include<iostream>
#include<cstdlib>

using namespace std;

int main(void)
{
    int item,n,i,top1=-1,top2=-1;

    cout<<"Enter the number of elements"<<endl;
    cin>>n;

    int st1[n],st2[n];

    for(i=0;i<n;i++)
    {
        cin>>item;
        st1[++top1] = st2[++top2] = item;
    }

    for(i=0;i<=top2;i++)
    {
        st1[top1--] = st2[i]; // Copying the second stack values into first stack values.
    }

    cout<<"Reverse stack is :"<<endl;
    for(i=0;i<n;i++)
    {
        cout<<st1[i]<<"  ";
    }

}
