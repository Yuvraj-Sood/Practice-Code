#include <stdio.h>
int main()
{
    int n, i, f = 1, r, t, sum = 0;
    printf("Enter a Number :");
    scanf("%d", &n);
    t = n;
    while (t > 0)
    {
        r = t % 10;
        f = 1;
        for (i = 1; i <= r; i++)
        {
            f = f * i;
        }
        sum = sum + f;
        t = t / 10;
    }
    if (sum == n)
    {
        printf("Special Number");
    }
    else
    {
        printf("Not a Special Number");
    }
    return 0;
}