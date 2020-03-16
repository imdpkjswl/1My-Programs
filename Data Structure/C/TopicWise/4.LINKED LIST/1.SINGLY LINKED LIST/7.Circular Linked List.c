#include<stdio.h>
#include<stdlib.h>

struct node
{
    int Info;

    struct node* Link;
};

typedef struct node* NODE;

NODE getNODE()
{
    NODE ptr;

    ptr = (NODE)malloc(sizeof(struct node));

    if(!ptr)
    {
        printf("Node Creation Failed\n");
        exit(0);
    }

    return ptr;
}

void display(NODE last)  // Assume starting node is last.
{
    NODE CUR;

    if(last == NULL)
    {
        printf("List is Empty\n");
        return;
    }
    printf("Contents of List are : \n");

    CUR = last->Link; // CUR contain address of first node.

    while( CUR!= last)
    {
        printf("%d  ",CUR->Info);
        CUR=CUR->Link;
    }

    printf("%d\n",CUR->Info); // Last node data.

}


NODE insert_front(int item,NODE last)
{
    NODE temp;

    temp = getNODE();
    temp->Info = item;
    temp->Link =temp; // For only one node

    if(last == NULL)
        return temp;
    else
        temp->Link=last->Link;

    last->Link = temp;

    return last;

}

NODE insert_rear(int item ,NODE last)
{
    NODE temp,first;

    temp = getNODE();
    temp->Info=item;
    temp->Link = temp;

    if(last == NULL) return temp;

    first=last->Link;
    last->Link=temp;
    temp->Link=first;

    return temp;

}

NODE delete_front(NODE last)
{
    NODE first,second;

    if(last==NULL)
    {
        printf("List is Empty\n");
        return NULL;
    }

    // First node only

    if(last->Link == last)
    {
        printf("%d is deleted\n",last->Info);
        free(last);
        return NULL;
    }

    first=last->Link;
    second=first->Link;
    last->Link =second;

    printf("%d is deleted\n",first->Info);
    free(first);

    return second;

}

NODE delete_rear(NODE last)
{
    NODE CUR;

    if(last==NULL)
    {
        printf("List is Empty\n");
        return NULL;
    }

    // First node only

    if(last->Link == last)
    {
        printf("%d is deleted\n",last->Info);
        free(last);
        return NULL;
    }

    CUR=last->Link;
    while(CUR->Link!=last)
    {
        CUR = CUR->Link;
    }

    CUR->Link = last->Link;
    printf("%d is deleted\n",last->Info);
    free(last);

    return CUR;

}

void main()
{
    int item , choice;

    NODE last;
    last = NULL;

    for(;;)
    {
        printf("1.Insert item at Rear\n2.Insert item at Front\n3.Delete item at Rear\n4.Delete item at Front\n5.Display\n6.Exit\n");
        printf("Enter your choice\n");
        scanf("%d",&choice);

        system("cls");

        switch(choice)
        {
        case 1:
            printf("Enter an item\n");
            scanf("%d",&item);
            last = insert_rear(item,last);
            break;

        case 2:
            printf("Enter an item\n");
            scanf("%d",&item);
            last = insert_front(item,last);
            break;

        case 3:
            last = delete_rear(last);
            break;

        case 4:
            last = delete_front(last);
            break;

        case 5:
            display(last);
            break;

        case 6 :
            exit(0);
        }
    }
}

