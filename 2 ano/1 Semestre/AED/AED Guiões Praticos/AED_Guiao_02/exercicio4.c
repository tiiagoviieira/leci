#include <stdio.h>

void DisplayArray(double* a, size_t n) {
    if (a == NULL || n == 0) {
        return;
    }
    printf("Array = [ ");
    for (size_t i = 0; i < n; ++i) {
        printf("%.2f", a[i]);
        if (i < n - 1) {
            printf(", ");
        }
    }
    printf(" ]\n");
}


double* ReadArray(size_t* size_p) {
    if (size_p == NULL) {
        return NULL;
    }

    printf("Enter the number of elements: ");
    scanf("%zu", size_p);

    if (*size_p == 0) {
        return NULL;
    }

    // Allocate memory for the array
    double* array = (double*)malloc(*size_p * sizeof(double));
    if (array == NULL) {
        // Allocation failed
        *size_p = 0;
        return NULL;
    }

    // Read elements
    for (size_t i = 0; i < *size_p; ++i) {
        printf("Enter element %zu: ", i + 1);
        scanf("%lf", &array[i]);
    }

    return array;