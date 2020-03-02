#include<stdio.h>

void display(int n)
{
    if(n== -1)
        return;
    printf("%d ",n);

    return display(n-1);

}

void main()
{

        int n;

        printf("Enter the number\n");
        scanf("%d",&n);

        display(n);

        return;
}
