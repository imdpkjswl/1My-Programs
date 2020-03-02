#include<stdio.h>
#include<process.h>
int a[100],n,i;

/*  <---------- NOT WORKING PROPERLY ---------->  */
void main()
{
    int ch;

    printf("Enter the size of array\n");
    scanf("%d",&n);
    printf("Enter %d elements of array\n",n);
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);

    for(;;)
    {
        printf("1.Enter to insert an item\n");
        printf("2.Enter to traverse an array\n");
        printf("3.Enter to delete an item\n");
        printf("4.Enter to Merge an array into our array\n");
        printf("5.Enter to search an item\n");
        printf("6.Enter to update an item\n");
        printf("7.Exit\nEnter your choice\n");
        scanf("%d",&ch);

        switch(ch)
        {
        case 1:
            insert();
            break;

        case 2:
            traverse();
            break;

        case 3:
            delete();
            break;

        case 4:
            merge();
            break;

        case 5:
            search();
            break;

        case 6:
            update();
            break;

        case 7:
            exit(0);
        }
    }

}


void traverse()
{
    if(a[0] == NULL) return;

    printf("The array is :\n");
    for(i=0;i<n;i++)
        printf("%d\t",a[i]);

    printf("\n");

}


void delete()
{
    int item,k,loc;

    if(n==0)
    {
        printf("EnderFlow\n");
        return;
    }

    printf("Enter the position where the item is to be deleted\n");
    scanf("%d",&loc);

    item = a[loc-1];
    printf("The deleted item is %d\n",item);
    for(k=loc-1;k<=n-2;k++)
        a[k] = a[k+1];

}

void insert()
{
    int item,k,loc;

    printf("Enter the item to be inserted\n");
    scanf("%d",&item);

    printf("Enter the location at which the item to be inserted\n");
    scanf("%d",&loc);

    for(k=n;k>=loc-1;k--)
        a[k+1] = a[k];

    a[loc-1] = item;
}


void search()
{
    int i=0,pos=0,item;
    printf("Enter the item\n");
    scanf("%d",&item);

    while(i<n && a[i]!=item)
    {
        i = i+1;
    }

    if(a[i] == item)
    {
        pos=i;
        printf("The item if found at position  %d\n",pos+1);
    }
    else if(i==n)
    {
        printf("Item is not found\n");
        return;
    }
}

void merge()
{
    int new[100],total[200],m,k=0,j=0;
    printf("Enter the size of new array\n");
    scanf("%d",&m);
    printf("Enter %d elements of array\n",m);
    for(i=0;i<m;i++)
        scanf("%d",&new[i]);

    i=0;

    while(i<n)
    {
        total[k++] =a[i++];
    }
    while(j<m)
    {
        total[k++] = new[j++];
    }

    printf("The merged array is :\n");
    for(i=0;i<k;i++)
        printf("%d\t",total[i]);
    printf("\n");


}


void update()
{
    int newITEM,pos;

    printf("Enter the position at which item is to be inserted\n");
    scanf("%d",&pos);

    printf("Enter the new item\n");
    scanf("%d",&newITEM);

    a[pos-1] = newITEM;

}
