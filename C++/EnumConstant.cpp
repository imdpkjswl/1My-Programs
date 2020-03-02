#include <iostream>

using namespace std;
enum enumName
{
  spring = 0,
  summer = 4,
  autumn = 8,
  winter = 12
};
int main()
{
  enumName season;
  season = winter;

  cout << "Winter Season will come in " << winter << "th month";
}