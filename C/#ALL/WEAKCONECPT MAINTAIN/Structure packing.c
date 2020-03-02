#include <stdio.h>
#include <string.h>

#pragma pack(push)  /* push current alignment to stack */
/*  Data structure packing packs data by considering bytes not word length of m/c.
    here,the m/c word length is 4 byte(32bit),BUT  data will packed in byte at certain byte boundary*/


#pragma pack(1)  /* set alignment to 1 byte boundary(it used to packed all data structures */

struct structure1
{

       int id1; // 4 byte
       int id2; // 4 byte
       char name; // 1 byte
       char c; // 1 byte
       float percentage; // 4 byte
};
#pragma pack(pop)   /* restore original alignment from stack */
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

    printf("   \n\nsize of structure2 in bytes : %d\n",
                   sizeof(b));
    printf ( "\n   Address of id1        = %u", &b.id1 );
    printf ( "\n   Address of name       = %u", &b.name );
    printf ( "\n   Address of id2        = %u", &b.id2 );
    printf ( "\n   Address of c          = %u", &b.c );
    printf ( "\n   Address of percentage = %u",&b.percentage );

    printf("\n\n-->structure1 is packed and structure2 is not packed.\n");

    getchar();
    return 0;
}

