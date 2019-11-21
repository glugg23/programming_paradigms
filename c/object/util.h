#pragma once

#define GET(struct, field, type) \
type struct##_get_##field(struct* this) { \
    return this->field; \
}
