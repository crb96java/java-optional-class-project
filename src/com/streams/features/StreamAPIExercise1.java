package com.streams.features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
 *  In this class we are practicing below methods
 * 1.findFirst()
 * 2.get()
 * 3.orElse()
 * 4.orElseGet()
 * 5.orElseThrow()
 * */
public class StreamAPIExercise1 {
    public static void main(String[] args) {

        List<String> listOfNames = Arrays.asList("hello", "world", "jan", "mani", "god");
        Optional<String> response = listOfNames.stream().findFirst();
        System.out.println(response);

       // String res = listOfNames.stream().findFirst().get();

        System.out.println(response);

        String res  = listOfNames.stream().filter(l -> l.contains("arun")).findFirst().get().toUpperCase();
        System.out.println(Optional.ofNullable(res).orElse("Value is not available"));
    }
}
