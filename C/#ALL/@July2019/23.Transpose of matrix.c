#include<stdio.h>
#include<conio.h>
/*
void main()
{
    int mat[50][50],trans[50][50],m,n,i,j;

    ///Input size of matrix
    printf("Enter the size of matrix\n");
    scanf("%d %d",&m,&n);

    printf("Enter the elements of matrix\n");

    /// Input elements of matrix
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            scanf("%d",&mat[i][j]);
        }
    }

    /// Find the transpose of matrix
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            trans[j][i] = mat[i][j];
        }
    }

    ///Display the transposed matrix
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            printf("%d  ",trans[i][j]);
        }
        printf("\n");
    }

    getch();


}
*/
/// ANOTHER METHOD

void main()
{
    int mat[50][50],m,n,i,j;

    ///Input size of matrix
    printf("Enter the size of matrix\n");
    scanf("%d %d",&m,&n);

    printf("Enter the elements of matrix\n");

    /// Input elements of matrix
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            scanf("%d",&mat[i][j]);
        }
    }

    ///Display the transposed matrix(column wise)
    for(j=0;j<m;j++)
    {
        for(i=0;i<n;i++)
        {
         printf("%d  ",mat[i][j]);//   printf("%d  ",trans[i][j]);
        }
        printf("\n");
    }

    getch();
}
