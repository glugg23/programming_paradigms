#pragma once

#include "vehicle.h"
#include "truck.h"

typedef enum {
    VEHICLE,
    TRUCK,
    NONE
} type;

typedef struct {
    union {
        vehicle* vehicle;
        truck* truck;
    };
    type type;
} object;
