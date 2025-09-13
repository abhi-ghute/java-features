package org.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streams {
    public static void main(String[] args) {

        matchMethods();
        builderMethod();
        collectMethods();
        concatDemo();
        count();
        drop();
    }

    private static void drop() {
        List<Integer> result = Stream.of(1,2,4,5,6,7,8,1,2,3,4)
                .dropWhile(n->n<4).toList();

        System.out.println("dropWhile(): "+result);
    }

    private static void count() {
        long evenCount = Stream.of(1, 2, 3, 4, 5, 6)
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("even count using count() : "+evenCount);
    }

    private static void concatDemo() {
        List<Integer> num1 = Stream.of(1,2,3,4,5).toList();
        List<Integer> num2 = List.of(6,7,8,9,10);

        List<Integer> result = Stream.concat(num1.stream(),num2.stream()).toList();

        System.out.println("Concat using stream concat(Stream,Stream): "+result);
    }

    private static void collectMethods() {
        List<String> list = Stream.of("A","B","C")
                .collect(Collectors.toList());
        list.add("D");
        System.out.println("Using collect and Collectors: "+list);

        Set<Integer> set = Stream.of(1,2,3,4,5,6)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("Using collect and Collectors: "+set);
    }

    private static void builderMethod() {
        Stream<String> stream = Stream.<String>builder().add("Abhi")
                .add("Ram")
                .add("Ajay")
                .build();

        System.out.println("Stream using builder: "+stream.toList());

    }

    static void matchMethods(){

        //allmatch
        List<Integer> nums1 = List.of(2, 4, 6, 8);
        boolean allMatch = nums1.stream().allMatch(n->n%2 ==0 );
        System.out.println("allMatch(): "+allMatch);

        //anyMatch
        List<String> names = List.of("Abhi", "Sam", "Tom");
        boolean anyMatch = names.stream().anyMatch(s->s.startsWith("A"));
        System.out.println("anyMatch() "+anyMatch);

        //noneMatch
        List<Integer> nums2 = List.of(1, 2, 3, 4);
        boolean noneMatch = nums2.stream().noneMatch(n->n<0);
        System.out.println("noneMatch() "+noneMatch);
    }
}
