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



NODE delete_front(NODE first)
{
    NODE CUR;

    if(first == NULL)
    {
        printf("List is Empty\n");
        return NULL;
    }

    if(first->Rlink == NULL)
    {
        printf("%d is deleted\n",first->Info);
        free(first);
        return NULL;
    }

    printf("%d is deleted\n",first->Info);
    CUR = first->Rlink;
    free(first);

    return CUR;
}


NODE delete_specific(NODE first)
{
    int item;
    printf("Enter the item to be deleted\n");
    scanf("%d",&item);



    NODE second,PREV,CUR;

    if(first == NULL)
    {
        printf("List is Empty\n");
        return NULL;
    }

    // If item present at first node
    if(item == first->Info)
    {
        printf("%d is deleted\n",item);
        second = first->Rlink;
        second->Llink = NULL;
        free(first);

        return second;

    }


    //1. If item present in-between first and last node
    CUR = first;
    while(CUR!=NULL)
    {
        if(item == CUR->Info) break;
        PREV = CUR;
        CUR = CUR->Rlink;
    }


    // Checking for last node
    if(CUR->Rlink == NULL)
    {
        // Check item present at last node or not
        if(item == CUR->Info)
        {
            PREV->Rlink = NULL;
            free(CUR);

            return first;
        }

    }



    //2. If item present in between first and last
    if(item == CUR->Info)
    {
        PREV->Rlink = CUR->Rlink;
        CUR->Rlink->Llink = PREV;

        printf("%d is deleted\n",CUR->Info);
        free(CUR);
        return first;
    }

    /* Only This code is not working */
    printf("%d is not found\n",item);
    return first;
}



void main()
{
    int choice;

    NODE first;
    first = NULL;

    for(;;)
    {
        printf("1.Insert item at rear\n2.Delete item at Front\n3.Display\n4.Delete any Specific node\n5.Exit\n");
        printf("Enter your choice\n");
        scanf("%d",&choice);

        system("cls");

        switch(choice)
        {

        case 1:
            first = insert_rear(first);
            break;


        case 2:
            first = delete_front(first);
            break;


        case 3:
            display(first);
            break;


        case 4:
            first = delete_specific(first);
            break;

        case 5:
            exit(0);
        }
    }
}



