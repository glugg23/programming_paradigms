#include <stdio.h>

/**
 * The main feature of procedural programming languages is the ability to
 * define and call procedures (functions/methods).
**/

/**
 * These can be something like this which takes no input and returns no output.
**/
void hello_world() {
    printf("Hello World!\n");
}

/**
 * Or functions which take in a certain type and return something.
**/
int increment(int x) {
    return x + 1;
}

/**
 * These days procedural programming is also associated with imperative
 * programming.
 * This means using statements to change the program's state.
**/

/**
 * Enums can represent the state of something by using named values.
**/ 
enum validity {
    VALID,
    INVALID,
};

/**
 * You can also have structures which store a number of fields
**/
struct foo {
    int bar;
    double baz;
    enum validity state;
};

int main() {
    //For example run this function
    hello_world();

    //Create an integer called x and set it to 0
    int x = 0;

    //Call the function to increment x and set x to the returned value
    x = increment(x);

    //Execute based on a condition
    if(x == 2) {
        int* ptr = NULL;
        *ptr = 0xDEAD;

    } else {
        x = increment(x);
    }

    //Do an action a certain number of times
    for(int i = 0; i < 3; ++i) {
        x = increment(x);
    }

    //Do an action until a statement is true
    while(x != 10) {
        x = increment(x);
    }

    //You can have lists of values, here we declare a list of 10 integers
    int list[10];

    //These can be accessed one by one
    for(int i = 0; i < 10; ++i) {
        list[i] = i;
    }

    //Create a structure and set all the fields in it
    struct foo s;
    s.bar = 7;
    s.baz = 0.5;
    s.state = VALID;

    return 0;
}
