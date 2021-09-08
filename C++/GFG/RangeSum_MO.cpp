#include<bits/stdc++.h>
using namespace std;

/*The idea of MO’s algorithm is to pre-process all queries so that 
result of one query can be used in next query.
*/
int main() {
    int n = 9;
    int a[] = {1, 1, 2, 1, 3, 4, 5, 2, 8};
    int range1[] ={0,4};
    int range2[] ={1,3};
    int range3[] ={2,4};

    // Prepocessing the array with sum
    int sum=0;
    for(int i=0;i<n;i++){
        sum += a[i];
        a[i] = sum; // assign sum of all previous elements here
    } 

    //for(auto val : a) { cout<<val<<" "; }

    // Finding sum of given range
    if(range1[0]==0){
        // for i==0,simply print jth value
        cout<<"["<<range1[0]<<", "<<range1[1]<<"] --> "<<a[range1[1]]<<endl;
    }else{
        // for i!=0, subtract jth value - (ith-1) value
        cout<<"["<<range1[0]<<", "<<range1[1]<<"] --> "<<a[range1[1]]-a[range1[0]-1]<<endl;
    }   


     if(range2[0]==0){
        cout<<"["<<range2[0]<<", "<<range2[1]<<"] --> "<<a[range2[1]]<<endl;
    }else{
        cout<<"["<<range2[0]<<", "<<range2[1]<<"] --> "<<a[range2[1]]-a[range2[0]-1]<<endl;
    }  


     if(range3[0]==0){
        cout<<"["<<range3[0]<<", "<<range3[1]<<"] --> "<<a[range3[1]]<<endl;
    }else{
        cout<<"["<<range3[0]<<", "<<range3[1]<<"] --> "<<a[range3[1]]-a[range3[0]-1]<<endl;
    }  

}