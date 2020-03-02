#include<stdio.h>
#include<stdlib.h>

void won(int sum,int final);


void main()
{
	printf("\n\nAbout Game :\nThis is a Puzzle type game which may played between two player.\n");
	printf("In which players have to chase the target value from the given value by using no. of turns.\n\n");
	
	
	int initial,final,turn,sum,i,count,temp;
	
	printf("Enter the inital value\n");
	scanf("%d",&initial);
	
	printf("Enter the final value\n");
	scanf("%d",&final);
	
	if(final < initial)
	{
		printf("Enter the correct values\n");
		return;
	}
	
	sum += initial;
	
	printf("Enter the number of turns\n");
	scanf("%d",&turn);
	
	for(;;)
	{
		printf("CURRENT VALUE  : %d\n\n",sum);
		printf("Player 1 turn :\nPut zero for nothing\n");
		
		for(i=0;i<turn;i++)
		{
			scanf("%d",&temp);
			sum += temp;
			printf("CURRENT VALUE  : %d\n\n",sum);
			won(sum,final);
		}

		printf("...................................................................\n");
		printf("Player 2 turn :\nPut zero for nothing\n");
		
		for(i=0;i<turn;i++)
		{
			scanf("%d",&temp);
			sum += temp;
			printf("CURRENT VALUE  : %d\n\n",sum);
			won(sum,final);
		}
		
		
		if(sum==final || sum>final)
			exit(0);
		
	}
	
}







void won(int sum,int final)
{
	int a;
	
	if(sum > final)
	{
		printf("You have exceeded the Target vallue : %d\n\n",final);
		printf("Do you want to restart the game ? Press 1 button otherwise Press any key to closed the game.\n");
		scanf("%d",&a);
		
		if(a == 1)
			main();
		else
			printf("Thanks For Playing.\n");
	}
	
	if(sum==final)
	{
			printf("You Won\n\n");
			printf("Do you want to restart the game ? Press 1 button otherwise Press any key to closed the game.\n");
			scanf("%d",&a);
		
		if(a == 1)
			main();
		else
			printf("Nice Played :) :) :)\n");
	}
}

