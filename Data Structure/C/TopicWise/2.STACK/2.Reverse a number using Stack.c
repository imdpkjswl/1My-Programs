/// Reverse a number using two different stacks.
#include<stdio.h>
#include<stdlib.h>

#define n 5
#define m 5
int stack1[n],stack2[m],top1=-1,top2 = -1;

void insert(int item)
{
    if(top1 == n-1)
    {
        printf("Stack is Full\n");
        return;
    }

    ++top1;
    stack1[top1] = item;
    // Putting item into another stack
    stack2[++top2] = stack1[top1];

}

void delete()
{
    if(top1 == -1)
    {
        printf("Stack is Empty\n");
        return;
    }

    --top1;
    // Removing item into another stack
    --top2;

}

void display()
{
    int i;

    if(top1 == -1)
    {
        printf("Stack is Empty\n");
        return;
    }

    printf("Elements of stacks are :\n");
    for(i=0;i<=top1;i++)
    {
        printf("%d  ",stack1[i]);
    }
    printf("\n");
}

void reverse_display()
{
    int i;

    if(top2 == -1)
    {
        printf("Stack is Empty\n");
        return;
    }

    printf("Reverse stacks are :\n");
    for(i=top2;i>=0;i--)
    {
        printf("%d  ",stack1[i]);
    }
    printf("\n");
}
void main()
{
    int choice,item;

    for(;;)
    {
        printf("1.Insert an item\n");
        printf("2.Display the elements\n");
        printf("3.Display reverse stack\n");
        printf("4.Exit\n\n");

        printf("Enter your choice\n");
        scanf("%d",&choice);
        system("cls");
        switch(choice)
        {
            case 1:
                printf("Enter the item to be inserted\n");
                scanf("%d",&item);
                insert(item);
                break;

            case 2:
                display();
                break;

            case 3:
                reverse_display();
                break;

            case 4:
                exit(0);


        }
    }
}
