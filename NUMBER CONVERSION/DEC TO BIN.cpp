#include<iostream>
#include<cstdlib>

using namespace std;

void decToBinary(int n)
{
    // array to store binary number
    int bin[50];

    // counter for binary array
    int i = 0 ;
    while (n > 0)
    {
        // storing remainder in binary array
        bin[i] = n % 2;
        n = n / 2;
        i++;
    }

    // printing binary array in reverse order
    for (int j = i - 1; j >= 0; j--)
        cout << bin[j];

}


int main()
{

    int dec;

    for(;;)
    {
        cout<<"Enter any decimal number"<<endl;
        cin>>dec;

        decToBinary(dec);

        cout<<"\n\nFor exit,Press 1"<<endl;
        cin>>dec;
        if(dec == 1)
            exit(0);

    }
    return 0;

}
