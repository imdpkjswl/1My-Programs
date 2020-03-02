#include <iostream>
using namespace std;
 
int main () 
{
   // Local variable declaration:
   int x, y = 20;

   x = (y < 15) ? 40 : 60;
   cout << "value of x: " << x << endl;
 
   return 0;
}