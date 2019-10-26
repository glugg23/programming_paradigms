#pragma once

#include <stdio.h>
#include <stdbool.h>

typedef struct {
    void** array;
    size_t length;
} ArrayTuple;

ArrayTuple filter(void** array, size_t length, bool (*f)(void*));
bool is_even(void* elem);
