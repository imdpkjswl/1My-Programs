#include<iostream>
using namespace std;

class Rectangle
{
            private:
             float length, breadth, result ;
             
                
              public:
                void setlength(float len)
                {
                    length = len;
                }
                
                void setbreadth(float bd)
                {
                    breadth = bd;
                }
                
                float getlength()
                {
                    return length;
                }
                
                float getbreadth()
                {
                    return breadth;
                }
                
                void area()
                {
                    result = getlength()*getbreadth();
                }
                
                void display()
                {
                    cout<<"Area of Rectangle is:  "<<result<<endl;
                }
                
            
             
};

       
int main()
{
    float l,b;
    cout<<"Enter length of Rectangle"<<endl;
    cin>>l;
    cout<<"Enter breadth of Rectangle"<<endl;
    cin>>b;
    
    Rectangle r;
    
    r.setlength(l);
    r.setbreadth(b);
    r.area();
    r.display();
    
    return 0;
}