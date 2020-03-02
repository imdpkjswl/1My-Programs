#include <iostream> 
#include <cstdlib> 
#include<ctime> 
  
// Driver program 
int main(void) 
{ 
    // This program will create different sequence of  
    // random numbers on every program run  
  
    // Use current time as seed for random generator 
   srand(time(0)); // Firstly,This is called due to generate random number on every run time.It means the output will vary everytime..g
  
    for(int i = 0; i<5; i++) 
        std::cout<<rand()<<std::endl; 
  
    return 0; 
} 