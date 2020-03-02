#include<stdio.h>
/* QUESTION: Program to store the n students data and print the information of n students and sort the marks of students in increasing order.
*/
typedef struct
{
    char name[100];
    int marks;
    float avg;
}STUDENTS; // TYPE_ID-MEANS: User defined data types.

void read_students_info(STUDENTS a[],int n)
{
    int i;

    for(i=0;i<n;i++)
    {
        printf("Name : "); scanf("%s",a[i].name);
        printf("Marks : "); scanf("%d",&a[i].marks);
        printf("Average : "); scanf("%f",&a[i].avg);
    }
}

void print_students_info(STUDENTS a[],int n)
{
    int i;

    printf("Name\t Marks\t Average\t\n");

    for(i=0;i<n;i++)
    {
        printf("%s\t %d\t %.2f\t",a[i].name,a[i].marks,a[i].avg);
        printf("\n");
    }
}

void sort_students_marks(STUDENTS a[] , int n)
{
    int j,i;//temp;
    STUDENTS temp;

    for(j=1;j<n;j++)
    {
        for(i=0;i<n-j;i++)
        {
            if(a[i].marks > a[i+1].marks)
            {
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;

            }
        }
    }
}
int  main()
{
    int num,i;
    STUDENTS a[100];

    printf("Enter the number of students\n");
    scanf("%d",&num);

    read_students_info(a,num);

    sort_students_marks(a,num);

    printf("The details are :\n");

    print_students_info(a,num);

    return 0;

}
