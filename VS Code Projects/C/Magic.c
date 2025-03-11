#include <stdio.h>
int main()
{
    int n, t, r, sum = 0;
    printf("Enter a Number :");
    scanf("%d", &n);
    t = n;
    while (t > 9)
    {
        while (t > 0)
        {
            r = t % 10;
            sum = sum + r;
            t = t / 10;
        }
        t = sum;
        sum = 0;
    }
    if (t == 1)
    {
        printf("Magic Number");
    }
    else
    {
        printf("Not a Magic Number");
    }
    return 0;
}