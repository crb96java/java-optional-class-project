package com.optional.features;

import java.util.Optional;
/*
* 1.Optional.empty() :
        - Creates an empty Optional object with no value/null value.

    2.Optional.of(T value) :
        - Creates an Optional object containing a non-null value.
          Other-wise Throws: NullPointerException if the value provided is null.

    3.Optional.ofNullable(T value) :
        - Creates an Optional object containing the specified value.
          Other-wise if the value can be null, in that case, the Optional will be empty.
* */
public class OptionalBasicCoding {

    public static void main(String[] args) {

        /**
         *  Creating the Optional Object
         *  Need to use below there methods to create the Optional Objects in Java
         *  1.Optional.empty()
         *  2.Optional.of(T value)
         *  3.Optional.ofNullable(T value)
         * */
        //empty() method to create the Optional method.
        Optional<String> opt1 = Optional.empty();
        System.out.println("Opt1 = "+opt1);

        //of(T value) method to create the Optional method.
        Optional<String> opt2 = Optional.of("Hello");
        Optional<String> opt3 = Optional.of("");
        System.out.println("Opt2 = "+ opt2);
        System.out.println("Opt3 with empty value= "+ opt3);

        //ofNallable(T value) method to create the Optional method.
        Optional<String> opt5 = Optional.ofNullable("Java");
        System.out.println("Opt5 = "+ opt5);

    }
}
