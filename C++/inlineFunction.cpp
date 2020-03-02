#include <iostream>
 
using namespace std;

inline int Max(int x, int y) // SYNTAX FOR INLINE FUNCTION.
{
   return (x > y)? x : y;
}

// Main function for the program
int main() {
   cout << "Max (20,40): " << Max(20,40) << endl;
   cout << "Max (0,200): " << Max(0,200) << endl;
   cout << "Max (1001,100): " << Max(1001,100) << endl;
   
   return 0;
}