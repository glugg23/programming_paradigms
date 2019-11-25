#include "truck.h"

#include <stdlib.h>

#include "vehicle.h"
#include "util.h"

//We contain a pointer to the parent class
struct truck {
    vehicle* parent;
    int trailer_capacity;
};

truck* truck_init(int cc, int trailer_capacity) {
    truck* t = (truck*) malloc(sizeof(truck));
    t->parent = vehicle_init(cc);
    t->trailer_capacity = trailer_capacity;

    return t;
}

void truck_free(truck* self) {
    vehicle_free(self->parent);
    free(self);
}

//This time we declare a settint for trailer capacity
GET(truck, trailer_capacity, int)
SET(truck, trailer_capacity, int)
GET_PARENT(truck, vehicle, engine, int)
GET_PARENT(truck, vehicle, wheels, double*)
