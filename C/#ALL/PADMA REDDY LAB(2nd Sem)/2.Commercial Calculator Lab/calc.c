#include<stdio.h>
#include<process.h>


void main()
{
    float a,b,res;
    char op;

    printf("Enter two number to perform a+b,a-b,a*b and a/b operations\n");
    scanf("%f %c %f",&a,&op,&b);

    if(op == '+')

                 res=a+b;

    else if(op == '-')

                 res=a-b;

    else if(op == '*')

              res= a*b;

    else if(op == '/')
        {
            if(b==0)
                {
                    printf("Division not possible\n");
                    exit(0);

                }
            else
                res=a/b;
        }
    else
    {

            printf("Invalid operation\n");
            exit(0);

    }

    printf("Result: %.3f\n",res);

}
