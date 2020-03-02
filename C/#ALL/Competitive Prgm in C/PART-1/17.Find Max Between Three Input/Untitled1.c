#include<stdio.h>

int main()

{
    int a,b,c;
    printf("Enter The Three Number :\n");
    scanf("%d%d%d",&a,&b,&c);
    if(a>b && a<c)
        printf("Max : %d\n",a);
    else if(b>c)
        printf("Max : %d",b);
    else
        printf("max : %d",c);
    getch();


}
