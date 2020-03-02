#include<stdio.h>
#include<stdlib.h>
#define n 5
int front=0 ,rear=-1,queue[n];
int count=0;

void insert_rear(int item)
{
    if(count == n)
    {
        printf("Queue is FUll\n");
        return;
    }

    ///Increment Rear by 1
    rear  = (rear+1)%n;
    printf("Front= %d ,Rear= %d\n\n",front,rear);

    queue[rear] = item;
    count++;

}

void delete_front()
{
    if(count == 0)
    {
        printf("Queue is Empty\n");
        return;
    }

    printf("Item is deleted = %d\n",queue[front]);

    ///Incremented Front by 1
    front = (front+1)%n;
    count--;
    printf("Front= %d ,Rear= %d\n\n",front,rear);
}

void display()
{
    if(count == 0)
    {
        printf("Queue is Empty\n");
        return;
    }

    printf("Element of queue are:\n");

    int i,k;

    for(k=1,i=front;k<=count;k++)
    {
        printf("%d  ",queue[i]);
        i = (i+1)%n;
    }
    printf("\n");
}

void main()
{
    int item,choice;
    //front=0;
    //rear =-1;
    //count=0;

    for(;;)
    {
        printf("1.Insert\n2.Delete\n3.Display\n4.Exit\n");
        printf("Enter your choice\n");
        scanf("%d",&choice);

        system("cls");

        switch(choice)
        {
        case 1:
            printf("Enter the item to be inserted\n");
            scanf("%d",&item);
            insert_rear(item);
            break;

        case 2:
            delete_front();
            break;

        case 3:
            display();
            break;

        case 4:
            exit(0);

        }
    }
}
