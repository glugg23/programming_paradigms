cmake_minimum_required(VERSION 3.10)
project(object)

set(CMAKE_C_STANDARD 11)
set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -Wall")

add_executable(object.out main.c vehicle.c)

if(CMAKE_BUILD_TYPE MATCHES Debug)
    target_compile_definitions(object.out PUBLIC DEBUG=1)
endif()
