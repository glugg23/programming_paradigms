#include "vehicle.h"

#include <stdlib.h>

#include "util.h"

//But the private type has member variables which can only be accessed in this file
struct vehicle {
    int engine;
    double wheels[4];
};

//The only way a struct of this type can be created is by this function
vehicle* vehicle_init(int cc) {
    vehicle* v = malloc(sizeof(vehicle));
    v->engine = cc;

    for(int i = 0; i < 4; ++i) {
        v->wheels[i] = 100.0;
    }

    return v;
}

void vehicle_free(vehicle* this) {
    free(this);
}

//Using macros to generate getters but no setters
GET(vehicle, engine, int);
GET(vehicle, wheels, double*);
