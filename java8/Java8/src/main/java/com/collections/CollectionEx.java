package com.collections;

import java.util.*;

//collection interface methods
public class CollectionEx {
    public static void main(String[] args) {

        Collection<String> c = new ArrayList<>();
        Collection<String> set = new HashSet<>();
        System.out.println("Add and add all");
        set.add("Ram");
        set.add("Shyam");
        set.add("Ghanshyam");

        c.add("Abhi");
        c.add("Madhav");
        c.add("Krisna");
        c.add("Kali");
        c.add("Ram");
        c.add("Ram");
        c.addAll(set);

        System.out.println(c);
        System.out.println(set);
        System.out.println("Contains(): Abhi :"+ c.contains("Abhi"));
        System.out.println("ContainsAll():"+set+"in"+c+": "+c.containsAll(set));

        System.out.print("Clear(): ");
        set.clear();
        System.out.println(set);
        System.out.println(c);

        Collection<String> c2 = new ArrayList<>(c);
        System.out.println("c.equals(c2): c1:"+c.hashCode()+" c2:"+c2.hashCode()+
                " : "+c.equals(c2));

        System.out.println("hashCode(): "+c.hashCode());
        System.out.println("isEmpty(): "+c.isEmpty());

        System.out.println("iterator(): ");
        Iterator<String> itr = c.iterator();
        while (itr.hasNext()){
            String name = itr.next();
            if (name.equals("Ghanshyam"))
            {
                itr.remove();
            }
        }
        System.out.println("After removing Ghanshyam using iterator");
        System.out.println(c);

        System.out.println("remove() and removeall(set)");
        c.remove("Ram"); //remove only single element
        System.out.println("remove(Ram) "+c);
        set.add("Ram");
        set.add("Shyam");
        set.add("Ghanshyam");
        c.removeAll(set); //it will remove all occurrences from target collection
        System.out.println("removeall(set): "+c);

        System.out.println("RetainAll(set): ");
        c.addAll(set);
        c.retainAll(set);
        System.out.println(c);
        System.out.println("size() "+c.size());

        System.out.println("toArray()");
        Object[] obj = c.toArray();
        System.out.println("using Object[] return type "+ Arrays.toString(obj));

        String[] s = c.toArray(new String[0]);
        System.out.println("Using String[] :"+Arrays.toString(s));

        System.out.println("RemoveIf(): Ghanshyam :");
        c.removeIf(name->name.equals("Ghanshyam"));
        System.out.println(c);

        System.out.println("forEach() to print length:");
        c.forEach(name-> System.out.print(name.length()+" "));

        c.addAll(set);
        System.out.println("print using Stream");
        c.stream().forEach(name->System.out.print(name+" "));
        System.out.println("\nprint using parallel Stream");
        c.parallelStream().forEach(name->System.out.print(name+" "));
    }
}
