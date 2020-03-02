#include<stdio.h>
#include<stdlib.h>

#define n 5
int F=0,R=0;
int que[n];


void insert_rear(int item)
{

    if(R == n-1)
    {
        printf("Queue is OverFlow\n");
        return;
    }

    ++R;
    que[R]= item;

    return;
}

void delete_front()
{
    if(F>R)
    {
        printf("Queue is UnderFlow\n");
        return;
    }

    printf("%d item is deleted\n",que[F++]);

    return;

}

void display()
{
    int i;

    if(F>R)
    {
        printf("Queue is UnderFlow\n");
        return;
    }

    printf("Queue elements are :\n");
    for(i =F;i<=R;i++)
    {
        printf("%d\t",que[i]);
    }
    printf("\n");
}

void main()
{
    int item , choice;

    R=-1;
    F=0;

    for(;;)
    {
        printf("1.Insert item at Rear\n2.Delete item at Front\n3.Display\n4.Exit\n");
        printf("Enter your choice\n");
        scanf("%d",&choice);

        system("cls");

        switch(choice)
        {
        case 1:
            printf("Enter an item\n");
            scanf("%d",&choice);
            insert_rear(item);
            break;

        case 2:
            delete_front();
            break;

        case 3:
            display();
            break;

        case 4:
            exit(2019);
        }
    }
}
