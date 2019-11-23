#include <stdio.h>

#include "vehicle.h"
#include "truck.h"
#include "object.h"

int main() {
    vehicle* v = vehicle_init(150);

    printf("CC: %d\n", vehicle_get_engine(v));

    double* wheels = vehicle_get_wheels(v);

    for(int i = 0; i < 4; ++i) {
        printf("Wheel %d air amount: %f\n", i, wheels[i]);
    }

    vehicle_free(v);

    truck* t = truck_init(150, 100);

    printf("Trailer capacity: %d\n", truck_get_trailer_capacity(t));

    truck_set_trailer_capacity(t, 250);

    printf("Trailer capacity: %d\n", truck_get_trailer_capacity(t));

    printf("CC: %d\n", truck_get_engine(t));

    wheels = truck_get_wheels(t);

    for(int i = 0; i < 4; ++i) {
        printf("Wheel %d air amount: %f\n", i, wheels[i]);
    }

    truck_free(t);

    object array[10];

    for(int i = 0; i < 10; ++i) {
        if(i % 2 == 0) {
            array[i] = (object) {
                .vehicle = vehicle_init(150),
                .type = VEHICLE
            };

        } else {
            array[i] = (object) {
                .truck = truck_init(150, 100),
                .type = TRUCK
            };
        }
    }

    for(int i = 0; i < 10; ++i) {
        switch(array[i].type) {
            case VEHICLE:
                printf("Position %d is a vehicle\n", i);
                vehicle_free(array[i].vehicle);
                break;
            case TRUCK:
                printf("Position %d is a truck\n", i);
                truck_free(array[i].truck);
                break;
            default: continue;
        }
    }

    return 0;
}
