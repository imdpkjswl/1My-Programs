#include<stdio.h>
#include<stdlib.h>

struct employee
{
    char ssn[50];
    char name[50];
    char dep[50];
    char des[50];
    char phone[50];
    int salary[50];

    struct node *Rlink,*Llink;

};

typedef struct employee*  NODE;


NODE getNODE()
{

    NODE temp;

    char ssn[50];
    char name[50];
    char dep[50];
    char des[50];
    char phone[50];
    char salary[50];

    temp = (NODE)malloc(sizeof(struct employee));

    if(temp==NULL)
    {
        printf("Memory allocation Failed\n");
        return NULL;
    }

    printf("Enter SSN of employee\n");
    scanf("%s",temp->ssn);
    printf("Enter Name of employee\n");
    scanf("%s",temp->name);
    printf("Enter department of employee\n");
    scanf("%s",temp->dep);
    printf("Enter designation of employee\n");
    scanf("%s",temp->des);
    printf("Enter PhoneNo of employee\n");
    scanf("%s",temp->phone);
    printf("Enter salary of employee\n");
    scanf("%s",temp->salary);

    return temp;
}


NODE insert_front(NODE first)
{
    NODE temp;

    temp = getNODE();
    temp->Rlink=temp->Llink = NULL;

    if(first == NULL)
        return temp;

    temp->Rlink = first;
    temp->Llink =NULL;

    return temp;

}

NODE insert_rear(NODE first)
{

    NODE temp,CUR;

    temp = getNODE();
    temp->Rlink =temp->Llink = NULL;

    if(first == NULL)
        return temp;

    CUR = first;
    while(CUR->Rlink!= NULL)
    {
        CUR = CUR->Rlink;
    }

    CUR->Rlink = temp;
    temp->Llink = CUR;
    temp->Rlink =NULL;

    return first;

}


NODE delete_front(NODE first)
{
    NODE second;

    if(first == NULL)
    {
        printf("Employee data is empty\n");
        return NULL;
    }

    second = first->Rlink;
    first->Llink = NULL;
    free(first);

    return second;
}

NODE delete_rear(NODE first)
{
    NODE CUR,PREV;

    if(first ==NULL)
    {
        printf("Employee data is empty\n");
        return NULL;
    }

    if(first->Rlink == NULL)
    {
        //printf("%d is deleted\n",first->Info);
        free(first);
        return NULL;
    }

    CUR = first;
    while( CUR->Rlink != NULL )
    {
        PREV =CUR;
        CUR= CUR->Rlink;
    }

    PREV->Rlink = NULL;
    free(CUR);

    return first;
}

void display(NODE first)
{

    NODE CUR;

    if(first == NULL)
    {
        printf("Employee data is empty\n");
        return;
    }

    printf("SSN\tName\tDepartment\tDesignation\tPhone\tSalary\n");
    CUR=first;
    while(CUR!=NULL)
    {
        printf("%s\t%s\t %s\t  %s\t   %s\t    %s\n",CUR->ssn,CUR->name,CUR->dep,CUR->des,CUR->phone,CUR->salary);
        CUR=CUR->Rlink;
    }

    printf("\n\n");
}


void main()
{
    NODE first=NULL;

    int choice;


    for(;;)
    {
        printf("1.Insert front\n2.Insert Rear\n3.Delete front\n4.Delete rear\n5.Display\n6.Exit\n");
        printf("Enter your choice\n");
        scanf("%d",&choice);

        system("cls");
        switch(choice)
        {

            case 1:
                first = insert_front(first);
                break;

            case 2:
                first = insert_rear(first);
                break;

            case 3:
                first=delete_front(first);
                break;

            case 4:
                first=delete_rear(first);
                break;

            case 5:
                display(first);
                break;

            case 6:
                exit(0);
        }
    }
}
