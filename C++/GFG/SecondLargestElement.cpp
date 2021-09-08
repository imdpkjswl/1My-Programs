#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n= 7;
    int arr[] = {12, 35, 1, 10, 34, 1, 43};
    
    int prev=-1, cur=-1;

    for(int i=0;i<n;i++){
        if(arr[i] > cur){
            prev = cur;
            cur = arr[i];
        }

        // arr[i] is in between cur and prev
        if(cur != arr[i] && arr[i] > prev){
            prev = arr[i];
        }
    }
    
    cout<<prev<<endl;

    return 0;
}
