#include<stdio.h>
#include<stdlib.h>
#define n 5
//int* queue,n;
int queue[n];
int front = 0;
int rear = 0;

/*
void create()
{
    queue=(int*)malloc(n*sizeof(int));

    if(queue==NULL)
    {
        printf("Memory allocation Failed\n\n");
        return;
    }
    printf("Queue Created Successfully\n\n");
}
*/
void Insert_Rear()
{
    if(rear==n)
    {
        printf("Queue Is Full\n\n");
        return;
    }

        int item;
        printf("Enter the item to be Insert\n");
        scanf("%d",&item);
        queue[rear]=item;
        rear++;
        printf("\n");


}

void Insert_Front()
{
    if(front+rear == n)
    {
        printf("Queue Is Full\n\n");
        return;
    }

        int item;
        printf("Enter the item to be Insert\n");
        scanf("%d",&item);

        int i;

        ///After shifting left to right,Incrementing rear by 1.
        rear++;
        ///Using insertion to specify position property
        for(i=rear-1;i>=front;i--)
        {
            queue[i+1] = queue[i];

        }



        queue[front] = item;

        printf("\n");


}

void delete_rear()
{
    if(front==rear)
    {
        printf("Queue is Empty\n\n");
        return;
    }

        printf("%d item is Removed\n\n",queue[rear-1]);

        rear--;
        printf("\n");

}


void delete_front()
{
    if(front==rear)
    {
        printf("Queue is Empty\n\n");
        return;
    }


        int i;
        printf("%d item is Removed\n\n",queue[front]);

        ///Make Shifting operation
        for(i=0;i<rear-1;i++)
        {
            queue[i]=queue[i+1];

        }
        rear--;
        printf("\n");

}

void display()
{
    if(front==rear)
    {
        printf("Queue is Empty\n\n");
        return;
    }


        int i;
        for(i=front;i<rear;i++)
        {
            printf("%d ",queue[i]);
        }
        printf("\n\n");

}

void main()
{
    int choice;

    printf("Welcome To Queue Operation Portal\n");

    for(;;)
    {

        //printf("1: Create Queue\n");
        printf("1: Insert item at rear end\n");
        printf("2. Insert item at front end\n");
        printf("3: Remove item at front end\n");
        printf("4. Remove item at rear end\n");
        printf("5: Display Queue\n");
        printf("6: Exit\n\n");

        printf("Choose any Option\n");
        scanf("%d",&choice);
        system("cls");
        switch(choice)
        {
            /*
            case 1:
                printf("Enter The Size Of The Queue\n");
                scanf("%d",&n);
                create();
                break;
            */
            case 1:
                Insert_Rear();
                break;
            case 2:
                Insert_Front();
                break;
            case 3:
                delete_front();
                break;
            case 4:
                delete_rear();
                break;
            case 5:
                display();
                break;
            case 6:
                printf("Thank you :) :) :)\n\n");
                exit(0);
            default:
                printf("Invalid Input..Please Try Again\n\n");
        }
    }
}
