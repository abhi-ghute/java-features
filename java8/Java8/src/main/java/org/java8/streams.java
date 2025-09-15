package org.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class streams {
    public static void main(String[] args) {

        matchMethods();
        builderMethod();
        collectMethods();
        concatDemo();
        count();
        drop();
        filterMethod();
        findMethods();
        flatMap();
        flatMapToInt();
        flatMapToDouble();
        flatMapToLong();
        generateMethod();
        iterateMethod();
    }

    private static void iterateMethod() {

        //iterate without predicate
        List<Integer> list = Stream.iterate(1,n->n+2).limit(10).toList();
        System.out.println("iterate() without predicate: "+list);

        //iterate with predicate
        List<Integer> list1 = Stream.iterate(1,n->n<15,n->n+2).limit(10).toList();
        System.out.println("iterate() with predicate: "+list1);
    }

    private static void generateMethod() {
        Stream<String> helloStream = Stream.generate(() -> "Hello")
                .limit(5);

        System.out.println("Generate method: "+helloStream.toList());
    }

    private static void flatMapToLong() {
        List<long[]> timestamps = Arrays.asList(
                new long[]{1694512345678L, 1694512356789L},
                new long[]{1694512367890L}
        );

        LongStream longStream =  timestamps.stream()
                .flatMapToLong(Arrays::stream);

        System.out.println("LongStream(): "+Arrays.toString(longStream.toArray()));
    }

    private static void flatMapToDouble() {
        List<double[]> list = Arrays.asList(
                new double[]{1.1, 2.2},
                new double[]{3.3, 4.4},
                new double[]{5.5}
        );

        DoubleStream doubleStream = list.stream()
                .flatMapToDouble(Arrays::stream); // flatten to DoubleStream

        System.out.println("flatMaptToDoble: "+ Arrays.toString(doubleStream.toArray()));
    }

    private static void flatMapToInt() {
        List<int[]> list = Arrays.asList(
                new int[]{1, 2, 3},
                new int[]{4, 5},
                new int[]{6}
        );

        int[] arr = list.stream().flatMapToInt(Arrays::stream).toArray();
        System.out.println("flatMapToInt: "+Arrays.toString(arr));

        Stream<String> words = Stream.of("java", "spring jpa");

        int[] assciCodes = words.flatMapToInt(String::chars).toArray(); // chars() gives IntStream

        System.out.println("Each Char assci from the arrat of string: "+Arrays.toString(assciCodes));
    }

    private static void flatMap() {
        //flatmapWIth list of list
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D"),
                Arrays.asList("E", "F")
        );

        List<String> list = listOfLists.stream()
                .flatMap(List::stream)  // flatten inner lists
                .toList();
        System.out.println("FlatMap with list of list: " + list);

        //flatmap to convert list into list of each char
        List<String> list1 = Stream.of("java", "spring")
                .flatMap(s -> Arrays.stream(s.split("")))
                .toList();

        System.out.println("Split each word to one list from list of String : "+list1);

        Map<String,String> map = new HashMap<>();
        map.put("a","Abhi");
        map.put("b","ball");

        List<String> mapValues = map.values().stream().toList();
        System.out.println(mapValues);

        Map<String, Map<String, Integer>> outerMap = new HashMap<>();

        outerMap.put("Fruits", Map.of("Apple", 10, "Banana", 20));
        outerMap.put("Veggies", Map.of("Carrot", 15, "Potato", 25));

        Map<String, Integer> flattenMap = outerMap.values()
                .stream()
                .flatMap(m -> m.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));

        System.out.println("Flatten map from map of map: "+flattenMap);

    }

    private static void findMethods() {
        //findAny
        Optional<Integer> findAnyNormalStream = Stream.of(12, 45, 3, 1, 3123, 423).findAny();
        System.out.println("FindAny() with normal stream: " + findAnyNormalStream);

        Optional<Integer> findAnyParallelStream = Stream.of(12, 45, 3, 5, 3123, 43, 123).parallel().findAny();
        System.out.println("FindAny() with parallel stream: " + findAnyParallelStream);

        //findFirst
        Optional<Integer> findFirstNormalStream = Stream.of(12, 45, 3, 1, 3123, 423).findFirst();
        System.out.println("findFirst() with normal stream: " + findFirstNormalStream);

        Optional<Integer> findFirstParallelStream = Stream.of(12, 45, 3, 5, 3123, 43, 123).parallel().findFirst();
        System.out.println("findFirst() with parallel stream: " + findFirstParallelStream);

    }

    private static void filterMethod() {
        List<Integer> evenDivisibleBy3 = Stream.of(1, 2, 3, 4, 5, 6, 7, 12, 16)
                .filter(n -> n % 2 == 0)
                .filter(n -> n % 3 == 0).toList();

        System.out.println("filter Method: " + evenDivisibleBy3);
    }

    private static void drop() {
        List<Integer> result = Stream.of(1, 2, 4, 5, 6, 7, 8, 1, 2, 3, 4)
                .dropWhile(n -> n < 4).toList();

        System.out.println("dropWhile(): " + result);
    }

    private static void count() {
        long evenCount = Stream.of(1, 2, 3, 4, 5, 6)
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("even count using count() : " + evenCount);
    }

    private static void concatDemo() {
        List<Integer> num1 = Stream.of(1, 2, 3, 4, 5).toList();
        List<Integer> num2 = List.of(6, 7, 8, 9, 10);

        List<Integer> result = Stream.concat(num1.stream(), num2.stream()).toList();

        System.out.println("Concat using stream concat(Stream,Stream): " + result);
    }

    private static void collectMethods() {
        List<String> list = Stream.of("A", "B", "C")
                .collect(Collectors.toList());
        list.add("D");
        System.out.println("Using collect and Collectors: " + list);

        Set<Integer> set = Stream.of(1, 2, 3, 4, 5, 6)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("Using collect and Collectors: " + set);
    }

    private static void builderMethod() {
        Stream<String> stream = Stream.<String>builder().add("Abhi")
                .add("Ram")
                .add("Ajay")
                .build();

        System.out.println("Stream using builder: " + stream.toList());

    }

    static void matchMethods() {

        //allmatch
        List<Integer> nums1 = List.of(2, 4, 6, 8);
        boolean allMatch = nums1.stream().allMatch(n -> n % 2 == 0);
        System.out.println("allMatch(): " + allMatch);

        //anyMatch
        List<String> names = List.of("Abhi", "Sam", "Tom");
        boolean anyMatch = names.stream().anyMatch(s -> s.startsWith("A"));
        System.out.println("anyMatch() " + anyMatch);

        //noneMatch
        List<Integer> nums2 = List.of(1, 2, 3, 4);
        boolean noneMatch = nums2.stream().noneMatch(n -> n < 0);
        System.out.println("noneMatch() " + noneMatch);
    }
}
