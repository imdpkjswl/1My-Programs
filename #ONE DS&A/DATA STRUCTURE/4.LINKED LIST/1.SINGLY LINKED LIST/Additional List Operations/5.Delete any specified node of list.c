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


NODE delete_specific(int item,NODE first)
{
    NODE PREV,CUR,second;


    PREV = NULL;

    if(first == NULL)
    {
        printf("List is Empty\n");
        return NULL;
    }

    /*Search for item in list */
    CUR = first;
    while(CUR != NULL)
    {
        if(item == CUR->Info) break;
        PREV = CUR;
        CUR = CUR->Link;

    }

    if(CUR == NULL)
    {
        printf("Item not found\n");
        return first;
    }

    printf("%d is deleted successfully\n",item);
    /* Delete the first node ,if item present at first place */
    if(item == first->Info)
    {
        second= first->Link;
        free(first);
        return second;
    }

    /* Delete node in middle or at end of list */
    PREV->Link = CUR->Link;
    free(CUR);
    return first;

}


void main()
{
    int item , choice;

    NODE first;
    first =NULL;

    for(;;)
    {
        printf("1.Insert into List\n2.Display List\n3.Delete any node in a List\n4.Exit\n");
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
            display(first);
            break;

        case 3:
            printf("Enter the item\n");
            scanf("%d",&item);
            first=delete_specific(item,first);
            break;

        case 4:
            exit(0);
        }
    }
}





