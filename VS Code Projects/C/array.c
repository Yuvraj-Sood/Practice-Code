#include <stdio.h>
int main()
{
    int a[5];
    int i = 0;
    for (i = 0; i < 5; i++)
    {
        printf("Enter elements of array : \n");
        scanf("%d", &a[i]);
    }
    printf("Elements of array : ");
    for (i = 0; i < 5; i++)
    {
        printf("%d ,", a[i]);
    }
    printf("\n");
    printf("Array in Reverse : ");
    for (i = 4; i >= 0; i--)
    {
        printf("%d ,", a[i]);
    }
    int b[] = {2, 6, 9, 3, 6};
    int c[] = {1, 7, 3, 8, 33, 26};
    printf("\nb[] and c[] Merged Array : ");
    int d[11];
    int k = 0;
    for (i = 0; i < 5; i++)
    {
        d[k] = b[i];
        k++;
    }
    for (i = 0; i < 6; i++)
    {
        d[k] = c[i];
        k++;
    }
    for (i = 0; i < 11; i++)
    {
        printf("%d ,", d[i]);
    }
    return 0;
}