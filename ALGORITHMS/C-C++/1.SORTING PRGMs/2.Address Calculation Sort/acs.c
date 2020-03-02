#include<stdio.h>
#include<stdlib.h>
#include<math.h>


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


int max(int a[],int n)
{

    int i,big;

    big = a[0];

    for(i=1;i<n;i++)
        if(a[i]>big)  big = a[i];

    return big;

}


NODE insert_order(int item,NODE first)
{
    NODE temp,CUR,PREV;

    temp = getNODE();
    temp->Info = item;
    temp->Link = NULL;

    if(first == NULL)  return temp;

    if(item<= first->Info)
    {
        temp->Link = first;
        return temp;
    }

    CUR = first;
    while(CUR != NULL  && item >CUR->Info)
    {
        PREV = CUR;
        CUR = CUR->Link;

    }

    PREV->Link = temp;
    temp->Link = CUR;

    return first;

}


void address_cal_sort(int a[],int n)
{
    NODE CUR,b[10];
    int i,big,h_value,k,item,digit;

    big = max(a,n);

    h_value = (int)pow(10,(int)log10(big));


    for(i=0;i<10;i++)
    {
        b[i] = NULL;
    }


    for(i=0;i<n;i++)
    {

        item = a[i];

        digit = item/h_value;

        b[digit] = insert_order(item,b[digit]);

    }

    k=0;
    for(i=0;i<10;i++)
    {
        CUR = b[i];

        while(CUR!=NULL)
        {
            a[k++] = CUR->Info;
            CUR = CUR->Link;
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

    address_cal_sort(a,n);

    for(i=0;i<n;i++)
        printf("%d  ",a[i]);
}
