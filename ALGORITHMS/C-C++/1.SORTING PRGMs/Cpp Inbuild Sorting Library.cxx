#include<iostream>
#include<algorithm>

using namespace std;

int main()
{

    int n,i,j;
    cout<<"Enter the number of elements"<<endl;
    cin>>n;

    int a[n];
    cout<<"Enter "<<n<<" elements : "<<endl;
    for(i=0;i<n;i++)
        cin>>a[i];

    sort(a,a+n);

    for(i=0;i<n;i++)
    {
        if(i<n-1)
            cout<<a[i]<<", ";
        else
            cout<<a[i];

    }



    return 0;

}


