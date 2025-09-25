#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>

char* bool_to_str(bool b) {
  return (b ? "1":"0");
}

char* getinput() {
  char* str = malloc(sizeof(char) * 1024); // very large string (hopefully)
  scanf("%[^\n]\n", str);
  return str;
}

bool not(bool b) {
  return !b;
}

char* reverse_string(const char* original) {
  int n = strlen(original);
  char* reversed = malloc(n+1);
  for (int i = 0; i < n; ++i) {
    reversed[i] = original[n-i-1];
  }
  reversed[n] = '\0';
  return reversed;
}

bool str_lt(const char* a, const char* b) {
  int alen = strlen(a);
  int blen = strlen(b);

  // a longer than b
  if(alen > blen) {
    for(int i = 0; i < blen; i++) {
      if(a[i] > b[i]) return false;
    }
  }

  // b longer than a (or equal to a)
  else {
    for(int i = 0; i < alen; i++) {
      if(a[i] > b[i]) return false;
    }
  }

  return true;
}

bool str_gt(const char* a, const char* b) {
  int alen = strlen(a);
  int blen = strlen(b);

  // a longer than b
  if(alen > blen) {
    for(int i = 0; i < blen; i++) {
      if(a[i] < b[i]) return false;
    }
  }

  // b longer than a (or equal to a)
  else {
    for(int i = 0; i < alen; i++) {
      if(a[i] < b[i]) return false;
    }
  }

  return true;
}

bool substr(const char* a, const char* b) {
  return strstr(b, a) != NULL;
}

char* concat(const char* a, const char* b) {
  int alen = strlen(a);
  int blen = strlen(b);
  char* c = malloc((alen + blen + 1) * (sizeof(char)));

  memcpy(c, a, alen);
  memcpy(c+alen, b, blen);
  c[alen+blen] = '\0';

  return c;
}