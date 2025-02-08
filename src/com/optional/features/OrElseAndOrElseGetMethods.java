package com.optional.features;

import java.util.Optional;

/*
* In this class using orElse() and orElseGet() methods and Method Reference also.
*   1.T orElse(T defaultValue) :
        - Returns the value wrapped by the Optional if present.
          Other-wise Returns: defaultValue if the Optional is empty.

    2.T orElseGet(Supplier<? extends T> supplier) :
        - Returns the value wrapped by the Optional if present.
          Other-wise Invokes the supplier function to provide an alternative value if the Optional is empty.
* */
public class OrElseAndOrElseGetMethods {

    public static void main(String[] args) {

        String myName = null;
        myName = Optional.ofNullable(myName).orElse("Name is null");
        System.out.println(myName);
        System.out.println();

        String myName2 = Optional.of(myName).orElseGet(() -> "Name is null");
        System.out.println(myName2);
        System.out.println();

        String companyName = "CG";
        String res = Optional.of(companyName).orElse(companyNameValidation());
        System.out.println(res);
        System.out.println();

        String response = Optional.of(companyName).orElseGet(()-> companyNameValidationError());
        System.out.println(response);
        System.out.println();

        System.out.println("Using method reference");
        String response1 = Optional.of(companyName).orElseGet(OrElseAndOrElseGetMethods::companyNameValidation);
        System.out.println(response1);
        System.out.println();

        String value = null;
        String optional = Optional.ofNullable(value).orElse("Hello");
        System.out.println(optional);
        System.out.println();

        String name = "Janu";
        String value2 = Optional.ofNullable(name).get();
        System.out.println(value2);



    }

    public static String companyNameValidation() {
        System.out.println("orElse method to find the Company Name");
        return "Name is null";
    }

    public static String companyNameValidationError() {
        System.out.println("orElseGet method to find the Company Name");
        return "Name is null";
    }
}
