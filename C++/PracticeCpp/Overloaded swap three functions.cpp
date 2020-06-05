
#include <iostream>
using namespace std;

class Exchange
{
      public:
        void swp(int, int);  //swapping two integers 
        void swp(float, float);  //swapping two floats
        void swp(double ,double);  //swapping two doubles
};
 
void Exchange::swp(int a, int b)
{
    cout<<"Before Swapping:\na = "<<a<<" and b = "<<b<<endl;
      a = a+b;
      b = a-b;
      a = a-b;
    cout<<"After Swapping:\na = "<<a<<" and b = "<<b<<endl;
}


void Exchange::swp(float x, float y)
{
    cout<<"Before Swapping:\nx = "<<x<<" and y = "<<y<<endl;
      x = x+y;
      y = x-y;
      x = x-y;
    cout<<"After Swapping:\nx = "<<x<<" and y = "<<y<<endl;
}

void Exchange::swp(double m, double n)
{
    cout<<"Before Swapping:\nm = "<<m<<" and n = "<<n<<endl;
      m = m+n;
      n = m-n;
      m = m-n;
    cout<<"After Swapping:\nm = "<<m<<" and n = "<<n<<endl;
}
int main()
{
    int a,b;
    float x,y;
    double m,n;
    Exchange s;  // object of swap class
    
    cout<<"Enter two intgers: "<<endl;
    cin>>a>>b;
    s.swp(a,b);
    
    cout<<"Enter two floats: "<<endl;
    cin>>x>>y;
    s.swp(x,y);
    
    cout<<"Enter two doubles: "<<endl;
    cin>>m>>n;
    s.swp(m,n);
    
    
    return 0;
}
