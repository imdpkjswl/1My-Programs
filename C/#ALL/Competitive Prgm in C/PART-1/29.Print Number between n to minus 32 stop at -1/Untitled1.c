#include<stdio.h>

void main()
{
    int n,i;
    printf("Enter The Number,if you want to print number till -32\n");
    scanf("%d",&n);

    if(n==-1)
        return 0;

    else if(n>-32)
    {
        for(i=n;i>=-32;i--)
            printf("%d\n",i);

    }
       else
       {
           for(i=n;i<=-32;i++)
            printf("\n%d ",i);
       }

       printf("\n");

       getch();


}
