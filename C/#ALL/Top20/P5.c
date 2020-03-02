///What will be Output???

#include<stdio.h>

void main()
{
    int arr[][3] ={{1,2},{3,4,5},{5}};

    printf("%d %d",arr[0][2],arr[1][2]);

}
/* Solution is:

[][]=> first one denotes Row & second one denotes Column.

    |  0   1   _2
 ---|--------------
  _0 |  1   2   0
    |
  _1 |  3   4   _5
    |
  2 |  5   0   0       OUTPUT: 0 5
    |                                    */
