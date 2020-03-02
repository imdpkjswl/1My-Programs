#include<stdio.h>
#include<math.h>

double evaluate(char postfix[])
{
    int top,i;
    double op1,op2,stack[50];
    char symbol;

    top = -1;

    for(i=0;postfix[i]!= '\0';i++)
    {
        symbol = postfix[i];

        switch(symbol)
        {
            case '+':   op2 = stack[top--];
                        op1 = stack[top--];
                        stack[++top] = op1 + op2;
                        break;

            case '-':   op2 = stack[top--];
                        op1 = stack[top--];
                        stack[++top] = op1 - op2;
                        break;

            case '*':   op2 = stack[top--];
                        op1 = stack[top--];
                        stack[++top] = op1 * op2;
                        break;

            case '/':   op2 = stack[top--];
                        op1 = stack[top--];
                        stack[++top] = op1 / op2;
                        break;

            case '^':   op2 = stack[top--];
                        op1 = stack[top--];
                        stack[++top] = pow(op1,op2);
                        break;


            default :   stack[++top] = symbol -48;

            }
    }

    return stack[top--];
}


void main()
{
    char postfix[100];
    double result;

    printf("Enter a postfix expression\n");
    scanf("%s",postfix);

    result = evaluate(postfix);

    printf("Result :  %lf\n",result);

    return;
}
