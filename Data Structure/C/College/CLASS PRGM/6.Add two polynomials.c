#include<stdio.h>
#include<stdlib.h>
#include<conio.h>

typedef struct
{
    int cf;
    int px;

}TERM;


void read_poly(TERM p[],int n)
{

    int i;

    for(i=0;i<n;i++)
    {
        printf("Enter the coefficient and power of x\n");
        scanf("%d %d",&p[i].cf,&p[i].px);
    }
}

void print_poly(TERM p[],int n)
{

    int i;

    for(i=0;i<n;i++)
    {

        if(p[i].cf>0)
                printf("+%d",p[i].cf);
        else
                printf("%d",p[i].cf);

        printf("x^%d ",p[i].px);

    }
	printf("\n");
}

int search(int px1,TERM p[],int n)
{
    int i,px2;

    for(i=0;i<n;i++)
    {
        px2==p[i].px;
        if(px1==px2)
            return i;
    }

    return -1;

}

int add_poly(TERM p1[],int m,TERM p2[],int n,TERM p3[])
{
    int i,k,pos,sum;
    k=0;
    for(i=0;i<m;i++)
    {
        pos = search(p1[i].px,p2,n);

        if(pos!= -1)
        {
            sum = p1[i].cf +p2[pos].cf;
            p2[pos].cf = 0;


         if(sum!= 0)
         {
             p3[k].cf = sum;
             p3[k].px = p1[i].px;
             k++;
         }
        }
        else
        {
            p3[k].cf = p1[i].cf;
            p3[k].px = p1[i].px;
            k++;
        }

    }

    for(i=0;i<n;i++)
    {
        if(p2[i].cf != 0)
        {
            p3[k].cf = p2[i].cf;
            p3[k].px = p2[i].px;
            k++;

        }
    }

    return k; /// No. of terms in resultant polynomial.
}

void main()
{
    TERM p1[100],p2[100],p3[100];
    int m,n,mn;

    printf("Enter the number of term of 1st polynomial\n");
    scanf("%d",&m);

    printf("Enter %d terms\n",m);
    read_poly(p1,m);

    printf("Enter the number of term of 2nd polynomial\n");
    scanf("%d",&n);

    printf("Enter %d terms\n",n);
    read_poly(p2,n);

    printf("P1:");
    print_poly(p1,m);
    printf("P2:");
    print_poly(p2,n);

    mn= add_poly(p1,m,p2,n,p3);

    printf("P3:");
    print_poly(p3,mn);

    return;
}



