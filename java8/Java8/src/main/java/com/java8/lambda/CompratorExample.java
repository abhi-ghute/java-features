package com.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class CompratorExample {

    public static void sortIntegers(){
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(205);
        al.add(102);
        al.add(98);
        al.add(275);
        al.add(203);
        System.out.println("Elements of the ArrayList " +
                "before sorting : " + al);

        // using lambda expression in place of comparator object for descending
        al.sort((o1, o2) -> o2.compareTo(o1));

        System.out.println("Elements of the ArrayList after" +
                " sorting : " + al);
    }

    public static void sortMap(){
        TreeMap<Integer, String> m =
                new TreeMap<Integer, String>((o1, o2) -> (o1 > o2) ?
                        -1 : (o1 < o2) ? 1 : 0);
        m.put(1, "Apple");
        m.put(4, "Mango");
        m.put(5, "Orange");
        m.put(2, "Banana");
        m.put(3, "Grapes");
        System.out.println("Elements of the TreeMap " +
                "after sorting are : " + m);
    }
}
