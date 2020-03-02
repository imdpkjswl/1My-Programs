#include<stdio.h>
#include<math.h>
#include<string.h>

///Function for stack precedence
int F(char symbol)
{

    switch(symbol)
    {
        case '+':
        case '-':   return 2;
        case '*':
        case '/':   return 4;
        case '^':
        case '$':   return 5;
        case ')':   return 0;
        case '#':   return -1;
        default:    return 8;

    }
}

///Function for input precedence

int G(char symbol)
{

    switch(symbol)
    {
        case '+':
        case '-':   return 1;
        case '*':
        case '/':   return 3;
        case '^':
        case '$':   return 6;
        case '(':   return 9;
        case '#':   return 0;
        default:    return 7;
    }
}

///Function to convert from infix to postfix

void infix_postfix(char infix[],char postfix[])
{
    int i,k,top;
    char symbol,stack[50];

    k=0;
    top = -1;

    stack[++top] = '#';

    for(i=0;i<strlen(infix);i++)//for(i=0;infix[i]!= '\0';i++)
    {
        symbol =infix[i];

        while(F(stack[top])>G(symbol))
        {
            postfix[k++] = stack[top--];

        }

        if(F(stack[top]) != G(symbol))
        {
            stack[++top] = symbol;
        }
        else
            top--;
    }

    while(stack[top]!= '#') postfix[k++]=stack[top--];

    postfix[k] = '\0';
}

void main()
{
    char infix[50],postfix[50];
    printf("Enter the infix expression\n");
    scanf("%s",infix);
    infix_postfix(infix,postfix);

    printf("Postfix = %s\n",postfix);

}

