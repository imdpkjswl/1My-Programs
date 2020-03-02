#include <iostream>
using namespace std;

int add(int m, int n)
{
    int sum;
    sum = m + n;

    return sum;
}

int main()
{
    int a, b, res;

    cout << "Enter two number"<<endl;
    cin >> a >> b;

    res = add(a, b);

    cout << "Sum of " << a << " and " << b << " is : " << res << endl;

    return 0;
}