#include <stdio.h>
enum bool
{
    false,
    true
};
void main()
{
    enum bool var;
    var = false;
    printf("Position of var : %d", var);
    return 0;
}

// enum will return the position of the variable provided