#pragma once

#define GET(struct, field, type) \
type struct##_get_##field(struct* this) { \
    return this->field; \
}

#define GET_PARENT(struct, parent_type, field, type) \
type struct##_get_##field(struct* this) { \
    return parent_type##_get_##field(this->parent); \
}

#define SET(struct, field, type) \
void struct##_set_##field(struct* this, type field) { \
    this->field = field; \
}
