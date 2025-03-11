#include <stdio.h>                 // stdio.h is a header file. #include preprocessor replaces the above line with function of stdio.h
#define pi 3.14                    // defining macro and now it can be used anywhere in program
#undef pi                          // used to undefine the macro defined
#define PI 3.14                    // defining macro and now it can be used anywhere in program
#define circleArea(r) (PI * r * r) // defining marco function it can also be used anywhere(pi(r*r))
int main()
{
    float r;
    printf("Enter the radius of a circle: ");
    scanf("%f", &r);
    float area = circleArea(r);
    printf("Area : %f", area);

    printf("\n Current Time : %s", __TIME__);
    printf("\n Current File : %s", __FILE__);
    printf("\n Current Date : %s", __DATE__);
    printf("\n Current Line : %d", __LINE__);
    printf("\n Current STDC : %d", __STDC__);

    return 0;
}

// pre-definied macros
// __DATE__
//__FILE__
//__LINE__
//__STDC__
//__TIME__
