#include<stdio.h>
#include<stdlib.h>
#include<malloc.h>


/// Linked List Definition
struct node
{
    int Info;
    struct node *Link;
};

typedef struct node* NODE;



/// Allocate memory for node
NODE getNODE()
{
    NODE a;

    a=(NODE)malloc(sizeof(struct node));

    if(a==NULL)
    {
        printf("Node creation Failed\n");
        exit(0);
    }

    return a;
}

/// Display List elements
void display(NODE first)
{
    NODE CUR;

    if(first == NULL)
    {
        printf("List is Empty\n");
        return;
    }

    printf("The Contents of List\n");

    CUR = first;

    while(CUR != NULL)
    {
        printf("%d  ",CUR->Info);
        CUR=CUR->Link;
    }
    printf("\n");

}

/// Insert elements at rear end
NODE insert_rear(int item,NODE first)
{
    NODE temp,CUR;

    // CREATE NODE
    temp = getNODE();
    temp->Info = item;
    temp->Link = NULL;

    // check node for the first time
    if(first == NULL)
    {
        return temp;
    }

    // Find address of the last node
    CUR = first;
    while(CUR->Link != NULL)
    {
        CUR= CUR->Link;
    }

    // Connecting node to the last node
    CUR->Link =temp;

    return first;// Do not return "temp" here as Padma Reddy Written in notes.
}

/*
// METHOD 1 :  Function to Merge two list or concatenate when lists are not sorted
NODE merge(NODE first,NODE second)
{
    if (!first)
        return second;
    if (!second)
        return first;

    // start with the linked list
    // whose head data is the least
    if (first->Info < second->Info) {
        first->Link = merge(first->Link, second);
        return first;
    }
    else {
        second->Link = merge(first, second->Link);
        return second;
    }

}
*/



// METHOD 2 : Function to Merge two list
NODE third = NULL;
void merge(NODE first,NODE second)
{

    NODE last;
    if(first->Info < second->Info)
    {
        third=last=first;
        first=first->Link;
        third->Link=NULL;
    }
    else
    {
        third=last=second;
        second=second->Link;
        third->Link=NULL;
    }

    while(first && second)
    {
        if(first->Info < second->Info)
    {
        last->Link=first;
        last=first;
        first=first->Link;
        last->Link=NULL;
    }
    else
    {
        last->Link=second;
        last=second;
        second=second->Link;
        last->Link=NULL;
    }

    }

    if(first) last->Link=first;
    if(second) last->Link=second;

}



void main()
{
    int item , choice;

    NODE first,second;
    first =second=NULL;

    for(;;)
    {
        printf("1.Insert in First List\n2.Insert in Second List\n3.Display\n4.Merge both sorted List\n5.Exit\n");
        printf("Enter your choice\n");
        scanf("%d",&choice);

        system("cls");

        switch(choice)
        {
        case 1:
            printf("Enter an item\n");
            scanf("%d",&item);
            first = insert_rear(item,first);
            break;

        case 2:
            printf("Enter an item\n");
            scanf("%d",&item);
            second = insert_rear(item,second);
            break;


        case 3:
            display(first);
            display(second);
            break;

        /* FOR METHOD 1 :
        case 4:
            third=merge(first,second);
            display(third);
            first=second=NULL;
            break;
        */
        case 4: // FOR METHOD 2 :
            merge(first,second);
            display(third);
            first=second=third=NULL;
            break;

        case 5:
            exit(0);
        }
    }
}



