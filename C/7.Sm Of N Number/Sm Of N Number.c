#include<stdio.h>
void main()
{
    int i,n,sum;
    printf("Enter The Value Of n");
    scanf("%d",&n);
    sum=0;
    for(i=1;i<=n;i++)
    {
        sum=sum+i;
    }
 printf("Sum Of n Natural Number is %d",sum);
 getch();
}



