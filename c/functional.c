#include <stdio.h>
#include <stdlib.h>

void* increment(void* elem) {
    int cast = *(int*) elem;
    *(int*) elem = ++cast;
    return elem;
}

void** map(void** array, size_t length, void* (*f)(void*)) {
    for(int i = 0; i < length; ++i) {
        array[i] = f(array[i]);
    }

    return array;
}

int main() {
    int length = 10;
    void** array = malloc(length * sizeof(void*));

    for(int i = 0; i < length; ++i) {
        void* elem = malloc(sizeof(int));
        *(int*) elem = i;
        array[i] = elem;
    }
    
    for(int i = 0; i < length; ++i) {
        printf("%d\n", *(int*) array[i]);
    }
    printf("\n");

    map(array, length, increment);

    for(int i = 0; i < length; ++i) {
        printf("%d\n", *(int*) array[i]);
    }

    for(int i = 0; i < length; ++i) {
        free(array[i]);
    }
    free(array);

    return 0;
}
