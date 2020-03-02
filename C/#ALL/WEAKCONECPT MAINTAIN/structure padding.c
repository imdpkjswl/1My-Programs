#include <stdio.h>
#include <string.h>

/*  Below structure1 and structure2 are same.
    They differ only in member's alignment.

    Data structure padding is totally depends on word length of m/c and size of data type.
    here,the m/c word length is 4 byte(32bit),So during execution on 4 byte of data will access at a time.
    */
//#pragma pack(1)
struct structure1
{

       int id1; // 4 byte
       int id2; // 4 byte
       char name; // 1 byte
       char c; // 1 byte
       float percentage; // 4 byte

};

struct structure2
{
       int id1;//4 byte
       char name;// 1 byte
       int id2;// 4 byte
       char c; //1 byte
       float percentage; // 4 byte

};

int main()
{
    struct structure1 a;
    struct structure2 b;

    printf("size of structure1 in bytes : %d\n",sizeof(a));

    printf ( "\n   Address of id1        = %u", &a.id1 );
    printf ( "\n   Address of id2        = %u", &a.id2 );
    printf ( "\n   Address of name       = %u", &a.name );
    printf ( "\n   Address of c          = %u", &a.c );
    printf ( "\n   Address of percentage = %u",&a.percentage );

    printf("   \n\nsize of structure2 in bytes : %d\n",sizeof(b));
    printf ( "\n   Address of id1        = %u", &b.id1 );
    printf ( "\n   Address of name       = %u", &b.name );
    printf ( "\n   Address of id2        = %u", &b.id2 );
    printf ( "\n   Address of c          = %u", &b.c );
    printf ( "\n   Address of percentage = %u",&b.percentage );

    if(sizeof(a)<sizeof(b))
        printf("\n\nStructure1 memory allocation more efficient than structure2\n");
    else
        printf("\n\nStructure2 memory allocation more efficient than structure1\n");

    getchar();
    return 0;
}

