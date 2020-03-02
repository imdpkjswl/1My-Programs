#include<stdio.h>

int main()

{
    int n,i;
    printf("Enter The Input Number\n");
    scanf("%d",&n);
    printf("********** Multiplication Table Of %d **********\n",n);

    for(i=1;i<=20;i++)
    {
        printf("%d x %d = %d\n",n,i,n*i);
    }
    getch();



}
