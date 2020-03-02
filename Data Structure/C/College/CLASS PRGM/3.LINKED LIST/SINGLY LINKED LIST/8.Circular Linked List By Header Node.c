#include<stdio.h>
#include<stdlib.h>
#include<malloc.h>

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

    /*
    if(ptr==NULL)
    {
        printf("Node Creation Failed\n");
        exit(0);
    }
    */

    return ptr;
}


void display(NODE head)  // Assume starting node is last.
{
    NODE CUR;

    if(head->Link == head)
    {
        printf("List is Empty\n");
        return;
    }
    printf("Contents of List are : \n");

    CUR = head->Link; // CUR contain address of first node.

    while( CUR!= head)
    {
        printf("%d  ",CUR->Info);
        CUR=CUR->Link;
    }

    printf("\n");

    return;

}


NODE insert_front(int item,NODE head)
{
    NODE temp;

    temp = getNODE();
    temp->Info = item;

    temp->Link = head->Link;
    head->Link=temp;

    return head;

}

NODE insert_rear(int item ,NODE head)
{
    NODE temp,CUR;

    temp = getNODE();
    temp->Info=item;

    CUR=head->Link;
    while(CUR->Link !=head)
    {
        CUR=CUR->Link;
    }

    CUR->Link =temp;
    temp->Link = head;

    return head;

}

NODE delete_front(NODE head)
{
    NODE CUR,PREV;

    if(head->Link==head)
    {
        printf("List is Empty\n");
        return NULL;
    }

    CUR=head->Link;
    PREV=CUR->Link;

    head->Link = PREV;

    printf("%d is deleted\n",CUR->Info);
    free(CUR);

    return head;
}

NODE delete_rear(NODE head)
{
    NODE CUR,PREV;

    if(head->Link==head)
    {
        printf("List is Empty\n");
        return NULL;
    }

    CUR=head;

    while(CUR->Link!=head)
    {
        PREV=CUR;
        CUR=CUR->Link;
    }

    PREV->Link =head;
    printf("%d is deleted\n",CUR->Info);
    free(CUR);

    return head;
}

void main()
{
    int item , choice;

    NODE head;
    head=getNODE();
    head->Link =head; // Empty node

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
            head = insert_rear(item,head);
            break;

        case 2:
            printf("Enter an item\n");
            scanf("%d",&item);
            head = insert_front(item,head);
            break;

        case 3:
            head = delete_rear(head);
            break;

        case 4:
            head = delete_front(head);
            break;

        case 5:
            display(head);
            break;

        case 6 :
            exit(0);
        }
    }
}

