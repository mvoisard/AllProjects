#include <stdio.h>
int main()
{
    FILE *out_file;
    int count = 0;
    char msg[] = "This was created by a C program.\n";
    if ((out_file = fopen("testfile", "w")) == NULL)
    {
        printf("Error opening file.\n");
    }
    while (count < 33)
    {
        fputc(msg[count], out_file);
        count++;
    }
    fclose(out_file);
}
