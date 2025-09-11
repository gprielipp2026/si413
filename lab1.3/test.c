#include <stdio.h>

char* concat(char* a, char* b);
char* getUserInput();
char* reverseString(char* str);

int main(void)
{
    printf("%s\n", concat("concated: ", reverseString(getUserInput())));
    printf("Normal string: %s\n", getUserInput());
    return 0;
}