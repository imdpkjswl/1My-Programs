#include<Stdio.h>

void display_array(int a[], int n)
{
    if(n== -1) return ;

    printf("\n%d",a[n]);

    return display_array(a,n-1);

}


void main()
{
    int a[100],n,i;

    printf("Enter the number of elements\n");
    scanf("%d",&n);

    printf("Enter %d elements :\n",n);

    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }

    display_array(a,n-1);

    return;
}
