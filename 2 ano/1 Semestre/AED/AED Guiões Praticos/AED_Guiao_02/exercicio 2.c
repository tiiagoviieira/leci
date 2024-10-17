#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main(void)
{
    char stringA[100];
    char stringB[100];
    int alphaA;
    int capsB;

    printf("Insira a primeira palavra");
    scanf("%s", stringA);
    printf("Insira a segunda palavra");
    scanf("%s", stringB);

    for (int i = 0; i < strlen(stringA); i++)
    {
        if (isalpha(stringA[i]))
        {
            alphaA += 1;
            stringA[i] = tolower(stringA[i]);
        }
    }

    for (int i = 0; i < strlen(stringB); i++)
    {
        if (isupper(stringB[i]))
        {
            capsB += 1;
        }
        if (isalpha(stringB[i]))
        {
            stringB[i] = tolower(stringB[i]);
        }
    }

    if (stringA == stringB) {
        fprint("sao iguais");
    }
    return 0;
}