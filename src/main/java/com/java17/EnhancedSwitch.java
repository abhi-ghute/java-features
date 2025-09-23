package com.java17;

public class EnhancedSwitch {
    public static void main(String[] args) {

        int day = 4;
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6,7 -> "Weekend";
            default -> "Invalid day";
        };

        System.out.println(dayName);
    }
}
