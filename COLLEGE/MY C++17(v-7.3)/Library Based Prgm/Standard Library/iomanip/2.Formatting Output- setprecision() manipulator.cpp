#include<iostream>
#include<iomanip>


/*
Format Value 	         Meaning
left 	           ==      left-justify the output
right 	           ==      right-justify the output
showpoint 	       ==      displays decimal point and trailing zeros for all floating point numbers, even if the decimal places are not needed
uppercase 	       ==      display the "e" in E-notation as "E" rather than "e"
showpos 	       ==      display a leading plus sign before positive values
scientific 	       ==      display floating point numbers in scientific ("E") notation
fixed 	           ==      display floating point numbers in normal notation - no trailing zeroes and no scientific notation
*/

using namespace std;

int main()
{
    cout<<setprecision(5)<<123.456<<endl; // Only 5 digit will print.

    cout.setf(ios::fixed);
    cout<<setprecision(5)<<12.345678; // After decimal ,only 5 digit will print with precision.


}
