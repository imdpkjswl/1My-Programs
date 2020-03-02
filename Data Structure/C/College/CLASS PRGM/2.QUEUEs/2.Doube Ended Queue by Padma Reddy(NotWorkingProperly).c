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

void insert_front(int item)
{

    if(F=0 && F<R)
    {
        printf("Front Insertion not possible\n");
        return;
    }

    if(F<=R)
    {
        que[--F] = item;
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


void delete_rear()
{
    if(F>R)
    {
        printf("Queue is UnderFlow\n");
        return;
    }

    printf("%d item is deleted\n",que[R--]);

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
        printf("1.Insert item at Rear\n2.Insert item at Front\n3.Delete item at Rear\n4.Delete item at Front\n5.Display\n6.Exit\n");
        printf("Enter your choice\n");
        scanf("%d",&choice);

        system("cls");

        switch(choice)
        {
        case 1:
            printf("Enter an item\n");
            scanf("%d",&item);
            insert_rear(item);
            break;

        case 2:
            printf("Enter an item\n");
            scanf("%d",&item);
            insert_front(item);
            break;

        case 3:
            delete_rear();
            break;

        case 4:
            delete_front();
            break;

        case 5:
            display();
            break;

        default :
            exit(0);
        }
    }
}
