#include "helper.h"

#include <stdlib.h>

void** init_array(size_t length) {
    void** array = malloc(length * sizeof(void*));

    for(int i = 0; i < length; ++i) {
        void* elem = malloc(sizeof(int));
        *(int*) elem = i;
        array[i] = elem;
    }

    return array;
}

void free_array(void*** array, size_t length) {
    for(int i = 0; i < length; ++i) {
        free((*array)[i]);
    }
    free(*array);
}

void print_array(void** array, size_t length) {
    for(int i = 0; i < length; ++i) {
        printf("%d, ", *(int*) array[i]);
    }
    printf("\n");
}
