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

/* // FIRST METHOD
void test_sort(NODE first)
{
    int PREV= -32768; // Taking any minimum value initially(i.e. 2 Byte integer).
    int count1=0,count2=0;

    NODE CUR;

    CUR=first;
    while(CUR != NULL)
    {
        count1++;
        CUR = CUR->Link;
    }

    CUR=first;
    while(CUR != NULL)
    {
        /// Tracing Ascending order list
        if(CUR->Info <PREV) break;
        PREV =CUR->Info;
        CUR = CUR->Link;
        count2++;
    }

    if(count1 == count2)
    {
        printf("The Linked Lists are Sorted\n");
    }
    else
    {
        printf("The Linked Lists are not Sorted\n");
    }

    return;

}
*/

int test_sort(NODE first)
{
    int PREV= -32768; // Taking any minimum value initially(i.e. 2 Byte integer).

    NODE CUR;


    CUR=first;
    while(CUR != NULL)
    {
        /// Tracing Ascending order list
        if(CUR->Info <PREV) return 1; // Check failure.
        PREV =CUR->Info; // Assigning the next value for comparing.
        CUR = CUR->Link; // Increasing the current value.
    }

    return 0;
}


void main()
{
    int item , choice,check=0;

    printf("             <----- CHECK WHETHER THE LINKED LIST IS SORTED or NOT -SINGY LINKED LIST IMLEMENTATION -----> \n");

    NODE first;
    first = NULL;

    for(;;)
    {
        printf("1.Insert item at Rear\n2.Delete item at Front\n3.Display\n4.Check whether the list is sorted or not\n5.Exit\n");
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
            //test_sort(first); FOR FIRST METHOD
            check = test_sort(first); // FOR SECOND METHOD
            if(check==0)
                printf("The Linked Lists are Sorted\n");
            else
                printf("The Linked Lists are not Sorted\n");
            break;

        case 5:
            exit(0);
        }
    }
}




