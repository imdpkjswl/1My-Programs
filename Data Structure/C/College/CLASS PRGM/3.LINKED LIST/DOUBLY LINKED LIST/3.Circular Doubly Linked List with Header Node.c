#include<stdio.h>
#include<stdlib.h>
#include<malloc.h>

struct node
{
    int Info;
    struct node  *Rlink,*Llink;

};

typedef struct node* NODE;

NODE getNODE()
{
    NODE ptr;

    ptr = (NODE)malloc(sizeof(struct node));

    if(ptr == NULL)
    {
        printf("Memory allocation failed\n");
        return NULL;
    }

    return ptr;
}

void display(NODE head)
{
    NODE CUR;

    if(head->Rlink ==head)
    {
        printf("List is Empty\n");
        return;
    }

    CUR  = head->Rlink;
    while(CUR!=head)
    {
        printf("%d  ",CUR->Info);
        CUR = CUR->Rlink;
    }

    printf("\n");
}

NODE insert_front(NODE head)
{
    int item;
    printf("Enter the item  to be inserted\n");
    scanf("%d",&item);

    NODE temp,first;

    temp =getNODE();
    temp->Info = item;


    first = head->Rlink;
    temp->Llink = head;
    head->Rlink = temp;

    temp->Rlink = first;
    first->Llink = temp;


    return head;

}


NODE insert_rear(NODE head)
{
    int item;
    printf("Enter the item  to be inserted\n");
    scanf("%d",&item);

    NODE temp,last;

    temp =getNODE();
    temp->Info = item;

    last=head->Llink;

    last->Rlink=temp;
    temp->Llink=last;
    temp->Rlink=head;
    head->Llink=temp;

    return head;

}



NODE delete_front(NODE head)
{
    NODE first,second;

    if(head==NULL ||head->Rlink == head )
    {
        printf("List is Empty\n");
        return NULL;
    }

    first = head->Rlink;
    second=first->Rlink;
    head->Rlink=second;
    second->Llink=head;

    printf("%d is deleted\n",first->Info);
    free(first);

    return head;
}


NODE delete_rear(NODE head)
{
    NODE CUR,last;

    if(head==NULL || head->Rlink == head)
    {
        printf("List is Empty\n");
        return head;
    }

    last=head->Llink;
    CUR=last->Llink;
    CUR->Rlink=head;
    head->Llink=CUR;

    printf("%d is deleted\n",last->Info);
    free(last);

    return head;

}

void main()
{
    int choice;


    NODE head;
    head = getNODE();
    head->Rlink=head->Llink = head; // Empty list

    for(;;)
    {
        printf("1.Insert item at front\n2.Insert item at rear\n3.Delete item at Front\n4.Delete item at rear\n5.Display\n6.Exit\n");
        printf("Enter your choice\n");
        scanf("%d",&choice);

        system("cls");

        switch(choice)
        {
        case 1:
            head = insert_front(head);
            break;

        case 2:
            head = insert_rear(head);
            break;


        case 3:
            head = delete_front(head);
            break;

        case 4:
            head = delete_rear(head);
            break;

        case 5:
            display(head);
            break;


        case 6:
            exit(0);
        }
    }
}



