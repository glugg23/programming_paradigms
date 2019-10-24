#include "map.h"

void** map(void** array, size_t length, void* (*f)(void*)) {
    for(int i = 0; i < length; ++i) {
        array[i] = f(array[i]);
    }

    return array;
}

void* increment(void* elem) {
    int cast = *(int*) elem;
    *(int*) elem = ++cast;
    return elem;
}
