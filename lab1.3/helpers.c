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

char* getUserInput()
{
    char* str = malloc(sizeof(char) * 1024); // very large string (hopefully)
    scanf("%[^\n]\n", str);
    return str;
}

char* reverseString(char* str) {
    int len = strlen(str);
    char* rev = malloc(sizeof(char) * (len+1));
    for(int i = 0; i < len; i++)
    {
        rev[i] = str[len-i-1];
    }
    rev[len] = '\0';
    return rev;
}