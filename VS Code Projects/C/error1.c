#include <stdio.h>
#include <conio.h>
void main()
{
    float a, b;
    printf("Enter Numbers :");
    scanf("%d %d", &a, &b);
    printf("%f %f", a, b);
}

// Output will be garbage value because int value is inserted in place of float

#include <stdio.h>
#include <conio.h>
void main()
{
    int a, b;
    printf("Enter Numbers :");
    scanf("%f %f", &a, &b);
    printf("%d %d", a, b);
}

// Output will be runtime error because float value is inserted in place of int