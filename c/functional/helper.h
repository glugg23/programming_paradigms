#pragma once

#include <stdio.h>

void** init_array(size_t length);
void free_array(void*** array, size_t length);
void print_array(void** array, size_t length);
