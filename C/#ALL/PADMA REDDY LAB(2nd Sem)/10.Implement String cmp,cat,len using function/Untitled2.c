#include<stdio.h>

int mylen(char s[20])
{
    int i=0;

    while(s[i] !='\0')
    {
        i++;
    }

    return i;
}

void mycat(char s1[20] , char s2[20])
{
    int i,j;
    i=0;
    j=0;

    while(s1[i] != '\0')
    {
        i++;
    }

    while(s2[j] != '\0')
    {
        s1[i++]=s2[j++];

    }

    s1[i++] = '\0';

}

int mycmp(char s1[20] , char s2[20])
{
    int i;
    i=0;

    while(s1[i]==s2[i])
    {
        if(s1[i] == '\0')  break;
        i++;
    }

    return s1[i]-s2[i];
}

void main()
{
    char s1[20],s2[20];

    printf("Enter the first string\n");
    scanf("%s",s1);

    printf("Enter the second string\n");
    scanf("%s",s2);

    printf("Length of first string %d\n",mylen(s1));
    printf("Length of second string %d\n",mylen(s2));

    if(mycmp(s1,s2)>0)
        printf("S1>S2\n");
    else if(mycmp(s1,s2)<0)
        printf("S1<S2\n");
    else
        printf("S1 = S2\n");


    mycat(s1,s2);
    printf("%s\n",s1);

}
