#pragma once

typedef struct truck truck;

truck* truck_init(int, int);
void truck_free(truck*);
int truck_get_trailer_capacity(truck*);
void truck_set_trailer_capacity(truck*, int);
int truck_get_engine(truck*);
double* truck_get_wheels(truck*);
