#include <stdio.h>
#include <math.h>
int main()
{
    int n, c = 0;
    printf("Enter Number :");
    scanf("%d", &n);
    prime(n);
    return 0;
}
void prime(int n)
{
    int c = 0;
    int sq = sqrt(n);
    int i;
    for (i = 2; i <= sq; i++)
    {
        if (n % i == 0)
        {
            c++;
            break;
        }
    }
    if (c == 0)
    {
        printf("Prime");
    }
    else
    {
        printf("Not Prime");
    }
}