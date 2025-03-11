#include <stdio.h>
int main()
{
    int a = 5, b = 10;
    printf("Before calling function a=%d & b=%d\n", a, b);
    swap(a, b);
    printf("After calling function a=%d & b=%d\n", a, b);
    return 0;
}
void swap(int x, int y)
{
    printf("Before swapping a=%d & b=%d\n", x, y);
    int t;
    t = x;
    x = y;
    y = t;
    printf("After swapping a=%d & b=%d\n", x, y);
}