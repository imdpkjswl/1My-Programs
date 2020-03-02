#include<stdio.h>


struct
{

    char name[50];
    int number;

} a[50];

void main()
{
    int i, num;
    //struct students a[50];

    printf("Enter the number of students\n");
    scanf("%d",&num);

    for(i=0;i<num;i++)
    {
        scanf("%s",a[i].name);
    }

    printf("The name of students are : \n");

    for(i=0;i<num;i++)
    {
        printf("%s\n",a[i].name);
    }
}

