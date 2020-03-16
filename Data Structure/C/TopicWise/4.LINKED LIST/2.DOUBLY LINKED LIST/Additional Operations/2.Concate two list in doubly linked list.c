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

void display(NODE first)
{
    NODE CUR;

    if(first ==NULL)
    {
        printf("List is Empty\n");
        return;
    }

    CUR  = first;

    while(CUR!=NULL)
    {
        printf("%d  ",CUR->Info);
        CUR = CUR->Rlink;
    }

    printf("\n");
}




NODE insert_rear(NODE first)
{
    int item;
    printf("Enter the item  to be inserted\n");
    scanf("%d",&item);

    NODE temp,CUR;



    temp =getNODE();
    temp->Info = item;
    temp->Rlink =temp->Llink = NULL;

    if(first == NULL)
    {
        printf("%d is inserted\n",item);
        return temp;
    }

    printf("%d is inserted\n",item);

    CUR = first;

    while(CUR->Rlink!= NULL)
    {
        CUR = CUR->Rlink;
    }
    CUR->Rlink = temp;
    temp->Llink = CUR;

    return first;
}


NODE concate(NODE first,NODE second)
{

    NODE CUR;

    if(first == NULL) return second;
    if(second == NULL) return first;

    CUR = first;
    while(CUR->Rlink != NULL)
    {
        CUR=CUR->Rlink;
    }

    CUR->Rlink = second;
    CUR = second->Llink;

    return first;
}


void main()
{
    int choice;

    NODE first,second;
    first = second = NULL;

    for(;;)
    {
        printf("1.Insert item in first list\n2.Insert item in second list\n3.Concatenate first and second list\n4.Display\n5.Exit\n");
        printf("Enter your choice\n");
        scanf("%d",&choice);

        system("cls");

        switch(choice)
        {

        case 1:
            first = insert_rear(first);
            break;


        case 2:
            second = insert_rear(second);
            break;

        case 3:
            first = concate(first,second);
            display(first);
            first=second=NULL;
            break;

        case 4:
            display(first);
            display(second);
            break;


        case 5:
            exit(0);
        }
    }
}



