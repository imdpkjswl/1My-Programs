#include<stdio.h>
#include<stdlib.h>
#include<malloc.h>

/*   <----- INSERT IN SORTED LIST AT SORTED POSITION -SINGY LINKED LIST IMLEMENTATION ----->    */

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

/// Delete node at front end
NODE delete_front(NODE first)
{
    NODE second;

    // check node for the first time
    if(first == NULL)
    {
        printf("List is empty\n");
        return NULL;
    }

    // Delete, if there is only one node
    if(first->Link == NULL)
    {
        printf("Item deleted = %d\n",first->Info);
        free(first);
        return NULL;
    }

    // Obtain the address of the second node
        printf("Item deleted = %d\n",first->Info);
        second = first->Link;
        free(first);
        return second;
}


NODE insert_at_sort(NODE first)
{
    int item;
    printf("Enter an item\n");
    scanf("%d",&item);

    NODE temp,PREV,CUR;

    // CREATE A NEW NODE
    temp = getNODE();
    temp->Info=item;
    temp->Link=NULL; // NO NEED TO WRITE,IF MORE THAN ONE NODES ARE AVAILABLE

    PREV=NULL;
    CUR=first;
    while(CUR!=NULL)
    {
        if(item < CUR->Info) break;
        PREV = CUR;
        CUR = CUR->Link;
    }

    PREV->Link=temp;
    temp->Link=CUR;

    return first;


}


void main()
{
    int item , choice;

    NODE first;
    first = NULL;

    for(;;)
    {
        printf("1.Insert item at Rear\n2.Delete item at Front\n3.Display\n4.Insert in sorted list at sorted place\n5.Exit\n");
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
            first = delete_front(first);
            break;

        case 3:
            display(first);
            break;

        case 4:
            first = insert_at_sort(first);
            break;

        case 5:
            exit(0);
        }
    }
}



