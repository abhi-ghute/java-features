package com.java17.sealed;

//we can use non-sealed class outside package
//but if its is sealed then it not allowed to use outside package
public non-sealed class Rectangle implements Shape {
    public void area(int l, int w) {
        System.out.println("Area of Rectangle:" + l*w);
    }

    @Override
    public void area(int r) {
        System.out.println("Area of square :"+r*r);
    }

}
