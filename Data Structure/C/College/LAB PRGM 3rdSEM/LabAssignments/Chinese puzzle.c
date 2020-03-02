#include<stdio.h>
#include<stdlib.h>

void main()
{

    int total_Rabbit,total_Parrot;
    int heads,legs;

    printf("Enter heads\n");
    scanf("%d",&heads);
    printf("Enter legs\n");
    scanf("%d",&legs);


    total_Rabbit= (legs- 2*heads)/2;
    total_Parrot= (4*heads-legs)/2;

    if(total_Rabbit<0 || total_Parrot<0 )
    {
        printf("Invalid Input, Enter the correct data\n");
        exit(0);
    }

    printf("Total Rabbits are :  %d\n",total_Rabbit);
    printf("Total Parrots are  :  %d\n",total_Parrot);

    getch();

    return;

}
