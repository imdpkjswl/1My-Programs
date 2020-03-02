#include<stdio.h>
#define n 5

int stack[n] , top = -1;

void push(int item)
{
    if(top == n-1)
    {
        printf("Stack is overflow\n");
        return;
    }

    printf("Item %d is pushed\n",item);

    stack[++top] = item;
}

void pop()
{
    if(top == -1)
    {
        printf("Stack is underflow\n");
        return;
    }

    printf("item %d is popped\n",stack[top]);
    stack[--top];
}

void display()
{
    int i;

    if(top == -1)
    {
        printf("Stack is underflow\n");
        return;
    }

    for(i=0;i<=top;i++)
    {
        printf("%d  ",stack[i]);
    }
    printf("\n");
}

int is_palindrome(char str[]) /// THIS FUNCTION IS NOT WORKING.
{
    int i,top1 = -1;
    char stack1[200];

    for(i=0;str[i]!= '\0';i++)
    {
        stack1[++top1] = str[i];

    }

    for(i=0;str[i]!= '\0';i++)
    {
        if(str[i]!= stack1[top1--]);
            return 1;
    }

    return -1;
}

void main()
{
    int choice,item;
    int flag;
    char str[200];

    for(;;)
    {

        printf("1.Push an item.\n");
        printf("2.Pop an item.\n");
        printf("3.Traverse stack.\n");
        printf("4.Check for Palindrome\n");
        printf("5.Exit\n\n");

        printf("Enter your choice.\n");
        scanf("%d",&choice);

        system("cls");
        switch(choice)
        {
        case 1:    printf("Enter a elements :\n");
                   scanf("%d",&item);
                   push(item);
                    break;

        case 2:   pop();
                   break;

        case 3:   display();
                   break;

        case 4:   printf("Enter a string\n");
                  scanf("%s",str);
                  flag = is_palindrome(str);
                  if(flag == -1)
                    printf("String is not a palindrome\n");
                  else
                    printf("String is a palindrome\n");
                   break;

        case 5:   exit(0);

        default:  printf("Please choose the correct options.\n");
                  continue; /// Used to redirect to for statement.

        }


    }



}
