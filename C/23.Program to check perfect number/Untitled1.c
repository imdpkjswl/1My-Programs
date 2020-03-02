#include<stdio.h>

int main()
{
    int i,n,sum=0;
    printf("Enter the digits\n");
    scanf("%d",&n);

    for(i=1;i<=(n/2);i++)
    {

        if(n%i==0)
        {
            sum=sum+i;
        }

    }

    if(sum==n)
        {printf("Entered Number is a Perfect number\n",n);
        }
    else
   {

    printf("Entered Number is not a Perfect number\n",n);

   }
    getch();


}
