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

/*
This may look a simple problem but not, it has following cases to be handled.WHERE x and y are two item present in the linked list.
1) x and y may or may not be adjacent.
2) Either x or y may be a head node.
3) Either x or y may be last node.
4) x and/or y may not be present in linked list.
*/
NODE swap_node(NODE first)
{
    int item1,item2,count=0;
    printf("Enter Two Nodes value to swap them\n");
    scanf("%d %d",&item1,&item2);

    NODE PREVx,CURx;

    // Check existence of item1
    PREVx = NULL;
    CURx=first;
    while(CURx!=NULL)
    {
        if(item1 == CURx->Info)
        {
            count=1;
            break;
        }
        PREVx = CURx;
        CURx=CURx->Link;
    }
    if(count==0)
    {
        printf("%d item not found\n",item1);
        return first;
    }


    NODE PREVy,CURy;

    // Check existence of item2
    count=0;
    PREVy = NULL;
    CURy=first;
    while(CURy!=NULL)
    {
        if(item2 == CURy->Info)
        {
            count=1;
            break;
        }
        PREVy = CURy;
        CURy=CURy->Link;
    }
    if(count==0)
    {
        printf("%d item not found\n",item2);
        return first;
    }


    // If x is not head of linked list
    if (PREVx != NULL)
        PREVx->Link = CURy;
    else // Else make y as new head
        first = CURy;

    // If y is not head of linked list
    if (PREVy != NULL)
        PREVy->Link = CURx;
    else // Else make x as new head
        first = CURx;

    NODE temp;
    // Swap next pointers
    temp = CURy->Link;
    CURy->Link = CURx->Link;
    CURx->Link = temp;

    return first;

}


void main()
{
    int item , choice;

    NODE first;
    first = NULL;

    for(;;)
    {
        printf("1.Insert item at Rear\n2.Delete item at Front\n3.Display\n4.SWAP TWO NODE\n5.Exit\n");
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
            first=swap_node(first);
            break;


        case 5:
            exit(0);
        }
    }
}


