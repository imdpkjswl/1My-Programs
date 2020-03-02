#include<iostream>
using namespace std;
int main()
{
    char name[] = "DEEPAK" ;

    char *cp ;         // a char pointer
    for(cp = name/*Assign addr*/ ; *cp != '\0' ; cp++)
    {
        cout << "...." << *cp ;
    }

    return 0;
}

