#include<stdio.h>
#include<stdlib.h>
#define n 5

int queue[n];
int front=0;
int rear=0;

///Insert item at rear end
void insert_rear()
{
    if(rear==n)
    {
        printf("Queue is full\n");
        return;
    }

    int item;
    printf("Enter the item to be inserted at rear end\n");
    scanf("%d",&item);

    queue[rear++]=item;
    printf("%d item is inserted\n",item);

}

///Delete item at front end
void delete_front()
{
    if(rear==front)
    {
        printf("Queue is empty\n");
        return;
    }

    printf("%d item is deleted\n",queue[front]);

    int i;
    for(i=0;i<rear-1;i++)
    {
        queue[i] = queue[i+1];
    }
    rear--;

}

///Display the Queue
void display()
{
    if(rear==front)
    {
        printf("Queue is empty\n");
        return;
    }

    for(int i=0;i<rear;i++)
    {
        printf("%d  ",queue[i]);
    }
}
/* Main function to access perform the queue operation */
void main()
{
    int choice,item;


    for(;;)
    {
        printf("\n1.Insert item at rear end\n2.Delete item at front end\n3.Display Queue\n4.Exit\n\nEnter Your choice\n");
        scanf("%d",&choice);
        system("cls");

        switch(choice)
        {
            case 1 :
                        insert_rear(item);
                        break;

            case 2:     delete_front();
                        break;

            case 3:     display();
                        break;

            case 4:     exit(0);

            default :   printf("Choose the correct option\n");
                        continue;
        }
    }
}

