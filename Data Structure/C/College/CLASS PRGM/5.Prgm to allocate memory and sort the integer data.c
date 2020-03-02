#include<stdio.h>
#include<conio.h>
#include<malloc.h>

#define MALLOC(n,a,type)                \
{                                       \
    a=(type*)malloc(n*sizeof(type));    \
                                        \
    if(a==NULL)                         \
    {                                   \
        printf("Allocation failed\n");  \
        exit(0);                        \
    }                                   \
}                                       \

void sort(int* a,int n)
{
    int i,j,temp;

    for(j=1;j<n;j++)
    {
        for(i=0;i<n-j;i++)
        {
            if(*(a+i) > *(a+i+1))
            {
                temp = *(a+i);

                *(a+i) = *(a+i+1);

                *(a+i+1) = temp;
            }
        }
    }
}

void main()
{
    int n,*a,i;

    printf("Enter the number of elements\n");
    scanf("%d",&n);

    MALLOC(n,a,int);

    printf("Enter %d elements\n",n);

    for(i=0;i<n;i++)
    {
        scanf("%d",(a+i));
    }

    sort(a,n);

    printf("The sorted elements are : \n");

    for(i=0;i<n;i++)
    {
        printf("%d  ",*(a+i));
    }

    getch();

    return;
}
