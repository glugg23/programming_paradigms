#pragma once

#include <stdio.h>

void** map(void** array, size_t length, void* (*f)(void*));
void* increment(void* elem);
