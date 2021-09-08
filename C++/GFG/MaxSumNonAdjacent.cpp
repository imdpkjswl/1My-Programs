#include<bits/stdc++.h>

using namespace std;

int main()
{
    int arr[] = {5, 5, 10, 100, 10, 5};

    int max = 0;

    for(int i=1;i<6;i++){
        if(arr[i] != arr[i-1]){
            max < (arr[i]+arr[i-1]) ? max=arr[i]+arr[i-1]:0;
        }
    }

    cout<<max<<endl;

    return 0;
}