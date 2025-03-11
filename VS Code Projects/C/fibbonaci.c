#include <stdio.h>
int main()
{
    int a = 0, b = 1, s = 0, n = 2;
    printf("%d, %d, ", a, b);
    while (n < 10)
    {
        s = a + b;
        printf("%d, ", s);
        a = b;
        b = s;
        n++;
    }
    return 0;
}