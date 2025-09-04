#include <stdlib.h>
#include <string.h>
#include <stdio.h>

char* concat(char* a, char* b)
{
    int alen = strlen(a), blen = strlen(b);
    char* c = malloc(sizeof(char) * (alen + blen + 1));
    strcpy(c, a);
    strcpy(c+alen, b);
    c[alen+blen] = '\0';
    return c;
}