#include<stdio.h>

void main()


{
    double celsius,fahreheit; // Here i taken double bcuz fahrenheit may be in decimal point.
    printf("Enter The Temperature In Celsius :\n");
    scanf("%lf",&celsius);
    fahreheit=((celsius*(9.0/5.0))+32);  // USed Formula
    printf("The Converted Temperature In Fahreheit is %lf",fahreheit);
    return 0;

}
