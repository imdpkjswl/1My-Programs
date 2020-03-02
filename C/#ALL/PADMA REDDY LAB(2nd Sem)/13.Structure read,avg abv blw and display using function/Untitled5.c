#include<stdio.h>

typedef struct
{
    char name[20];
    int  marks;
} student ;

void read(student a[],int n)
{
    int i;

    for(i=0;i<n;i++)
    {
        printf("NAME  \n"); scanf("%s",a[i].name);
        printf("MARKS  \n"); scanf("%d",&a[i].marks);

    }
}

float find_average(student a[],int n)
{
    int i;
    float sum=0;

    for(i=0;i<n;i++)
    {
        sum+= a[i].marks;
    }

    return sum/n;

}

void write(student a[],int n)
{
    int i;
    float average;

    average=find_average(a,n);

    printf("Average =  %f\n",average);

    printf("Student who got marks above average\n");
    for(i=0;i<n;i++)
    {
        if(a[i].marks>average)
        {
            printf("%s\n",a[i].name);
        }
    }

    printf("Student who got marks below average\n");
       for(i=0;i<n;i++)
       {
        if(a[i].marks<average)
        {
            printf("%s\n",a[i].name);
        }
        }
}

void main()
{
    int i,n;
    student a[20];

    printf("Enter the number of students\n");
    scanf("%d",&n);

    printf("Enter the name and marks\n");
    read(a,n);

    write(a,n);
}
