package com.java11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;

public class VarEx {
    public static void main(String[] args) {

        var name = "ChatGPT";
        System.out.println(name.getClass().getName());

        var list = List.of("Java", "Kotlin", "Scala");

        for (var item : list) {
            System.out.println(item.toUpperCase());
        }

        var studentMarks = new HashMap<String, List<Integer>>();
        var data = new ArrayList<String>();
    }
}
