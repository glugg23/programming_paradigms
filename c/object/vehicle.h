#pragma once

typedef struct vehicle vehicle;

vehicle* vehicle_init();
void vehicle_free(vehicle*);
int vehicle_get_engine(vehicle*);
double* vehicle_get_wheels(vehicle*);
