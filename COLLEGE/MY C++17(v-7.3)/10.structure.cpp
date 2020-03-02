#include<iostream>
#include<conio.h>

using namespace std;
/// In c++ ,we can define member function in structure.
struct book
{
    private:
        int bookid;
        char title[50];
        float price;

    public:
        void input()
        {
            cout<<"Enter Bookid , Title and Price :"<<endl;
            cin>>bookid>>title>>price;
        }

        void display()
        {
            cout<<"The book details are :"<<endl;
            cout<<"Bookid : "<<bookid<<endl<<"Title : "<<title<<endl<<"Price : "<<price<<endl;

        }
};

int main()
{
    book b1;

    //b1.bookid = 100; DUE TO PRIVATE ,WE CAN'T MAKE ANY CHANGE.

    b1.input();
    b1.display();

    return 0;

}
