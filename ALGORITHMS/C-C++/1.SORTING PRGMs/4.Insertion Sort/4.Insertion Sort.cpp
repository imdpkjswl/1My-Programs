#include<iostream>

using namespace std;

int main()
{

    int n,i,j,pos,temp;
    cout<<"Enter the number of elements"<<endl;
    cin>>n;

    int a[n];
    cout<<"Enter "<<n<<" elements : "<<endl;
    for(i=0;i<n;i++)
        cin>>a[i];

    for(i=0;i<n-1;i++)
    {
        pos = i;
        for(j=i+1;j<n;j++)
        {
            if(a[pos] > a[j])
                pos = j;
        }

        temp = a[pos];
        a[pos] = a[i];
        a[i] = temp;
    }

    cout<<"The sorted array is :"<<endl;
    for(i=0;i<n;i++)
    {
        if(i<n-1)
            cout<<a[i]<<", ";
        else
            cout<<a[i];
    }


    return 0;

}

