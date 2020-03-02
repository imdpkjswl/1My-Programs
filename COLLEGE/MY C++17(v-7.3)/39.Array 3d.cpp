/// Program to add 3d matrices

#include<iostream>
#include<conio.h>

using namespace std;

int main()
{

    int a[10][10][10],b[10][10][10],i,j,k;
    int r1,c1,h1;
    int r2,c2,h2;
    int c[10][10][10];

    cout<<"Enter size of first (3D) matrix :"<<endl;
    cin>>r1>>c1>>h1;

    for(i=0;i<r1;i++)
    {
        for(j=0;j<c1;j++)
        {
            for(k=0;k<h1;k++)
            {
                cin>>a[i][j][k];
            }
        }
    }

    cout<<"Enter size of second (3D) matrix :"<<endl;
    cin>>r2>>c2>>h2;

    if(r1 != r2 || c1 != c2 || h1 != h2)
    {
        cout<<"Addition can't be performed !!!"<<endl;
        exit(0);
    }

    for(i=0;i<r2;i++)
    {
        for(j=0;j<c2;j++)
        {
            for(k=0;k<h2;k++)
            {
                cin>>a[i][j][k];
            }
        }
    }


    cout<<"Addition of matrices are :"<<endl;
    for(i=0;i<r1;i++)
    {
        for(j=0;j<c1;j++)
        {
            for(k=0;k<h1;k++)
            {
                c[i][j][k] = a[i][j][k] + b[i][j][k];
            }
        }
    }


    for(i=0;i<r1;i++)
    {
        for(j=0;j<c1;j++)
        {
            for(k=0;k<h1;k++)
            {
                cout<<a[i][j][k]<<"  ";
            }
            cout<<endl;
        }
        cout<<endl;
    }

    cout<<endl;


}
