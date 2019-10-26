#include <stdio.h>

#include "helper.h"
#include "map.h"
#include "filter.h"

int main() {
    size_t length = 10;
    void** array = init_array(length);

    print_array(array, length);

    map(array, length, increment);

    print_array(array, length);

    ArrayTuple tuple = filter(array, length, is_even);
    array = tuple.array;
    length = tuple.length;

    print_array(array, length);

    free_array(&array, length);

    return 0;
}
