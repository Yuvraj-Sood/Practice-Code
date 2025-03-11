#include <stdio.h>
int main()
{
    int n;
    printf("Enter a Number :");
    scanf("%d", &n);
    armstrong(n);
    return 0;
}
void armstrong(int n)
{
    int t, sum = 0, r;
    t = n;
    while (t > 0)
    {
        r = t % 10;
        sum = sum + (r * r * r);
        t = t / 10;
    }
    if (sum == n)
    {
        printf("armstrong");
    }
    else
    {
        printf("not armstrong");
    }
}