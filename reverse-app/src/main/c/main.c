#include <stdio.h>
#include "reverse.h"

int main() {
    char* textOriginal = "Hello";
    char* textReversed = reverse(textOriginal);

    printf("original: %s\n", textOriginal);
    printf("reversed: %s\n", textReversed);

    return 0;
}