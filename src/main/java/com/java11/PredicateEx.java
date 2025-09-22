package com.java11;

import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {

    public static void main(String[] args) {
        predicateNot();
    }

    private static void predicateNot() {

        List<String> list = List.of("Abhi","Ram","Shyam","","  ","Kali");

//        Predicate<String> p = (n) -> n.length() % 2 == 0;

        System.out.println("String with at least one valid chars");
        list.stream().filter(Predicate.not(String::isBlank)).forEach(System.out::println);

    }
}
