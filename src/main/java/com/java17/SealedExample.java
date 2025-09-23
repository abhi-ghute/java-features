package com.java17;

import com.java17.sealed.Circle;
import com.java17.sealed.Rectangle;
import com.java17.sealed.Shape;
import com.java17.sealed2.Square;

public class SealedExample {
    public static void main(String[] args) {

        Shape circle = new Circle();
        circle.area(5);

        Rectangle rectangle = new Rectangle();
        rectangle.area(5,10);

        Shape square = new Square();
        square.area(5);
    }
}
