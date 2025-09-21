package com.java11;

public class StringMethods {

    public static void main(String[] args) {
        stringMethod();
        stringLine();
        stringStrip();
        stringRepeat();
    }

    private static void stringRepeat() {
        String greetings = "hello";
        System.out.println("----------------------");
        System.out.println("repeat(): "+greetings.repeat(3));
    }

    private static void stringStrip() {
        String unicode = "\u2003Hello\u2003";
        System.out.println("------------------------------------------");
        System.out.println("Strip methods:"+unicode);
        System.out.println("strip():"+unicode.strip());
        System.out.println("stripLeading():"+unicode.stripLeading());
        System.out.println("stripTrailing():"+unicode.stripTrailing());
    }

    private static void stringLine() {
        String log = "\n\nINFO: Start\nWARNING: Disk space low\nERROR: System crash\n\n";

        System.out.println("------------------------------------------");
        // Count no of lines
        //log.lines will return stream of lines with each new line
        long lineCount = log.lines()
                .count();
        System.out.println("No of lines in: "+lineCount);
    }

    static void stringMethod(){
        String name = "  \n \r ";
        System.out.println("------------------------------------------");
        //if contains at least one char other than whitespace will return true
        //isEmpty() will return true if string length is not zero
        System.out.println("isBlank() : "+name.isBlank());
    }
}
