package com.collections.list;

import java.util.*;

//covers List(I) methods as well as no new public method introduced in ArrayList
public class ArrayListEx {
    public static void main(String[] args) {

        List<String> list =
                new ArrayList<>(List.of("Abhi", "Ram", "Shyam", "Om", "Madhav"));

        System.out.println(list);
        System.out.println("Adding element at 3rd index");
        list.add(3,"Kali");
        System.out.println(list);

        System.out.println("Adding collection at 2nd index");
        Collection<String> set = new HashSet<>();
        set.add("Ram");
        set.add("Shyam");
        set.add("Ghanshyam");
        list.addAll(2,set);
        System.out.println(list);

        System.out.println("get(index) :5");
        System.out.println(list.get(6));

        System.out.println("indexOf(shyam): "+ list.indexOf("Shyam"));
        System.out.println("lastIndexOf(shyam): "+ list.lastIndexOf("Shyam"));

        listIteratorMethod(list);

        System.out.println("Replacing 1 index element");
        list.set(1,"Jay");
        System.out.println(list);

        subListMethod();
        System.out.println(list);
        List<String> list1 = new ArrayList<>(list);
        System.out.println("equals() : "+list1.equals(list));
        list1.add("dummy");
        //List interface defines that two lists that are equal according to equals() must return the same hashCode().
        System.out.println("hashCode(): list1: "+list1.hashCode()
                +" list: "+list.hashCode());

        System.out.println("replaceAll to upperCase");
        list.replaceAll(String::toUpperCase);
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println("Natural sorting order: "+list);
        list.sort(Comparator.reverseOrder());
        System.out.println("Reverse Order:"+list);
    }

    private static void subListMethod() {
        System.out.println("Performing sublist on new list");
        List<String> list =
                new ArrayList<>(List.of("Abhi", "Ram", "Shyam", "Om", "Madhav"));

        System.out.println("Original list "+list);
        List<String> subList = list.subList(1,3);
        System.out.println("sublist(1,3) "+subList);
        System.out.println("updating 1st element from sublist and 5th from list");
        list.set(4,"Krishna");
        subList.set(0,"Shree Ram");
        System.out.println("Original: "+list);
        System.out.println("sublist: "+subList);
        //to avoid concurrentException
//        subList.add("Abhi");
//        System.out.println("Original: "+list);
//        System.out.println("sublist: "+subList);
////        list.add("Jay");// it updates the structure of original list
//       //list.remove(2);
//        System.out.println(list);
    }

    private static void listIteratorMethod(List<String> list) {
        ListIterator<String> itr = list.listIterator();

        System.out.println("Next: with nextIndex-nextElement");
        while (itr.hasNext()){
            System.out.print(itr.nextIndex()+"-"+itr.next()+" ");
        }

        System.out.println("\nprevious: with previousIndex-previousElement");
        while (itr.hasPrevious()){
            System.out.print(itr.previousIndex()+"-"+itr.previous()+" ");
        }

        itr = list.listIterator();
        System.out.println("\nset method Krishna for kali");
        while (itr.hasNext()){
            if(itr.next().equals("Kali")){
                itr.set("Krishna");
            }
        }
        System.out.println(list);

        itr = list.listIterator();
        System.out.println("add method kali when Krishna found");
        while (itr.hasNext()){
            if(itr.next().equals("Krishna")){
                itr.add("Kali");
            }
        }
        System.out.println(list);

        System.out.println("Iterator from index: 4");
        itr = list.listIterator(4);
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

    }
}
