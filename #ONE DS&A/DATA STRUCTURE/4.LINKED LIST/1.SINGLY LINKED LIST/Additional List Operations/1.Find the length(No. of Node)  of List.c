#include<stdio.h>
#include<stdlib.h>
#include<malloc.h>

/*   <----- STACK USING SINGY LINKED LIST IMLEMENTATION ----->    */

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

/// Delete node at rear end
NODE delete_rear(NODE first)
{
    NODE PREV,CUR;

    // check node for the first time
    if(first == NULL)
    {
        printf("List is empty\n");
        return NULL;
    }

    // Delete, if there is only one node
    if(first->Link == NULL)
    {
        printf("Item is deleted = %d\n",first->Info);
        free(first);
        return NULL;
    }

    // Find the Last node of list
    PREV = NULL;
    CUR = first;

    while(CUR->Link != NULL)
    {
        PREV = CUR;
        CUR = CUR->Link;
    }

    // Make last node but one node as the last node
    PREV->Link = NULL;

    //Delete Last node
    printf("Item is deleted = %d\n",CUR->Info);
    free(CUR);
    return first;

}

/// Find no. of nodes in a list
int length_node(NODE first)
{
    NODE CUR;
    int count =0;

    if(first == NULL) return 0;

    CUR = first;
    while(CUR != NULL)
    {
        CUR = CUR->Link;
        count++;
    }

    return count;
}

void main()
{
    int item , choice,len;

    NODE first;
    first = NULL;

    for(;;)
    {
        printf("1.Insert item at Rear\n2.Delete item at Rear\n3.Display\n4.Find length of List\n5.Exit\n");
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
            first = delete_rear(first);
            break;

        case 3:
            display(first);
            break;

        case 4:
            len = length_node(first);
            printf("Length of List : %d\n",len);
            break;

        case 5:
            exit(0);
        }
    }
}

