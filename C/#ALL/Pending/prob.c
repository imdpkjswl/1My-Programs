#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
void main()

{
	float a,b,res;
	char str1[20], plus[20] = {'+'}, minus[20] = {'-'};
	//system("clear");
	printf("Enter '+' to compute addition, '-' to compute subtraction, '*' to compute multiplication, '/' to compute division \n");
	printf("Enter your choice \n");
	scanf("%s",str1);
	printf("\n%s\n",str1);

    if(strcmp(str1,plus)==0){
	printf("Enter Two Numbers\n");
	scanf("%f %f",&a,&b);
		printf("%f+%f=%f\n",a,b,a+b);}
	else if(strcmp(str1,minus)==0){
	printf("Enter Two Numbers\n");
	scanf("%f %f",&a,&b);
		printf("%f-%f=%f\n",a,b,fabs(a-b));}

	       /*else
	{     	if(op=='-')
		{	res=a-b;
		printf("%f%c%f=%f",a,op,b,res);
	}
	else
	{     	if(op=='*')
		{	res=a*b;
		printf("%f%c%f=%f",a,op,b,res);
	}
	else
	{     	if(op=='/')
		{	res=a/b;
		printf("%f%c%f=%f",a,op,b,res);
	}*/
	 else
	 {
        printf("Invalid Input.. Please try Again");

	}
	getch();

}


