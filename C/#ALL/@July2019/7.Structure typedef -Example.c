#include<stdio.h>
/// typedef Structure........

typedef struct
{

    char name[50];
    int number;

} students ;

void main()
{
    int i, num;
    students a[50];

    printf("Enter the number of students\n");
    scanf("%d",&num);

    for(i=0;i<num;i++)
    {
        scanf("%s",a[i].name);
    }

    printf("The name of students are : \n");

    for(int i=0;i<num;i++)
    {
        printf("%s\n",a[i].name);
    }
}
