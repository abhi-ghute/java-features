package com.java17;

public class TextBlocks {
    public static void main(String[] args) {
        //see closing delimiter it adjusting indentation for whitespaces
        String json = """
              {
                "name": "Alice",
                "age": 30,
                "city": "Wonderland"
             }
             """;
        System.out.println(json);

        String json2 = """
             {
                "name": "Alice",
                "age": 30,
                "city": "Wonderland"
             }
        """;
        System.out.println(json2);
    }
}
