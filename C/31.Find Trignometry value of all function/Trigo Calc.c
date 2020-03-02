#include<stdio.h>
#include<math.h>
#include<conio.h>
void main()
{
    float i,n;
    int s;

    printf("1.For sin(x)\n2.For cos(x)\n3.For tan(x)\n4.For Sec(x)\n5.For Cosec(x)\n6.For Cot(x)\n7.For Exit\n");
    scanf("%d",&s);


    switch(s)
    {


case 1:
        {   printf("Enter the value of x\n");
            scanf("%f",&i);
            n=sin((i*3.14159265)/180);
            printf("%f\n",n);
            break;

        }

case 2:
        {   printf("Enter the value of x\n");
            scanf("%f",&i);
            n=cos((i*3.14159265)/180);
            printf("%f\n",n);
            break;

        }
case 3:
        {   printf("Enter the value of x\n");
            scanf("%f",&i);
            n=tan((i*3.14159265)/180);
            printf("%f\n",n);
            break;

        }
case 4:
        {   printf("Enter the value of x\n");
            scanf("%f",&i);
            n=1/(cos((i*3.14159265)/180));
            printf("%f\n",n);
            break;

        }
case 5:
        {   printf("Enter the value of x\n");
            scanf("%f",&i);
            n=1/(sin((i*3.14159265)/180));
            printf("%f\n",n);
            break;

        }
case 6:
        {   printf("Enter the value of x\n");
            scanf("%f",&i);
            n=1/(tan((i*3.14159265)/180));
            printf("%f\n",n);
            break;

        }

case 7:  exit(0);

    dafault : exit(0);

    }

    getch();
}
