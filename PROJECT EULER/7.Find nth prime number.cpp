#include<iostream>

using namespace std;

int main()
{
    int result;
    int n, num = 3, term, i;

    cout<<"Enter the number of prime numbers to print\n";
    cin>>n;

    if (n >= 1) {
        cout<<"First "<<n<<" prime numbers are:\n";
        cout<<"2  ";
    }

    for (term = 2; term <= n;)
    {

        for (i = 2; i <= num ; i++)
        {
            if (num%i == 0)
                break;
        }

        if (i == num)
        {
            result = num;
            cout<<num<<"  ";
            term++;
        }

        num++;

    }

    cout<<endl<<n<<"th prime number is :  "<<result<<endl;
    return 0;
}
