#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n = 5;
    int arr[n];

    for(int i=0;i<n;i++){
        cin>>arr[i];
    }

    int *p;

    p = &arr[0];// p = arr; // Now arr and p are pointing to the same address

    for(int i=0;i<n;i++){
        cout<<p[i]<<endl;
    }
}