#pragma once

//Declare the public type as having no member variables
typedef struct vehicle vehicle;

vehicle* vehicle_init(int);
void vehicle_free(vehicle*);
int vehicle_get_engine(vehicle*);
double* vehicle_get_wheels(vehicle*);
