#include <stdio.h>

struct my_structure {
    char name[20];
    int add_id;
    char  usn[15];
};

int main()
{
    struct my_structure variable = {"DEEPAK",263,"1VA18CS010"};

    struct my_structure *ptr;
    ptr = &variable;

    printf("NAME : %s\n", ptr->name);
    printf("ADDMISSION NUMBER : %d\n", ptr->add_id);
    printf("USN : %s", ptr->usn);

    return 0;
}
