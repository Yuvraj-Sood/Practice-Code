#include <stdio.h>
int main()
{
    int a[4][3] = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}, {4, 5, 6}};
    int i, j;
    // for (i = 0; i < 4; i++)
    // {
    //     for (j = 0; j < 3; j++)
    //     {
    //         printf("Enter elements of array : \n");
    //         scanf("%d", &a[i][j]);
    //     }
    // }
    printf("Elements of array : \n");
    for (i = 0; i < 4; i++)
    {
        for (j = 0; j < 3; j++)
        {
            printf("%d  ", a[i][j]);
        }
        printf("\n");
    }
    printf("Rows 4-1 ");
    printf("Elements of array : \n");
    for (i = 3; i >= 0; i--)
    {
        for (j = 0; j < 3; j++)
        {
            printf("%d  ", a[i][j]);
        }
        printf("\n");
    }
    printf("Rows 4-1 Column 3-1 ");
    printf("Elements of array : \n");
    for (i = 3; i >= 0; i--)
    {
        for (j = 2; j >= 0; j--)
        {
            printf("%d  ", a[i][j]);
        }
        printf("\n");
    }
}