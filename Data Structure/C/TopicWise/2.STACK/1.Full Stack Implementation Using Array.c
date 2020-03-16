/// STACK ALL OPERATIONS ARE COMPLETED USING STATIC ALLOCATION.
#include<stdio.h>
#include<stdlib.h>
#include<malloc.h>


int n;
int *stack;
int top = -1;

void Create()
{

    if(stack == NULL)
    {
        printf("Enter the size of stack to be created\n");
        scanf("%d",&n);
        stack = (int*)malloc(n*sizeof(int));
        printf("Memory allocated Successfully\n");


            if(stack == NULL)
            {
                printf("Memory allocation failed\n");
                return;
            }

    }

    else
    {
        printf("Enter new size of stack to be reallocated\n");
        scanf("%d",&n); // Here,just changing the size of stack.
        printf("Memory is now reallocated\n");


    }


}
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
          printf("%d is removed\n",*(stack+top));
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
        printf("%d  ",*(stack+i));
    }
    printf("\n");

}

void main()
{
    int choice,item;

    for(;;)
    {

        printf("1.Create a stack\n");
        printf("2.Push an item.\n");
        printf("3.Pop an item.\n");
        printf("4.Traverse stack.\n");
        printf("5.Exit\n\n");

        printf("Enter your choice.\n");
        scanf("%d",&choice);

        system("cls");
        switch(choice)
        {

        case 1:     Create();
                    break;

        case 2:    printf("Enter a elements :\n");
                   scanf("%d",&item);
                   push(item);
                    break;

        case 3:  pop();
                 break;

        case 4:  traverse();
                  break;

        case 5:    exit(0);

        default :  printf("Please choose the correct options.\n");
                   continue;
        }


    }



}


