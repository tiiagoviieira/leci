#include    <stdio.h>

int checkCondition(double* list);
int main(void) {

    double array1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    double array2[] = {1 ,2 ,4 ,4 ,5 ,6 ,7 ,8 ,9 ,10};
    double array3[] = {1 ,2 ,4 ,8 ,5 ,6 ,7 ,8 ,9 ,10};
    double array4[] = {1 ,2 ,4 ,8 ,16 ,6 ,7 ,8 ,9 ,10};
    double array5[] = {1 ,2 ,4 ,8 ,16 ,32 ,7 ,8 ,9 ,10};
    double array6[] = {1,2,4,8,16,32,64,8,9,10};
    double array7[] = {1,2,4,8,16,32,64,128,9,10};
    double array8[] = {1,2,4,8,16,32,64,128,256,10};
    double array9[] = {1,2,4,8,16,32,64,128,256,512};

    double* arrays[] = {array1, array2, array3, array4, array5, array6, array7, array8, array9};
    
    int result[10];

    result[0] = checkCondition(arrays[0]);
    result[1] = checkCondition(arrays[1]);
    result[2] = checkCondition(arrays[2]);
    result[3] = checkCondition(arrays[3]);
    result[4] = checkCondition(arrays[4]);
    result[5] = checkCondition(arrays[5]);
    result[6] = checkCondition(arrays[6]);
    result[7] = checkCondition(arrays[7]);
    result[8] = checkCondition(arrays[8]);

    for (int i = 0; i < 9; i++) {
        if (result[i] == 1) {
            printf("A lista %d é uma progressão geométrica\n", i + 1);
        } else {
            printf("A lista %d não é uma progressão geométrica\n", i + 1);
        }
    }

    return 0;
}

int checkCondition(double* array) {

    // check r = array[1] / array[0]
    double r = array[1] / array[0];

    for (int i = 1; i < 10; i++) {
        if (array[i] != ( r * array[i - 1]) ) {
            return 0;
        }
    }

    return 1;

}