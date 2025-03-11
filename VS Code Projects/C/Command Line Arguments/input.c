#include <stdio.h>
int main(int argc, char const *argv[])
{
    printf("Agrument Count = %d ", &argc);
    argv[1] = "B.Sc(IT)";
    argc++;
    argv[2] = "5";
    argc++;
    argv[3] = "Yo";
    argc++;
    if (argc == 1)
    {
        printf("No elements to display");
    }
    else
    {
        printf("List of elements \n");
        for (int i = 1; i < argc; i++)
        {
            printf("%s \n", argv[i]);
        }
    }
    return 0;
}
