#include<bits/stdc++.h>
using namespace std;

int main()
{
    int a[] = {7, 2, 3, 0, 5, 10, 3, 12, 18};
    
    int query1[] = {0, 4};
    int query2[] = {4, 7}; 
    int query3[] = {7, 8};

    // Naive solution
    int min = 999999999;
    for(int i=query1[0];i<=query1[1];i++){
        if(a[i]<min){
            min = a[i];
        }
    }
    cout<<min<<endl;

    return 0;
}