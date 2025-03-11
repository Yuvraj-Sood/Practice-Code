#include <stdio.h>
int main()
{
    int a = 100;
    printf("Before calling function a=%d\n", a);
    change(a);
    printf("After calling function a=%d\n", a);
    return 0;
}
void change(int n)
{
    printf("Before adding value in function a=%d\n", n);
    n = n + 100;
    printf("After adding value in function a=%d\n", n);
}