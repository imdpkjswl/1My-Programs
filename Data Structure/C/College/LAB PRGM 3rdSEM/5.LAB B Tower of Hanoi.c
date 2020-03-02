#include<stdio.h>
#include<stdlib.h>

void TOH(int n,char src,char temp,char dest)
{
    if(n==0) return;

    TOH(n-1,src,dest,temp);

    printf("%d Disk move from %c to %c\n",n,src,dest);

    TOH(n-1,temp,src,dest);

}

void main()
{
    int n;

    printf("Enter the number of disks\n");
    scanf("%d",&n);

    TOH(n,'A','B','C');

    printf("\nTotal move will be done = %.0lf\n",pow(2,n)-1);

    return;
}
