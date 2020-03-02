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




NODE insert_after(NODE first)
{
    int item,ref;
    printf("Enter the item  to be inserted\n");
    scanf("%d",&item);
    printf("Enter the reference item\n");
    scanf("%d",&ref);

    NODE temp,PREV,CUR;


    temp =getNODE();
    temp->Info = item;

    if(first == NULL)
    {
        printf("List is Empty,First insert something\n");
        return first;
    }


    // If reference item present at last node
        CUR = first;
        while(CUR!= NULL)
        {
            if(ref == CUR->Info) break;  // Ref found at prev node
            CUR = CUR->Rlink;
        }

        if(CUR == NULL)
        {
            printf("Reference item not found\n");
            return first;
        }

    if(ref == CUR->Info)
    {
        if(CUR->Rlink == NULL)
        {
            printf("%d is inserted\n",item);
            temp->Rlink = NULL;
            temp->Llink = CUR;
            CUR->Rlink = temp;

            return first;

        }

    }


    // If reference item present before last node
    CUR = first;
    while(CUR!= NULL)
    {
        if(ref == PREV->Info) break;  // Ref found at prev node
        PREV = CUR;
        CUR = CUR->Rlink;
    }

    if(CUR == NULL)
    {
        printf("Reference item not found\n");
        return first;
    }


    temp->Rlink = CUR;
    CUR->Llink = temp;

    PREV->Rlink = temp;
    temp->Llink = PREV;

    return first;


}





void main()
{
    int choice;

    NODE first;
    first = NULL;

    for(;;)
    {
        printf("1.Insert item at rear\n2.Delete item at Front\n3.Display\n4.Insert item after given reference node\n5.Exit\n");
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
            first = insert_after(first);
            break;

        case 5:
            exit(0);
        }
    }
}



