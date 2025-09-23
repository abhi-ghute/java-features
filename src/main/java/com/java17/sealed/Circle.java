package com.java17.sealed;

public final class Circle implements Shape {
    @Override
    public void area(int r) {
        System.out.println("Area of circle: "+3.14*r*r);
    }
}
