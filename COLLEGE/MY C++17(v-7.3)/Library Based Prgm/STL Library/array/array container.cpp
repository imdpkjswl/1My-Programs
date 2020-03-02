/*
Definition:
Below is definition of std::array from <array> header file.
template < class T, size_t N >
class array;
// Where, T is type of elements & N is number of elements.
*/

#include<iostream>
#include<array>

using namespace std;

int main()
{
    array <int ,10> obj={12,13,14,15,16};
    cout<<"value of 4th index : "<<obj.at(4)<<endl<<endl; // Used to access value of array at any index by using " object.at(index_number) " function.

    if(obj.empty()) // .empty() function return 1 , when array size is empty.
        cout<<"Array size is Empty"<<endl<<endl;
    else
        cout<<"Array size is N"<<endl<<endl;

    cout<<"Maximum size of array is :  "<<obj.max_size()<<endl; // .max_size() used to find max size of array.


    return 0;
}
