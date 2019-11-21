#include "vehicle.h"

#include <stdlib.h>

#include "util.h"

struct vehicle {
    int engine;
    double wheels[4];
};

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

GET(vehicle, engine, int);
GET(vehicle, wheels, double*);
