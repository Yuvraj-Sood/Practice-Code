#include <stdio.h>
int main()
{
    int n, rev, r, t;
    printf("Enter Number : %d", n);
    scanf("%d", &n);
    t = n;
    while (t > 0)
    {
        r = t % 10;
        rev = rev * 10 + r;
        t = t / 10;
    }
    if (rev == n)
    {
        printf("Pallindrome");
    }
    else
    {
        printf("Not Pallindrome");
    }
    return 0;
}