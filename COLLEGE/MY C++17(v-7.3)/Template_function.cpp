#include<iostream>

using namespace std;

template<class T>

T add (T x,T y)
{
    if(x>y)
        return x;
    else
        return y;

}

int main()
{
    int imax = add(8,10);
    cout<<"Max of int values : "<<imax<<endl;

    float fmax = add(8.2f , 2.7f);
    cout<<"Max of float values : "<<fmax<<endl;
}
