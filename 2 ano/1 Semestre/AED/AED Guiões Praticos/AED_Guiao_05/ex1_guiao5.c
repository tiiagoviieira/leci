#include<stdio.h>
#include<assert.h>

int c1 = 0;
int c2 = 0;
int c3 = 0;

int t1(unsigned int n){
    assert (n > 0);

    if(n == 1){
        return 1;
    }
    c1 ++;
    return t1(n/2) + n;
}

int t2(unsigned int n){
    assert (n > 0);

    if(n == 1){
        return 1;
    }
    c2 ++;
    return t2(n/2) + t2((n+1)/2) + n/2;
}

int t3(unsigned int n) {
    assert (n > 0);

    if (n == 1)
        return 1;
    c3 ++;
    if (n % 2 == 1)
        return t3(n / 2) + t3((n+1)/ 2) + n;
    else
        return 2 * t3(n / 2) + n;
}


int main(){

    printf(" n |  t1(n) | ops1 |  t2(n) | ops2 |  t3(n) | ops3\n");
    printf("---|--------|------|--------|------|--------|------\n");

    for (int n=1;n<15;n++) {
        int T1 = t1(n);
        int T2 = t2(n);
        int T3 = t3(n);
        printf("%2d | %6d | %4d | %6d | %4d | %6d | %4d\n", n, T1, c1, T2, c2, T3, c3);
        c1 = 0;
        c2 = 0;
        c3 = 0;
    }
}