#include<iostream>

using namespace std;

int main()
{

    float a, b, c;
    int  i,n;
    cout<<"How many division you want to do:"<<endl;
    cin>>n;

    for(i=0; i<n; i++)
    {
        cout << "\n Enter 2 numbers" ;
        cin >> a >> b ;

        if(b == 0)
        {
            cout << "\n The denominator cannot be zero" << "Enter again !";
            continue; /// This will skip the next instruction to execute.
        }
        else
            c = a/b ;
            cout << "\n Quotient =" << c << "\n" ;
    }

}
