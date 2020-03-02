#include<stdio.h>
#include<malloc.h>
#include<stdlib.h>
#include<math.h>

struct node
{
	int c,px,py,pz;
	struct node *link;
};

typedef struct node *NODE;

NODE getnode()
{
	NODE a;
	a=(NODE)malloc(sizeof(struct node));

	return a;
}

void display(NODE head)
{
	NODE cur;

	if(head->link==head)
	{
		printf("Nothing to display\n");
		return;
	}

	cur=head->link;

	while(cur!=head)
	{
		if(cur->c>0)printf("+%dx^%dy^%dz^%d",cur->c,cur->px,cur->py,cur->pz);
		else
			printf("%dx^%dy^%dz^%d",cur->c,cur->px,cur->py,cur->pz);

		cur=cur->link;
	}
	printf("\n");
}

NODE insert_rear(int c,int px,int py,int pz,NODE head)
{
	NODE temp,cur;

	temp=getnode();
	temp->c=c;
	temp->px=px;
	temp->py=py;
	temp->pz=pz;

	cur=head->link;

	while(cur->link!=head)cur=cur->link;

	cur->link=temp;
	temp->link=head;

	return head;
}

NODE read_poly(NODE head)
{
	int c,px,py,pz,n,i;

	printf("Enter the number of terms in  polynomial\n");
	scanf("%d",&n);

	for(i=0;i<n;i++)
	{
		printf("Coefficient:");scanf("%d",&c);
		printf("Power of x:");scanf("%d",&px);
		printf("Power of y:");scanf("%d",&py);
		printf("Power of z:");scanf("%d",&pz);

		head=insert_rear(c,px,py,pz,head);
	}

	return head;
}

NODE search(int px,int py,int pz,NODE head)
{
	NODE cur;

	if(head->link==head)return head;

	cur=head->link;
	while(cur!=head)
	{
		if(px==cur->px&&py==cur->py&&pz==cur->pz)break;

		cur=cur->link;
	}

	return cur;
}

NODE add_poly(NODE h1,NODE h2,NODE h3)
{
	NODE c1,c2;
	int sum;

	c1=h1->link;

	while(c1!=h1)
	{
		c2=search(c1->px,c1->py,c1->pz,h2);
		if(c2==h2) h3=insert_rear(c1->c,c1->px,c1->py,c1->pz,h3);

		else
		{
			sum=c1->c+c2->c;
			if(sum!=0)
				h3=insert_rear(sum,c1->px,c1->py,c1->pz,h3);
			c2->c=9999;
		}
		c1=c1->link;
	}

	c2=h2->link;
	while(c2!=h2)
	{
		if(c2->c!=9999)h3=insert_rear(c2->c,c2->px,c2->py,c2->pz,h3);

		c2=c2->link;
	}

	return h3;
}

double eval(NODE head)
{
	NODE cur;
	double sum=0;
	int x,y,z;

	if(head->link==head)return 0;

	printf("Enter the value of x,y and z\n");
	scanf("%d %d %d",&x,&y,&z);

	cur=head->link;

	while(cur!=head)
	{
		sum=sum+(cur->c)*(pow(x,cur->px))*(pow(y,cur->py))*(pow(z,cur->pz));
		cur=cur->link;
	}

	return sum;
}

void main()
{
	NODE h1,h2,h3;
	double res;

	h1=getnode();
	h1->link=h1;

	h2=getnode();
	h2->link=h2;

	h3=getnode();
	h3->link=h3;

	printf("POLY 1:\n");
	h1=read_poly(h1);

	printf("POLY 2:\n");
	h2=read_poly(h2);

	printf("Polynomial 1:\n");
	display(h1);

	printf("Polynomial 2:\n");
	display(h2);

	h3=add_poly(h1,h2,h3);

	printf("Polynomial 3:\n");
	display(h3);

	res=eval(h3);
	printf("Evaluated result=%lf\n",res);
}


