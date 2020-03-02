#include<stdio.h>
#include<conio.h>
main()
{
    void add(void);
    add();
    getch();

}

void add()
{
    int a,b,c;
    printf("enter two number");
    scanf("%d%d",&a,&b);
    c=a+b;
    printf("Sum is %d",c);
}
