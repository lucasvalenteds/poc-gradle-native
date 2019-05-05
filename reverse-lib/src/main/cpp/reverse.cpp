#include <stdlib.h>
#include <string.h>

char* reverse(char* text) {
    size_t textLength = strlen(text);
    char* textReversed = (char*) malloc((textLength + 1) * sizeof(char));
    textReversed[textLength] = '\0';

    int i = 0;
    for(i = 0; i < textLength; i++) {
        textReversed[i] = text[textLength - 1 - i];
    }

    return textReversed;
}

