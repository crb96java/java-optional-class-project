package com.optional.features;

import java.util.List;

import static java.util.Arrays.asList;

/*
 * In this examples we are going to learning about
 * 1.findFirst()
 * 2.get()
 * 3.orElse()
 * 4.orElseGet()
 * */
public class FindFirstGetorElseorElseGetMethods {

    public static void main(String[] args) {

        //Creating the List of String values
        List<String> list = asList("abc", "dcf", "mrf", "xyz", "bca", "adf");

        String firstValue = list.stream().findFirst().get();
        System.out.println("Find the First Element : " + firstValue);
        System.out.println();

        //check the conditions using filter()
        String findValue = list.stream().filter(l -> l.startsWith("b")).findFirst().get();
        System.out.println("Find the start with a : " + findValue);
        System.out.println();

        //use orElse() method
        String res = list.stream().filter(l -> l.startsWith("d")).findFirst().orElse(noValuePresent());
        System.out.println("Find the end with d : " + res);
        System.out.println();

        //if value is not present then need to add new value that required value
        String response = list.stream().filter(l -> l.contains("arun")).findAny().orElseGet(FindFirstGetorElseorElseGetMethods::noValueNotFinding);
        System.out.println(response);
        System.out.println();

        String responseDetails = list.stream().filter(l -> l.isEmpty()).findAny().orElseGet(() -> "Values is empty");
        System.out.println(responseDetails);
        System.out.println();

        System.out.println("Using method reference");
        String responseDetails1 = list.stream().filter(String::isEmpty).findAny().orElseGet(() -> "Values is empty");
        System.out.println(responseDetails1);
    }

    public static String noValuePresent() {
        System.out.println("orElse method called");
        return "No value present";
    }

    public static String noValueNotFinding() {
        System.out.println("orElseGet method called");
        return "Value not finding with Arun...";
    }
}
