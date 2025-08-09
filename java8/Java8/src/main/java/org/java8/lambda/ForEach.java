package org.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class ForEach {

    public static void forEachDemo(){

        List<String> names = Arrays.asList("Ajay", "OM", "Ram");

        System.out.println("For each to print names:");
        // Using forEach with lambda
        names.forEach(System.out::println);
    }
}
