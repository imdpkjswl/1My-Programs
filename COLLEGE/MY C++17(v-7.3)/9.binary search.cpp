#include<iostream>

using namespace std;

int main()
{
    int n,low,high,mid;
    cout<<"Enter the no. of elements :"<<endl;
    cin>>n;
    int a[n];
    cout<<"Enter the "<<n<<" elements in ascending order for Binary Search"<<endl;
    for(int i=0;i<n;i++)
        cin>>a[i];

    int key;

    cout<<"Enter the key to be searched"<<endl;
    cin>>key;


    low=0;
    high = n-1;
    while(low<=high)
    {
        mid = (low+high)/2;

        if(key == a[mid])
        {
            cout<<"Key is found"<<endl;
            return 0;
        }
        else if(key < a[mid])
            high = mid-1;
        else
            low = mid +1;

    }

    cout<<"Key is not found"<<endl;

    return 0;

}
