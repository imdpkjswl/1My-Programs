#include<stdio.h>
#include<stdlib.h>

void main()

{

    int a,b,res;
    char op, car[10], secret[] = {"chutiya"};
 for(;;)  {
        printf("Enter the secret code:");
        scanf("%s",&car);
        if(strcmp(car, secret) == 0)    exit(0);
        printf("Enter The Expression in given format a+b Or a-b\n");

     scanf("%d %c %d",&a,&op,&b);




     switch(op)

{


        case '+' : res=a+b;
            printf("Result=(%d+%d)=%d\n",a,b,res);
            break;


        case '-' : res=a-b;
            printf("Result=(%d-%d)=%d\n",a,b,res);
            break;

        //    case 'd' :  exit(0); // getting error on this case and other character

            default : printf("Invalid Input\n");

     }

}
        getch();
}


