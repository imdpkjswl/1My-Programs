#include<stdio.h>
#include<conio.h>


void main()
{
    int i,car[2016];
    int j=50;//0;
/*

    for(i=1965;i<2015;i++)
    {
        scanf("%d",&car[i]);
        ++j;
    }
*/
    printf("Total number of years : %d\n",j);

    car[1965] = 500;
    int *p;

    p =&car[1965];
    printf("Address of car[1965] : %d\n",p);

    p= p+2;
    printf("Address of car[1967] : %d\n",p);

    p=p+2;
    printf("Address of car[1969] : %d\n",p);


    //printf("Address of car[1967] : %d\n",&car[2015]);

    getch();

}
