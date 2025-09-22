package com.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileEx {

    public static void main(String[] args) throws IOException {
        writeStringMethod();
        readStringMethod();
        pathOfMethod();
    }

    private static void pathOfMethod() {
        Path path = Path.of("Demo","Demo/test","testing.txt");
        System.out.println(path);
    }

    private static void writeStringMethod() throws IOException {
        Path path = Path.of("Dummy.txt");
        System.out.println("writing content from file");
        Files.writeString(path,"Welcome to the java neo file using java11");
        System.out.println("Write operation completed");
    }

    private static void readStringMethod() throws IOException {
        Path path = Path.of("Dummy.txt");
        String s = Files.readString(path);
        System.out.println("Reading content from file");
        System.out.println(s);
        System.out.println("Reading file completed");
    }
}
