#include<stdio.h>

int main()
{
    int n;
    double sum;
    printf("Enter The Terms\n");
    scanf("%d",&n);

    printf("1 +");
    for(int i = 1; i <= n-1; i++, printf("%lf +",1/(float)i))
    {

        sum=sum+1/(float)i;

    }

    printf("\b.");

     //printf("\n%lf",sum);

    getch();



}
