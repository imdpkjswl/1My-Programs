#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<malloc.h>


struct node
{
    char name[20];
    char usn[15];
    char prog[10];
    char sem[10];
    char phone[12];

    struct node* Link;

};

typedef struct node* NODE;


/* Function to create node */
NODE getNODE()
{
    char name[20],usn[15],prog[10],sem[10],phone[12];

    NODE temp;
    temp = (NODE)malloc(sizeof(struct node));

    if(temp == NULL)
    {
        printf("Node Creation Failed\n");
        exit(0);
    }

    printf("Enter the name of student\n");
    scanf("%s",temp->name);
    printf("Enter the usn\n");
    scanf("%s",temp->usn);
    printf("Enter program\n");
    scanf("%s",temp->prog);
    printf("Enter the semester\n");
    scanf("%s",temp->sem);
    printf("Enter phone number\n");
    scanf("%s",temp->phone);

    return temp;
}




/* Function to insert student info at front end of list */
NODE insert_front(NODE first)
{
    NODE temp;

    temp = getNODE();
    temp->Link =NULL;

    if(first == NULL)
    {
        printf("Student detail inserted successfully\n");
        return temp;
    }

    temp->Link = first;
    printf("Student detail inserted successfully\n");

    return temp;
}

/* Function to insert student info at rear end of list */
NODE insert_rear(NODE first)
{

    NODE temp,CUR;

    temp = getNODE();
    temp->Link = NULL;

    if(first == NULL)
    {
        printf("Student detail inserted successfully\n");
        return temp;
    }

    CUR = first;
    while(CUR->Link != NULL)
    {
        CUR = CUR->Link;
    }

    CUR->Link=temp;

    printf("Student detail inserted successfully\n");

    return first;
}

/* Function to delete info at front */
NODE delete_front(NODE first)
{
    NODE second;

    if(first == NULL)
    {
        printf("Student database is Empty\n");
        return NULL;
    }

    if(first->Link == NULL)
    {
        printf("Name : %s data deleted\n",first->name);
        free(first);
        return NULL;
    }

    printf("Name : %s data deleted\n",first->name);
    second = first->Link;
    free(first);

    return second;
}

/* Function to delete info at rear */
NODE delete_rear(NODE first)
{
    NODE PREV,CUR;

    if(first == NULL)
    {
        printf("Student database is Empty\n");
        return NULL;
    }

    if(first->Link == NULL)
    {
        printf("Name : %s data deleted\n",first->name);
        free(first);
        return NULL;
    }

    CUR = first;
    while(CUR->Link != NULL)
    {
        PREV = CUR;
        CUR = CUR->Link;
    }

    printf("Name : %s data deleted\n",CUR->name);
    PREV->Link = NULL;
    free(CUR);

    return first;
}

/* Function to display the list */
void display(NODE first)
{
    NODE CUR;

    if(first == NULL)
    {
        printf("Student database is Empty\n");
        return;
    }

    printf("Students details are :\n");

    CUR = first;
    while(CUR != NULL)
    {
        printf("Name : %s \nUSN : %s\nPROGRAM : %s\nSEM : %s\nPHONE NO: %s\n",CUR->name,CUR->usn,CUR->prog,CUR->sem,CUR->phone);
        CUR=CUR->Link;
    }

    printf("\n");

}



void main()
{
    int choice;
    NODE first = NULL;

    for(;;)
    {
        printf("1.Display students info\n");
        printf("2.Insert student info at front\n");
        printf("3.Insert student info at rear\n");
        printf("4.Delete student info at front\n");
        printf("5.Delete student info at rear\n");
        printf("6.Exit\n");

        printf("Enter your choice\n");
        scanf("%d",&choice);

        system("cls");
        switch(choice)
        {
            case 1:
                display(first);
                break;

            case 2:
                first = insert_front(first);
                break;

            case 3:
                first = insert_rear(first);
                break;

            case 4:
                first = delete_front(first);
                break;

            case 5:
                first = delete_rear(first);
                break;

            case 6:
                exit(0);

        }
    }
}
