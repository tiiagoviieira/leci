#include <stdio.h>

void checkCondition(int* list);
int main (void) {

    int list0[] = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10};
    int list1[] = {1 ,2 ,1 ,4 ,5 ,6 ,7 ,8 ,9 ,10};
    int list2[] = {1 ,2 ,1 ,3 ,2 ,6 ,7 ,8 ,9 ,10};
    int list3[] = {0 ,2 ,2 ,0 ,3 ,3 ,0 ,4 ,4 ,0};
    int list4[] = {0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0};
    int* lists[] = {list0, list1, list2, list3, list4};

    checkCondition(lists[0]);
    checkCondition(lists[1]);
    checkCondition(lists[2]);
    checkCondition(lists[3]);
    checkCondition(lists[4]);

    return 0;
}

void checkCondition(int* list) {
    int counter = 0;

        for (int i = 1; i < 9; i++) {

            if (list[i] == (list[i - 1] + list[i + 1])) {
                counter += 1;
            }
            
        }
    

    printf("O numero de valores que respeitam a condição da lista: %d\n", counter);
}