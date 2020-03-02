#include<stdio.h>
#include<stdlib.h>

struct node
{
int data;
struct node *next;
};

typedef struct node* NODE;


NODE first=NULL;


void create(int arr[],int n)
{
    int i;

    NODE temp,last;
    first=(NODE)malloc(sizeof(struct node));
    first->data=arr[0];
    first->next=NULL;
    last=first;

    for(i=1;i<n;i++)
    {
        temp=(NODE)malloc(sizeof(struct node));
        temp->data=arr[i];
        temp->next=NULL;
        last->next=temp;
        last=temp;
    }
}

// Function to detect loop and length of loop.
int isLoop(NODE first)
{

    int count =0;
    NODE p,q;
    p=q=first;

    do
    {
        p=p->next;
        q=q->next;
        count++; // counting length of loop.
        //q=q?q->next:q; // Ternary statement,as written below:

        if(q!=NULL)
            q=q->next;
        else
            q=q;
    }while(p && q && p!=q);


    if(p==q)
        return count; // Loop found
    else
        return 0; // Loop not found during matching.

}


void main()
{
    NODE t1,t2,temp;
    int arr[]={10,20,30,40,50};

    create(arr,5);
    t1=first->next->next;
    t2=first->next->next->next->next;
    t2->next=t1; /// Here 50 pointing to 30,i.e. it is a Loop.


    temp=isLoop(first);
    if(temp==0) // check for loop,0 shows loop not found.
        printf("Linked list not contain Loop\n");
    else
        printf("Linked list contain Loop\nLength of Loop is : %d\n",temp);

    return;

}
