#include<stdio.h>
#include<stdlib.h>
#include<math.h>

??? THIS PROGRAM IS NOT WORKING ???
struct node
{
    int Info;
    struct node *Link;
};

typedef struct node *NODE;

NODE getNODE()
{
    NODE ptr;

    ptr = (NODE)malloc(sizeof(struct node));

    return ptr;
}


NODE insert_rear(int item,NODE first)
{
    NODE temp,CUR;
    temp = getNODE();
    temp->Info = item;
    temp->Link = NULL;

        if(first == NULL) return temp;

        CUR=first;
        while(CUR->Link!=NULL)
        {
            CUR=CUR->Link;
        }

        CUR->Link = temp;

        return first;
}


int max(int a[],int n)
{

    int i,big;

    big = a[0];

    for(i=1;i<n;i++)
        if(a[i]>big)  big = a[i];

    return big;

}



void radix_sort(int a[],int n)
{
    NODE b[10],temp;
    int i,j,k,m,big,item,digit;

    big = max(a,n);

    m = (int)(log10(big)+1);


    for(j=1;j<=m;j++)
    {
        for(i=0;i<10;i++)
        {
            b[i] = NULL;
        }

        for(i=0;i<n;i++)
        {
            item = a[i];

            digit = item/((int)pow(10,j-1)%10);
            b[digit] = insert_rear(item,b[digit]);

        }

        k=0;

        for(i=0;i<n;i++)
        {
            temp = b[i];

            while(temp!=NULL)
            {
                a[k++] = temp->Info;
                temp = temp->Link;
            }
        }
    }


}




void main()
{

    int a[20],n,i;

    printf("Enter the number of elements\n");
    scanf("%d",&n);

    printf("Enter %d elements\n",n);
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);

    radix_sort(a,n);


    printf("The sorted list is :\n");
    for(i=0;i<n;i++)
        printf("%d  ",a[i]);
}

