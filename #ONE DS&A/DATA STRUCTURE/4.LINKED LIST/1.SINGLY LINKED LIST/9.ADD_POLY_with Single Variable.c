#include<stdio.h>
#include<stdlib.h>
#include<malloc.h>
#include<math.h>

struct node
{
	int cf;
	int px;
	
	struct node* Link;
};

typedef struct node *NODE;



NODE getNODE()
{
	NODE ptr;
	
	ptr = (NODE)malloc(sizeof(struct node));
	
	if(ptr ==NULL)
	{
		printf("Allocation failed\n");
		return NULL;
	}
}

NODE insert_rear(int coeff, int power,NODE head)
{
	NODE temp,CUR;
	
	temp= getNODE();
	
	temp->cf = coeff;
	temp->px = power;
	
	CUR = head->Link;
	while(CUR->Link!=head)
		CUR=CUR->Link;
		
	CUR->Link = temp;
	temp->Link=head;
	
	return head;
}


NODE read_poly(NODE head)
{
	int i,m ,cff,poww;
	
	printf("Enter the no. of term\n");
	scanf("%d",&m);
	
	for(i=1;i<=m;i++)
	{
		printf("Enter coefficient:\n");
		scanf("%d",&cff);
		printf("Enter power : ");
		scanf("%d",&poww);
		
		head = insert_rear(cff,poww,head);
	}
	
	return head;
}


void display(NODE head)
{
	int flag =1;
	
	if(head->Link == head)
	{
		printf("NULL\n");
		return;
	}
	
	printf("The polynomial is :\n");
	
	NODE CUR = head->Link;
	
	while(CUR!=head)
	{
		if(flag ==1)
		{
			printf("%d^%d",CUR->cf,CUR->px);
			flag = 0;
		}
			
			
		if(CUR->cf >0)
			printf("+%d^%d",CUR->cf,CUR->px);
		else
			printf("%d^%d",CUR->cf,CUR->px);
			
		CUR = CUR->Link;
	}
	
	printf("\n");
}


NODE search_term(int power,NODE head)
{
	
	
	if(head->Link == head)
	{
		printf("NULL\n");
		return NULL;
	 } 
	 
	 NODE CUR = head->Link;
	 
	 while(CUR!=head)
	 {
	 	if(CUR->px == power)
	 		return CUR;
		
		
		CUR =CUR->Link;
		
	 }
	 
	 return head;
}

NODE add_poly(NODE H1,NODE H2,NODE H3)
{
	NODE C1,C2;
	
	
	int px,sum;
	
	C1 = H1->Link;
	
	while(C1 != H1)
	{
		px =C1->px;
	
		C2 = search_term(px,H2);
		
		if(C2!=H2)
		{
			sum= C1->cf + C2->cf;
			
			if(sum!= 0) 
				H3 = insert_rear(sum,px,H3);
				
			C2->cf = 0;
			
		}
		else
			H3 = insert_rear(C1->cf,C1->px,H3);
			
		
		C1=C1->Link;
	}
	
	// cHECK FOR REMAINING
	C2 = H2->Link;
	
	while(C2!=H2)
	{
		if(C2->cf != 0)
			H3 = insert_rear(C2->cf,C2->px,H3);
			
		C2=C2->Link;
		
	}
	
	return H3;
}


double evaluate_poly(int x,NODE head)
{
	NODE CUR;
	
	double sum=0;
	
	CUR = head->Link;
	
	while(CUR!= head)
	{
		sum += (CUR->cf)*pow(x,CUR->px);
		
		CUR =  CUR->Link;
		
	}
	
	return sum;
}


void main()
{
	int x;
	
	double res1,res2;
	
	NODE H1,H2,H3;
	
	H1 =getNODE();
	H1->Link = H1;
	
	H2 =getNODE();
	H2->Link = H2;
	
	H3 =getNODE();
	H3->Link = H3;
	
	printf("Enter the first polynomial :\n");
	H1 = read_poly(H1);
	
	printf("Enter the second polynomial :\n");
	H2 = read_poly(H2);
	
	printf("Enter the value of x\n");
	scanf("%d",&x);
	
	res1 = evaluate_poly(x,H1);
	res2 = evaluate_poly(x,H2);
	
	printf("RES1 = %lf\nRES2 = %lf\n",res1,res2);
	
	printf("POLY1: "); display(H1);
	printf("POLY2: "); display(H2);
	
	H3 = add_poly(H1,H2,H3);
	printf("POLY3: "); display(H3);
	
	
	
}
