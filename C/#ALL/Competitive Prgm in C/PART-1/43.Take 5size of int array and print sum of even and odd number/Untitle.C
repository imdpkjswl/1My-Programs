#include<stdio.h>
#include<conio.h>

int main()

{
    int n[5],i,sum1=0,sum2=0;

    printf("Enter the numbers\n");

    for(i=0;i<5;i++)
    {
        scanf("%d",&n[i]);

        if(n[i]%2==0)

            sum1=sum1+n[i];
       else
            sum2=sum2+n[i];


    }


    printf("\nSum of Even : %d",sum1);
    printf("\nSum of Odd : %d",sum2);

   getch();

}
