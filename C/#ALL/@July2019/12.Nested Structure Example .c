#include<stdio.h>
#include<conio.h>


struct students
{
    // Students details in outer structure.
    int roll; // Roll number
    char name[100]; // Name of students.

    struct stu_data
    {   // Structure in inner structure.
        char sub[50]; // Subjects
        int m;       // Marks
    } marks ; // Inner Structure variable.

} ; //stu ; // Here we not made var. we'll make in main method.Outer Structure.

int main()
{
    struct students stu; // Variable of outer structure.

    printf("Enter the roll number of students\n");
    scanf("%d",&stu.roll);

    printf("Enter the students name\n");
    scanf("%s",stu.name);

    printf("Enter the subject of students\n");
    scanf("%s",stu.marks.sub); // we can't access directly inner structure without using outer structure.

    printf("Enter the marks of students\n");
    scanf("%d",&stu.marks.m);

    printf("\n********* OUTPUT **********\n");
    printf("\nRoll number of students : %d\n",stu.roll);
    printf("Name of students : %s\n",stu.name);
    printf("Subjects of students : %s\n",stu.marks.sub);
    printf("Marks of students : %d\n",stu.marks.m);

    getch();
    return 0;

}
