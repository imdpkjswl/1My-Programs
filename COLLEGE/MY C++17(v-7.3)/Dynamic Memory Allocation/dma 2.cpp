/*
 * This is the same program as previous one, but this
 * program uses two-dimensional array to demonstrates
 * dynamic memory allocation in C++. This C++ program
 * also displays the rowsum and the colsum of the array */

#include<iostream>
#include<conio.h>
#include<cstdlib>
using namespace std;

int main()
{

	int maxr, maxc, i, j;

	cout << "Enter the dimension of the array (row x column): "<<endl;
	cin >> maxr >> maxc;
	int *val = new int[maxr * maxc];
	int *rowsum = new int[maxr];
	int *colsum = new int[maxc];

	for(i = 0; i < maxr; i++)
	{
		cout<<"Enter elements for row "<<i+1<<" : "<<endl;
		rowsum[i] = 0;
		for(j=0; j<maxc; j++)
		{
			cin>>val[i*maxc + j];
			rowsum[i] = rowsum[i] + val[i*maxc + j];
		}
	}

	for(j=0; j<maxc; j++)
	{
		colsum[j] = 0;
		for(i=0; i<maxr; i++)
		{
			colsum[j] = colsum[j] + val[i*maxc + j];
		}
	}

	cout<<"\nThe given array in two dimensional (alongwith rowsum and colsum) is :\n";
	for(i=0; i<maxr; i++)
	{
		for(j=0; j<maxc; j++)
		{
			cout<<val[i*maxc + j]<<"\t";
		}
		cout<<rowsum[i]<<"\n";
	}

	for(j=0; j<maxc; j++)
	{
		cout<<colsum[j]<<"\t";
	}
	cout<<"\n";

	getch();
}
