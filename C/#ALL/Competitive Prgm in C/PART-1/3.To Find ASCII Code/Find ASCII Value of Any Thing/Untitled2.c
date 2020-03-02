#include<stdio.h>
#include<conio.h>

 main()

{   char p;

 for(p=0;p<=255;p++) {
printf("Enter Any Number Or Character To Find ASCII Value\n");

    scanf("%c",&p);
    printf("ASCII Value of %c is %d\n",p,p); // After This Showing ASCII Value 10 is value of 'SPACE BOTTON'

    }
getch();

}

