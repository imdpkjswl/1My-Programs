#include<stdio.h>

int binary_search(int item,int a[],int n)
{
    int low=0,mid,high=n-1;

    while(low<=high)
    {
        mid=(low+high)/2;

        if(item == a[mid]) return mid;
        else if(item < a[mid])
                    high=mid-1;
        else
                    low=mid+1;
    }

    return -1;
}

void main()
{
    int item,a[20],n,res;

    printf("Enter the value of n\n");
    scanf("%d",&n);

    printf("Enter the %d elements\n",n);

    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }

    printf("Enter the item to be searched\n");
    scanf("%d",&item);

    res=binary_search(item,a,n);

    if(res == -1)
        printf("Item not found\n");
    else
        printf("Item  found at position %d\n",res);
}
