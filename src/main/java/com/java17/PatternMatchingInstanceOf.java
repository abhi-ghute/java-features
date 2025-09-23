package com.java17;

import java.util.ArrayList;
import java.util.List;

public class PatternMatchingInstanceOf {
    public static void main(String[] args) {
        Object o = new String("Hello using pattern matching with instanceof");

        Object o1 = 10;

        if(o instanceof String s){
            System.out.println(s.length());
        }
        //this will fail as not able to use + with object but with
        //instanceof we can check weather its instance of it and also we can perform operations
        //System.out.println(o1+10);
        if(o1 instanceof Integer i){
            System.out.println(i+10);
        }
    }
}
