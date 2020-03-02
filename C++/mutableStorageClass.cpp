#include<iostream>
using namespace std;
 
class mutable_test
 {
    public :mutable_test(int m, int n)
    {
        x = m;
        y = n;
    }
 
    int x;
    mutable int y;
 };
 
int main()
{
 
const mutable_test temp(2,7 ); // x = 5 and y = 3
 
cout << "x : " << temp.x << " y : " << temp.y << endl;
 
temp.y = 6; // correct because 'y' is mutable
 
cout << "x : " <<temp.x << " y : " <<temp.y << endl;
 
return 0;
 
}