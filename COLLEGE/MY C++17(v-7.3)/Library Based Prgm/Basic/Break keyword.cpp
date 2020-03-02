#include<iostream>

using namespace std;

int main()
{
    float a, b, c;
    int n,i;

    cout<<"How many division you want to do:"<<endl;
    cin>>n;
    for(i=0; i<n; i++)
    {
        cout << "Enter 2 numbers" ;
        cin >> a >> b ;
        if(b == 0)
            break; // when b ==0 ,the we come out from for loop.
        else
            c = a/b ;
    cout << "\n Quotient =" << c << "\n" ;
    }
}
