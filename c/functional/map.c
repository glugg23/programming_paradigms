#include "map.h"

/*
 * Takes in an array of any type [a],
 * the length of the array which is required because we don't have proper array types,
 * and a function which takes any type and returns any type (a -> b),
 * then returns an array of any type [b]
 */
void** map(void** array, size_t length, void* (*f)(void*)) {
    //Not using recursion this time, otherwise it's exactly the same
    for(int i = 0; i < length; ++i) {
        array[i] = f(array[i]);
    }

    return array;
}

//Since we need to return void*'s instead of concrete types, we end up doing lots of casting
void* increment(void* elem) {
    int cast = *(int*) elem;
    *(int*) elem = cast + 1;
    return elem;
}
