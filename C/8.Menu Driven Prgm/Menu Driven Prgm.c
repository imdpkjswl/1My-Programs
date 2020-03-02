#include<stdio.h>

void main()
{
    int choice,a,b,s;
    while(1)
    {

        printf("\n1. Addition");
        printf("\n2. Odd-Even");
        printf("\n3. Printing N Natural Numbers");
        printf("\n4. Exit");
        printf("\n\n Enter Your Choice");
        scanf("%d",&choice);
        switch(choice)
        {

        case 1:
            printf("Enter Two Numbers");
            scanf("%d%d",&a,&b);
            s=a+b;
            printf("\n Sum is %d",s);
            break;

        case 2:
            printf("Enter A Number");
            scanf("%d",&a);
            if(a%2==0)
                printf("Even Number");
                else
                    printf("Odd Number");
                    break;

        case 3:
            printf("Enter A Number");
            scanf("%d",&a);
            for(b=1;b<=a;b++)
                printf("%d",b);
                break;

        case 4:
		         exit(0);

        default:
        printf("Invalid Choice");

        }
        getch();
    }

}


