#include<stdio.h>
#include<conio.h>

/// Limitation : Number shouldn't repeated more than two times.
void main()
{
    int a[] = {1,2,3,4,5,4,3,2,1,9,6};
    int i,j;

    for(i=0;i<11;i++)
    {
        for(j=0;j<i;j++)
        {

            if(a[i] == a[j])
            {
                // Making zero the duplicate elements.
                a[i]=0;
                a[j]=0;

            }
        }

    }

    printf("The Unique numbers are : \n");
    for(i=0;i<11;i++)
    {
        if(a[i] != 0)
            printf("%d\n",a[i]);
    }

    getch();

    return;
}
