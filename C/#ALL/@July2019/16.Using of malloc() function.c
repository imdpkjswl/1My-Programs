#include<stdio.h>

int main(void)

{
    int *a, n; //  By using malloc we can make an array without initial declaration and  store instantly n number of elements.

    printf("Enter the value of n\n");
    scanf("%d", &n);

    printf("Enter the %d elements\n",n);
    /// Reading n elements as well allocating memory bu using value of n.
    a = (int *)malloc(n*4); // 4 is size of int.
    for(int i = 0; i<n; i++)
    {
        scanf("%d", a+i);

    }
    /// Printing n elements
    for(int i = 0; i<n; i++)
    {
        printf("%d\t", *(a+i));

    }

    return 0;
}

