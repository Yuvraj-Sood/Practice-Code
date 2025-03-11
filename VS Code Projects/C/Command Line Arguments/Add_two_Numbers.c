#include <stdio.h>
#include <conio.h>
int main(int argc, char const *argv[])
{
    argv[1] = "5";
    argc++;
    argv[2] = "10";
    argc++;
    if (argc > 2)
    {
        char *s1 = argv[1];
        char *s2 = argv[2];
        int x = atoi(s1);
        int y = atoi(s2);
        // atoi is used to convert string to int
        int sum = x + y;
        printf("Sum : %d", sum);
    }
    else
    {
        printf("Insufficient Elements");
    }
    return 0;
}
