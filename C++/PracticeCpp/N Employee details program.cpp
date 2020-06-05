#include<iostream>
using namespace std;

class Employee
{
              char name[25];
              int age;
              long salary;

              public:
                void GetData()           //Statement 1 : Defining GetData()
                {
                
                    cout<<"Enter Employee Name : ";
                    cin>>name;

                    cout<<"\nEnter Employee Age : ";
                    cin>>age;

                    cout<<"\nEnter Employee Salary : ";
                    cin>>salary;
                }

                void PutData()           //Statement 2 : Defining PutData()
                {
                    cout<<"\nEmployee Name : "<<name;
                    cout<<"\nEmployee Age : "<<age;
                    cout<<"\nEmployee Salary : "<<salary;
                }

             
};

       
       int main()
       {

              Employee E[5];          

        for(int i=0;i<5;i++)
        {      
            cout<<"\nEnter "<<(i+1)<<" Employee details:"<<endl;
            E[i].GetData();          
            E[i].PutData();          
        }   
            return 0;
       }