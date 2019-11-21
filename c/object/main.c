#include <stdio.h>

#include "vehicle.h"

int main() {
    vehicle* v = vehicle_init(150);

    printf("CC: %d\n", vehicle_get_engine(v));

    double* wheels = vehicle_get_wheels(v);

    for(int i = 0; i < 4; ++i) {
        printf("Wheel %d air amount: %f\n", i, wheels[i]);
    }

    vehicle_free(v);

    return 0;
}
