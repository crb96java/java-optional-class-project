package com.optional.features;

import com.exceptions.NameValidationException;

import java.util.Optional;

/*
* In this class we are using orElseThrow() method
* T orElseThrow(Supplier<? extends X> exceptionSupplier) :
        - Returns the value wrapped by the Optional if present.
          Other-wise Throws an exception produced by the exceptionSupplier if the Optional is empty.

* */
public class OrElseThrowMethod {
    public static void main(String[] args) {

        String name = "Capgemini";

        //using orElseThrow() method
        try {
            String response = Optional.ofNullable(name).orElseThrow(() -> new NameValidationException("Company name not able to finding...."));
            System.out.println(response);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println();
        //using orElseThrow() method throwing some custom exception error
        String companyName = null;
        try {
            String response = Optional.ofNullable(companyName).orElseThrow(() -> new NameValidationException("Company name not able to finding...."));
            System.out.println(response);
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println();
        String myCity = null;
        try {
            String response = Optional.ofNullable(myCity).orElseThrow(() -> new Exception("My city not able to finding...."));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
