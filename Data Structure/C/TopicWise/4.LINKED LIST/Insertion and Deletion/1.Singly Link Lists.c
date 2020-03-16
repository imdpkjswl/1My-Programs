#include<stdio.h>
#include<conio.h>
#include<stdlib.h>


struct node
{
    int info;
    struct node *link; // node type pointer which contain address of node type block.
};

struct node *START = NULL;

struct node* CreateNode() // here node is a user defined data type.
{
    struct node *n;

    n =(struct node*)malloc(sizeof(struct node));
    // (struct node*) used to type cast the malloc fun bcuz malloc always return void value.
   // (sizeof(struct node)) is used to find the size user defined data type.
    return (n);
}
/////////////////////// INSERTION /////////////////////////////////////////////////////////////////////////
void InsertNode() // Function to insert a node.
{
    struct node *temp , *t; // t is a pointer variable.
    temp = CreateNode(); // call temp variable.
    printf("Enter a number\n");
    scanf("%d",&temp->info); //  store value in info variable.
    temp -> link=NULL; // link of temp contained NULL.
    if(START == NULL)
        START = temp;
    else
       {
            t = START; // Here START doesn't contain NULL value.
            while(t->link != NULL) //Loop for checking NULL to Iteration.
            {
                t =t->link; // Assign link of temp to t variable.
            }

                t ->link = temp; // Assign link of t in temp.
       }
}
////////////////////////////// DELETION ///////////////////////////////////////////////////////////////////
void DeleteNode()
{
    struct node *r; // r is a node type pointer.
    if(START == NULL) // Check START contain NULL or not.
        printf("List is Empty\n");
    else
        r = START;
        START = START ->link; // Assign link of START to START.
        free(r);// free is a predefined function which is used to free from memory.
        printf("First element is deleted\n");
}
//////////////////////////// TRAVERSING ///////////////////////////////////////////////////////////////////
void ViewList()
{
    struct node *t;
    if(START  == NULL)
        printf("List is Empty\n");
    else
    {

        t = START;
        printf("Elements present in List are :\n");
        while(t != NULL)
        {
            printf("%d\n",t->info); // Print value value of link of t.
            t = t->link;
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
                InsertNode();
                break;
        case 2:
                DeleteNode();
                break;
        case 3:
                ViewList();
                break;
        case 4:
                exit(0);

        default:
            printf("Invalid Choice\n");
      }

  }

}



