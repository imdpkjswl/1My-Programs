#include<stdio.h>

int main()

{
    double MarksInPhysics,MarksInMath,MarksInC,MarksInEng,Average;
    MarksInPhysics=65.00;
    MarksInMath=83.50;
    MarksInC=85.75;
    MarksInEng=67.50;

    Average=(MarksInPhysics+MarksInMath+MarksInC+MarksInEng)/4;
    printf("\nAverage Of Four Marks Till Two Decimal point is %0.2lf\n",Average);  //  0.2lf after % means it will take only 2 Number after decimal point

    getch();

}
