#include<stdio.h>
#include<stdlib.h>
/// Not Working Properly....

struct node
{
    int info;
    struct node *prev , *next;

};

struct node* start = NULL;

void insertAsFirstNode()
{
    struct node *n;

    n = (struct node *)malloc(sizeof(struct node));
    printf("Enter a number\n");
    scanf("%d",&n->info);

    n->prev = NULL;
    n->next = NULL;

    if(start == NULL)
        start = n;
    else
    {
        start ->prev = NULL;
        n->next = start;
        start = n;
    }

}

void deleteFirstNode()
{
    struct node *r;
    if(start == NULL)
        printf("List is Empty\n");
    else
    {
        r = start;
        start = start->next;
        start->prev = NULL;
        free(r);
    }
}

void viewList()
{
    struct node *t;
    if(start == NULL)
        printf("List is Empty\n");
    else
    {

        while(t->next  != NULL)
        {
            printf(" %d \n",t->info);
            t = t->next;
        }
    }
}

int menu() // Creating function for user to manage all the prgm.
{
    int ch;
    printf("1. Add Value in the List\n");
    printf("2. Delete First Value\n");
    printf("3. View List\n");
    printf("4. Exit\n");

    printf("\n\nEnter Your Choice\n");
    scanf("%d",&ch);
    return (ch);
}

void main()
{
  while(1) // Creating an infinite loop.
  {
      switch(menu())
      {
        case 1:
                insertAsFirstNode();
                break;
        case 2:
                deleteFirstNode();
                break;
        case 3:
                viewList();
                break;
        case 4:
                exit(0);

        default:
            printf("Invalid Choice\n");
      }

  }

}

