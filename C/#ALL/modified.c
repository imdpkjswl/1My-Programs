#include<stdio.h>
#include<stdlib.h>
#include<string.h>
void main()

{
	float a,b,res;
	char str1[20], plus[20] = {'+'},  minus[18] = {'-'} ,multiply[20] = {'*'} , divide[20] = {'/'};
	//system("clear");
	printf("Enter '+' to compute addition, '-' to compute subtraction, '*' to compute multiplication, '/' to compute division \n");
	printf("Enter your choice \n");
	scanf("%s",str1);
	printf("\n%s\n",str1);

    if(strcmp(str1,plus)==0)
        {
	printf("Enter Two Numbers\n");
	scanf("%f %f",&a,&b);
	res=a+b;
		printf("%f+%f=%f\n",a,b,res);}

		/*
else
    if(strcmp(srt1,minus)==0)

		{
		printf("Enter Two Numbers\n");
    scanf("%f %f",&a,&b);
		    res=a-b;
		printf("%f-%f=%f\n",a,b,res);
		}
	/*else


	{     	if(strcmp(srt1,multiply)==0)
		{	 printf("Enter your choice \n");
    scanf("%f %f",&a,&b);
		    res=a*b;
		printf("%f*%f=%f",a,b,res);
	}


	else
	{     if(strcmp(srt1,divide)==0)
		{    	 printf("Enter your choice \n");
    scanf("%f %f",&a,&b);
		    	res=a/b;
		printf("%f/%f=%f",a,b,res);
	}
*/

	 else
	 {
        printf("Invalid Input.. Please try Again");

	}



	getch();

}


