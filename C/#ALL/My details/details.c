#include<stdio.h>
#include<stdlib.h>
main()

{

    int res;
    char p[] = {'d','\0'}, str[50];
    printf("If You Want My Details");
    printf("\nkindly, Enter The Password\n");
    scanf("%s",str);
    if(strcmp(str,p) == 0)  res = 1;
    else                    res = 0;


switch(res)

{

 case 1 :   printf("DEEPAK JAISWAL\n");
                   printf("SAI VIDYA INSTITUTE OF TECHNOLOGY\n");
                   printf("FROM CSE BRANCH\n");
                   printf("RAJANUKUNTE,BENGALURU,PIN: 560064,INDIA\n");
 break;

 default : printf("Error! Invalid Password\n");




}
getch();
}
