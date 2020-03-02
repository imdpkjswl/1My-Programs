#include<iostream>
#include<conio.h>
using namespace std;

int main()
{

	int mat1[10][10], mat2[10][10], mat3[10][10], sum=0, i, j, k;
	int m,n,p,q;

	cout<<"Enter size of first matrix :"<<endl;
	cin>>m>>n;
	cout<<"Enter first matrix element (m*n) : \n";
	for(i=0; i<m; i++)
	{
		for(j=0; j<n; j++)
		{
			cin>>mat1[i][j];
		}
	}

	cout<<"Enter size of second matrix :"<<endl;
	cin>>p>>q;

	cout<<"Enter second matrix element (p*q) : \n";
	for(i=0; i<p; i++)
	{
		for(j=0; j<q; j++)
		{
			cin>>mat2[i][j];
		}
	}

	if(n != p)
    {
        cout<<"Multiplication of matrices not possible !!!"<<endl;
        exit(0);
    }

	cout<<"Multiplying two matrices...\n";
	for(i=0; i<m; i++)
	{
		for(j=0; j<q; j++)
		{
			sum=0;
			for(k=0; k<n; k++)
			{
				sum += mat1[i][k] * mat2[k][j];
			}
			mat3[i][j] = sum;
		}
	}

	cout<<"\nMultiplication of two Matrices : \n";
	for(i=0; i<m; i++)
	{
		for(j=0; j<p; j++)
		{
			cout<<mat3[i][j]<<" ";
		}
		cout<<"\n";
	}
	getch();

}
