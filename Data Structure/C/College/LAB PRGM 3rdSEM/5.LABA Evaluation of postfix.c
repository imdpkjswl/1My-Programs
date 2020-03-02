#include<stdio.h>
#include<stdlib.h>
#include<math.h>


double eval(char postfix[])
{
    int top=-1,i;
    double op1,op2,s[30];
    char symbol;


    for(i=0;i<strlen(postfix);i++)
    {
        symbol = postfix[i];

        switch(symbol)
        {

            case '+':
                op2 = s[top--];
                op1 = s[top--];
                s[++top] = op1 + op2;
                break;


            case '-':
                op2 = s[top--];
                op1 = s[top--];
                s[++top] = op1 - op2;
                break;


            case '*':
                op2 = s[top--];
                op1 = s[top--];
                s[++top] = op1 * op2;
                break;


            case '/':
                op2 = s[top--];
                op1 = s[top--];
                s[++top] = op1 / op2;
                break;


            case '^':
            case '$':
                op2 = s[top--];
                op1 = s[top--];
                s[++top] = pow(op1,op2);
                break;

            default:
                s[++top] = symbol-48;
                break;
        }
    }

    return s[top--];

}


void main()
{

    char postfix[100];
    double res;

    printf("Enter the postfix expression\n");
    scanf("%s",postfix);

    res = eval(postfix);

    printf("Result :  %lf\n",res);
}
