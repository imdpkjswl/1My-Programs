#include<stdio.h>
#include<conio.h>

void main()
{
    int money,choice;
    char currencyName;
    double res;

    printf("Enter your amount\n");
    scanf("%d",&money);
    printf("Select your currency among of these : \n");
    printf("1.For Dollor into Rupees\n");
    printf("2.For Euro into Rupees\n");
    printf("3.For Riyal into Rupees\n");

    scanf("%d",&choice);

    switch(choice)
    {
    case 1:
        res= money*72.32;
        printf("You'll receive %.2lf rupees\n",res);
        break;

    case 2:
        res=money*89.87;
        printf("You'll receive %.2lf rupees\n",res);
        break;

    case 3:
        res=money*17.87;
        printf("You'll receive %.2lf rupees\n",res);
        break;

    default:
        printf("Invalid option chosen,Try again!!!\n");


    }

    if(choice ==1 || choice ==2 || choice ==3)
        {
            printf("\n***** Thank You for Conversion *****\n");
            getch();
        }
    else   getch();


    return;

}
