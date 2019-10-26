#include "filter.h"

#include <stdlib.h>

#include "helper.h"

ArrayTuple filter(void** array, size_t length, bool (*f)(void*)) {
    void** result = malloc(length * sizeof(void*));
    size_t new_length = 0;

    for(int i = 0; i < length; ++i) {
        if(f(array[i])) {
            void* elem = malloc(sizeof(int));
            *(int*) elem = i;
            result[new_length++] = elem;
        }
    }

    free_array(&array, length);

    result = realloc(result, new_length * sizeof(void*));

    return (ArrayTuple) {result, new_length};
}

bool is_even(void* elem) {
    int cast = *(int*) elem;
    return cast % 2 == 0;
}
