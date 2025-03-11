#include <stdio.h>
void main()
{
    enum point
    {
        x = 10,
        y = 20,
        z = 30
    };
    printf("Values of \n x:%d \n y:%d \n z:%d", x, y, z);
    enum point1
    {
        a = 10,
        c = 50,
        b
    };
    printf("\n Values of \n a:%d \n b:%d \n c:%d", a, b, c);
    enum point2
    {
        p,
        q,
        r
    };
    printf("\n Values of \n p:%d \n q:%d \n r:%d", p, q, r);
    return 0;
}

// if value not assigned to enum names then compiler automatically assigns value from 0
// We can assign values to some name in any order. All unassigned names get value as value of previous name plus one.