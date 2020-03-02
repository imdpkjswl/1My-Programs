#include <iostream>
using namespace std;
 
#include <iomanip>
using std::setw;
 
int main ()
{

   int n[ 10 ]; 
 
             
   for ( int i = 0; i < 10; i++ )
   {
      n[ i ] = i + 100;
   }
   cout << "Element" << setw( 13) << "Value" << endl; // setw() function to format the output.
 
                    
   for ( int j = 0; j < 10; j++ ) 
   {
      cout << setw( 4 )<< j << setw( 15 ) << n[ j ] << endl;
   }
 
   return 0;
}