#include<iostream>
#include<conio.h>

using namespace std;

void fun(int a, int *b)
{
	a = *(b) += 2;
}

int main(void)
{

	int arr[5] = {2, 4, 6, 8, 10};
	int i, b=5;

	cout<<"CODE:\nint arr[5] = {2, 4, 6, 8, 10};\nint i, b=5;"<<endl<<endl;

	cout <<"arr[index]: "<< "\t" <<"b: "<<endl;
	for(i=0; i<5; i++)
	{
		fun(arr[i], &b);
        cout << arr[i] << "\t-->\t" << b <<endl;
	}
	cout<<"b value got changed.a[i]th value added to b."<<endl;

    getch();
	return 0;
}

