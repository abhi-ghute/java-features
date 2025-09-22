package com.collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//covers List(I) methods as well as no new public method introduced in ArrayList
public class ArrayListEx {
    public static void main(String[] args) {

        List<String> list =
                new ArrayList<>(List.of("Abhi", "Ram", "Shya", "Om", "Madhav"));

        System.out.println(list);
        System.out.println("Adding element at 3rd index");
        list.add(3,"Kali");
        System.out.println(list);
    }
}
