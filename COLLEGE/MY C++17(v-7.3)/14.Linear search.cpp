#include<iostream>

using namespace std;

int main()
{
    int n;
    cout<<"Enter the no. of elements :"<<endl;
    cin>>n;
    int a[n];
    cout<<"Enter the "<<n<<" elements"<<endl;
    for(int i=0;i<n;i++)
        cin>>a[i];

    int key;

    cout<<"Enter the key to be searched"<<endl;
    cin>>key;

    for(int i=0;i<10;i++)
    {
        if(key == a[i])
        {
            cout<<"Key is found"<<endl;
            return 0;
        }
    }

    cout<<"Key is not found"<<endl;

    return 0;

}
