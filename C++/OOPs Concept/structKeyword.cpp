#include <iostream>

using namespace std;    

struct Rectangle      
{      
   int width, height;
   struct Rectangle *p;      
      
}; 

int main(void) 
{    
    //Create two node and Join the both object
    struct Rectangle *node1 = new Rectangle;
    node1 -> height =3;
    node1 -> width = 4;

    struct Rectangle *node2 = new Rectangle;
    node2 -> height = 4;
    node2 -> width = 5;

    // Joining both nodes
    node1 -> p = node2;
    
    return 0;    
}    


/*
struct Circle {      
    int radius;      
  
    Circle(int r)      
    {      
        radius = r;      
    }      
  
    void areaOfCircle() 
    {       
        cout<<"Area of Circle is: "<<pi*radius*radius<<endl; 
    }      
 }; 

int main(void) {    
    struct Circle obj = Circle(7);    
    obj.areaOfCircle();

    return 0;    
}    

*/