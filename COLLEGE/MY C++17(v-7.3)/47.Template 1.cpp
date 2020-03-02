/* // A class template is known as Generic class.
    * The keyword template is used to define function template and class template.
    * It is a way to make your function or class generalize as far as data type is concern.
*/

#include<iostream>
#include<conio.h>
using namespace std;

template <class type1,class type2> // this whole thing "class type1" is known as place holder...

type2 big(type1 a,type2 b)
{
    if(a>b)
        return a;
    else
        return b;
}

int main()
{

    float a,b;
    cout<<"Enter two number :"<<endl;
    cin>>a>>b;

    cout<<"Bigger number is :  "<<big(a,b)<<endl;

    return 0;
}



