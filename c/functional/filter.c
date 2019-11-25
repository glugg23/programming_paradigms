#include "filter.h"

#include <stdlib.h>

#include "helper.h"

/*
 * Takes in an array of any type [a],
 * the length of the array which is required because we don't have proper array types,
 * and a function which takes any type and returns a boolean (a -> Bool),
 * then returns an array of any type [a], along with the length of the new array
 */
ArrayTuple filter(void** array, size_t length, bool (*f)(void*)) {
    //Allocate a new array of the same length of the old one
    void** result = malloc(length * sizeof(void*));
    size_t new_length = 0;

    for(int i = 0; i < length; ++i) {
        if(f(array[i])) {
            void* elem = malloc(sizeof(int));
            *(int*) elem = i;
            result[new_length++] = elem;
        }
    }

    //Free the old array
    free_array(&array, length);

    //Resize the new array to not waste memory
    result = realloc(result, new_length * sizeof(void*));

    return (ArrayTuple) {result, new_length};
}

bool is_even(void* elem) {
    int cast = *(int*) elem;
    return cast % 2 == 0;
}
