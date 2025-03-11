#include <stdio.h>
int main()
{
    int n, t, r, i, sum = 0;
    printf("Enter a Number :");
    scanf("%d", &n);
    t = n;
    for (i = 1; i < t; i++)
    {
        if (t % i == 0)
        {
            sum = sum + i;
        }
    }
    if (sum == n)
    {
        printf("Perfect Number");
    }
    else
    {
        printf("Not a Perfect Number");
    }
    return 0;
}