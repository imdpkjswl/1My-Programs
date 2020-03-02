#include<iostream>
#include<cstdio>

using namespace std;

int main()
{
    int n,a[50],i,j,temp;

    cout<<"Enter number of elements"<<endl;
    cin>>n;

    cout<<"Enter "<<n<<" elements"<<endl;
    for(i=0;i<n;i++)
        cin>>a[i];


    for(j=1;j<n;j++)
    {
        for(i=0;i<n-j;i++)
        {
            if(a[i]>a[i+1])
            {
                temp = a[i+1];
                a[i+1] = a[i];
                a[i] = temp;
            }

        }
    }

    cout<<"The sorted array is :"<<endl;
    for(i=0;i<n;i++)
        cout<<a[i]<<" ";

    return 0;
}
