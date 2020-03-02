/*
Design, Develop and Implement a menu driven Program in C for the following
operations on Circular QUEUE of Characters (Array Implementation of Queue
with maximum size MAX)
a. Insert an Element on to Circular QUEUE
b. Delete an Element from Circular QUEUE
c. Demonstrate Overflow and Underflow situations on Circular QUEUE
d. Display the status of Circular QUEUE
e. Exit
Support the program with appropriate functions for each of the above operations.


#include<stdio.h>
#include<stdlib.h>
#define MAX 5
char ch[MAX];
int count = 0 ;
int r=-1 , f = 0 ;

void inserttoqueue()

{
    char c ;
    printf("Enter a character ");
    scanf(" %c",&c);

    if(count == MAX)
        printf("queue is full");
    else{

        r=(r+1)%MAX ;

        ch[r]=c;

        count++ ;
    }
}

void del()
{
    if(count==0)
        printf("queue is empty") ; //it's mentioned in the question to print undeflow
    else{

        printf("deleted character is %c",ch[f]);
        f=(f+1)%MAX ;
        count-- ;
    }

}

void display()
{
    int i , j ;


     if(count==0)
        printf("queue is empty");
    else
    {
        j= f ; // assign the value of f to j because we don't want to mess up with f value ;

        for(i=0 ;  i <count  ; i++)      //i<count because i starts from 0
        {

            printf("\t%c\t",ch[j]);
            j=(j+1)%MAX;

        }
    }
}

void main()
{

    int choice  ;


    while(choice)
    {

        printf("\n1.insert to the queue\n2.delete from the queue\n3.display\n4.exit\n  >");
        scanf("%d",&choice);
        switch(choice)
        {
        case 1 : inserttoqueue();break ;
        case 2 : del();break ;
        case 3 : display();break ;
        case 4 : exit(0);
        default : printf("invalid input");


        }

    }

}

*/


#include<stdio.h>
#include<stdlib.h>

#define q_size 5
int front,rear;

char que[q_size];
front=0;
rear = -1;
int count =0;


// Insert item at rear end
void insert_rear()
{
    char item;

    if(count == q_size)
    {
        printf("Queue is OverFlow\n");
        return;
    }

    printf("Enter the item to be inserted\n");
    scanf(" %c",&item);

    //printf("%c is inserted\n",item);

    rear = (rear+1)%q_size;

    que[rear] = item;
    count++;

}

// Delete item at front end
void delete_front()
{
    if(count == 0)
    {
        printf("Queue is UnderFlow\n");
        return;
    }

    printf("%c is deleted\n",que[front]);
    front = (front+1)%q_size;

    count--;

}


// Display the Queue elements
void display()
{
    if(count == 0)
    {
        printf("Queue is UnderFlow\n");
        return;
    }

    int i,j;

    for(i=1,j=front;i<=count;i++)
    {
        printf(" %c\t",que[j]);
        j =(j+1)%q_size;
    }

    printf("\n");

    return;
}


void main()
{
    int choice;

    for(;;)
    {
        printf("1.Insert\n2.Delete\n3.Display\n4.Exit\n");
        printf("Enter your choice\n");
        scanf("%d",&choice);

        system("cls");

        switch(choice)
        {
        case 1:
            insert_rear();
            break;

        case 2:
            delete_front();
            break;

        case 3:
            display();
            break;

        case 4:
            exit(1);

        }
    }
}

