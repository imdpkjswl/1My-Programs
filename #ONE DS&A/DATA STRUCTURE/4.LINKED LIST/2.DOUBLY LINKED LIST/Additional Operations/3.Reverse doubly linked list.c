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

void reverse(NODE first)
{
    if(first ==NULL)
    {
        printf("List is Empty\n");
        return NULL;
    }


    NODE temp,CUR,last;

    CUR = first;
    while(CUR != NULL)
    {
        /*
         * Swap the previous and next address fields of current node
         */
        temp = CUR->Rlink;
        CUR->Rlink = CUR->Llink;
        CUR->Llink = temp;

        /* Move the current pointer to next node which is stored in temp */
        CUR = temp;
    }

    /*
     * Swap the head and last pointers
     */
    temp = first;
    first = last;
    last = temp;

    printf("LIST REVERSED SUCCESSFULLY\n");

}




void main()
{
    int choice;

    NODE first;
    first = NULL;

    for(;;)
    {
        printf("1.Insert item at rear\n2.Delete item at Front\n3.Display\n4.Reverse the list\n5.Exit\n");
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
            reverse(first);
            display(first);
            break;

        case 5:
            exit(0);
        }
    }
}



