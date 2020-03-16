#include<stdio.h>
#include<stdlib.h>

void Tower_Hanoi(int n,char source,char temp,char dest)
{
    if(n==0)
    {
        return;
    }

    Tower_Hanoi(n-1, source, dest, temp);
    printf("%d Disk move from %c to %c\n",n,source,dest);

    Tower_Hanoi(n-1,temp,source,dest);


}

void main()
{
    int n;

    printf("Enter the number of disk\n");
    scanf("%d",&n);

    Tower_Hanoi(n,'A','B','C');

    return;
}
