cmake_minimum_required(VERSION 3.14)
project(examples)

set(CMAKE_C_STANDARD 11)
set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -Wall -Wextra -pedantic")

add_executable(examples.out main.c)

if(CMAKE_BUILD_TYPE MATCHES Debug)
    target_compile_definitions(tic_tac_ted PUBLIC DEBUG=1)
endif()
