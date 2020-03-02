#include<stdio.h>
#include<stdlib.h>

#define n 5
int stack[n],top = -1;


void push(int element)
{


    if(top == n-1)
    {
        printf("Stack is Full\n");

    }
    else
    {
        top++;
        stack[top]=element;
        printf("%d is pushed\n",element);
    }

}

void pop()
{
    if(top== -1)
    {
        printf("Stack is empty\n");
    }
    else
      {
          printf("%d is removed\n",stack[top]);
          top--;
      }

}

void traverse()
{
    int i;

    if(top == -1)
      {
          printf("Stack is empty\n");
          return;
      }

    printf("Elements in stack are :\n");
    for(i=0;i<=top;i++)
    {
        printf("%d  ",stack[i]);
    }
    printf("\n");

}

void main()
{
    int choice,item;

    for(;;)
    {

        printf("1.Push an item.\n");
        printf("2.Pop an item.\n");
        printf("3.Traverse stack.\n");
        printf("4.Exit\n\n");

        printf("Enter your choice.\n");
        scanf("%d",&choice);

        system("cls");
        switch(choice)
        {
        case 1:    printf("Enter a elements :\n");
                   scanf("%d",&item);
                   push(item);
                    break;

        case 2:  pop();
                 break;

        case 3:  traverse();
                  break;

        default:  printf("Please choose the correct options.\n");
                  exit(0);
        }


    }



}

