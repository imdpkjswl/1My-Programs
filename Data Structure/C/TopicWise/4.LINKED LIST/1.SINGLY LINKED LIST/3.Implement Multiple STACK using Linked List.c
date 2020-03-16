#include<stdio.h>
#include<stdlib.h>
#include<malloc.h>

/*   <----- MULTIPLE QUEUE USING SINGY LINKED LIST IMLEMENTATION ----->    */

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

void main()
{
    int item , choice , n , i;

    NODE a[5];

    printf("Total stack are available 5\n");
    for(i=0;i<5;i++)
    {
        a[i] = NULL;
    }

    for(;;)
    {
        printf("1.Insert item at Rear\n2.Delete item at Rear\n3.Display\n4.Exit\n");
        printf("Enter your choice\n");
        scanf("%d",&choice);


        system("cls");

        switch(choice)
        {
        case 1:
            printf("Enter Stack Number\n");
            scanf("%d",&n);
            n=n-1;// Decrement in n to show stack number 1...5

            if(n<0 || n>4)
            {
                printf("Invalid option chosen,Max Size of Linked list is 5\n");
                continue;
            }
            printf("Enter an item\n");
            scanf("%d",&item);
            a[n] = insert_rear(item,a[n]);
            break;

        case 2:
            printf("Enter Stack Number\n");
            scanf("%d",&n);
            n=n-1;
            if(n<0 || n>4)
            {
                printf("Invalid option chosen,Max Size of Linked list is 5.\n");
                continue;
            }
            a[n] = delete_rear(a[n]);
            break;

        case 3:
            printf("The Contents of List :\n\n");
            for(i=0;i<5;i++)
            {
                printf("Stack[%d] =  ",(i+1));
                display(a[i]);
                printf("\n");
            }
            break;

        case 4:
            exit(0);
        }
    }
}


