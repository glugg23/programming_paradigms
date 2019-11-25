#pragma once

#include "vehicle.h"
#include "truck.h"

typedef enum {
    VEHICLE,
    TRUCK,
    NONE
} type;

typedef struct {
    //A union means we can either have a vehicle or truck pointer
    union {
        vehicle* vehicle;
        truck* truck;
    };
    //And we store an enum to represent the type
    type type;
} object;
