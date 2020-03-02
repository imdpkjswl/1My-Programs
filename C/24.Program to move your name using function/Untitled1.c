#include<stdio.h>
#include<windows.h>

void gotoxy(int x,int y) ///Declaring gotoxy function.
{
    COORD c;
    c.X=x;
    c.Y=y;

    ///Predefined function to controlling cursor.
    SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE),c);
}
void main()
{


    int x=35,y=15;
    char ch;
    gotoxy(x,y);
    printf("DEEPAK JAISWAL\nPress:a,s,w,z button to move\n(Note:For Exit Press Space Button)"); ///Generally print at beginning.

    while(1)
    {
        ch=getch();
        switch(ch)
        {
        case 'a' :
        x--;
        break;

            case 's' :
            x++;
            break;

                case 'w' :
                y--;
                break;

                    case 'z' :
                     y++;
                     break;

                         case 32 :  ///ASCII VALUE OF SPACE BUTTON
                         exit(0);
        }

        system("cls"); ///Clearing Screen on each click.

        gotoxy(x,y);

     printf("DEEPAK JAISWAL");  ///Repeating on click


    }


}

