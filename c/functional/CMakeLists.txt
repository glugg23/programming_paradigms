cmake_minimum_required(VERSION 3.10)
project(functional)

set(CMAKE_C_STANDARD 11)
set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -Wall")

add_executable(functional.out main.c helper.c map.c filter.c)

if(CMAKE_BUILD_TYPE MATCHES Debug)
    target_compile_definitions(functional.out PUBLIC DEBUG=1)
endif()
